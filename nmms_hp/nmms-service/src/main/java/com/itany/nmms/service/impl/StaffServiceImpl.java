package com.itany.nmms.service.impl;

import com.itany.nmms.constant.StatusConstant;
import com.itany.nmms.dao.StaffMapper;
import com.itany.nmms.ecxeption.CodeErrorException;
import com.itany.nmms.ecxeption.StaffNotExistException;
import com.itany.nmms.entity.Staff;
import com.itany.nmms.entity.StaffExample;
import com.itany.nmms.service.StaffService;
import com.itany.nmms.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
public class StaffServiceImpl implements StaffService {
    @Autowired
    private StaffMapper staffMapper;

    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)  /*查询方法的注释写法*/
    public Staff login(String username, String password, String role, String code, String image) throws CodeErrorException, StaffNotExistException {
        if(!code.equals(image)){
            throw new CodeErrorException("验证码不正确");
        }
        StaffExample example=new StaffExample();
        example.or()
                .andLoginNameEqualTo(username)
                .andPasswordEqualTo(MD5Util.md5(password))
                .andRoleEqualTo(role)
                .andIsValidEqualTo(StatusConstant.STAFF_IS_VALID_ENABLE);
        List<Staff> staffs = staffMapper.selectByExample(example);
        if(staffs.isEmpty()){
            throw new StaffNotExistException("用户名或密码不正确");
        }
        return staffs.get(0);
    }
}
