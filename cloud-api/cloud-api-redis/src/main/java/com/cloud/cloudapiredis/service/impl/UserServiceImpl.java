package com.cloud.cloudapiredis.service.impl;

import com.cloud.cloudapiredis.dao.UserDao;
import com.cloud.cloudapiredis.model.User;
import com.cloud.cloudapiredis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public User save(User user) {
		return userDao.save(user);
	}

	public User findByEmail(String email) {
		return userDao.findByEmail(email);
	}
}
