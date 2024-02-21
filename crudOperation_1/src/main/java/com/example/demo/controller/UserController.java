package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	private UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/{id}")
	public UserEntity getById(@PathVariable long id) {
		return userService.getOneUser(id);

	}
	
	@GetMapping("u/{userName}")
	public UserEntity getByUserName(@PathVariable String userName) {
		return userService.getByUserName(userName);

	}


	@GetMapping
	public List<UserEntity> getAllUser() {
		List<UserEntity> allUser = userService.getAllUser();
		return allUser;

	}

	@PostMapping
	public String saveOneUser(@RequestBody UserEntity userEntity) {
		userService.saveOneUser(userEntity);
		return "Save Successfully !";

	}

	@PutMapping
	public String UpdateUser(@RequestBody UserEntity userEntity) {
		userService.updateOneUser(userEntity);
		return "Update successfully !";

	}

	@DeleteMapping("/{id}")
	public String DeleteById(@PathVariable long id) {
		userService.deleteOneUser(id);
		return "Delete successfully !";

	}

}
