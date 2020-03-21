package com.itany.nmms.service.impl;

import com.itany.nmms.constant.StatusConstant;
import com.itany.nmms.dao.StaffMapper;
import com.itany.nmms.entity.Staff;
import com.itany.nmms.entity.StaffExample;
import com.itany.nmms.exception.CodeErrorException;
import com.itany.nmms.exception.StaffNotExistException;
import com.itany.nmms.service.StaffService;
import com.itany.nmms.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/23 10:40
 * Description:
 * version:1.0
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffMapper staffMapper;

    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public Staff login(String loginName, String password, String role, String code, String image) throws CodeErrorException, StaffNotExistException {
        if(!code.equals(image)){
            throw new CodeErrorException("验证码不正确");
        }
        StaffExample example = new StaffExample();
        example.or()
                .andLoginNameEqualTo(loginName)
                .andPasswordEqualTo(MD5Util.md5(password))
                .andRoleEqualTo(role)
                .andIsValidEqualTo(StatusConstant.STAFF_IS_VALID_ENABLE);
        List<Staff> staffs = staffMapper.selectByExample(example);
        if(staffs.isEmpty()){
            throw new StaffNotExistException("账号或密码错误");
        }
        return staffs.get(0);
    }
}
