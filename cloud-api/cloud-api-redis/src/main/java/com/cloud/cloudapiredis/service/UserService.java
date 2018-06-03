package com.cloud.cloudapiredis.service;


import com.cloud.cloudapiredis.model.User;

public interface UserService {
	User save(User user);

	User findByEmail(String email);

}
