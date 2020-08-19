package com.fg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fg.dao.UsersDao;
import com.fg.entity.UsersEntity;

@Service
public class UsersService {
	
	@Autowired
	UsersDao usersDao;
	
    public List<UsersEntity> getUserByUseracc(String useracc) {
    	List<UsersEntity> usersList = usersDao.getOneByUseracc(useracc);
        return usersList;
    }
}