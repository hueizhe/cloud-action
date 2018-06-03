package me.aboullaite.controller;

import com.cloud.cloudapiredis.model.User;
import com.cloud.cloudapiredis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/secure")
public class SecureController {

	@Autowired
	private UserService userService;

	@RequestMapping("/user/users")
	public String loginSuccess() {
		return "Login Successful!";
	}

	@PostMapping(value = "/user/email")
	public User findByEmail(@RequestBody String email) {
		return userService.findByEmail(email);
	}

	@PostMapping(value = "/user/update")
	public User updateUser(@RequestBody User user) {
		return userService.save(user);
	}
}
