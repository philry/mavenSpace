package com.itany.nmms.service;

import com.itany.nmms.ecxeption.CodeErrorException;
import com.itany.nmms.ecxeption.StaffNotExistException;
import com.itany.nmms.entity.Staff;

public interface StaffService {
    public Staff login(String username, String password, String role, String code, String image) throws CodeErrorException, StaffNotExistException;
}
