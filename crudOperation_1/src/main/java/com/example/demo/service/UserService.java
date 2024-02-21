package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.UserEntity;

public interface UserService {
	// find by id
	UserEntity getOneUser(long id);
	
	// find by Username
		UserEntity getByUserName(String userName);

	
	// find all user
	List<UserEntity> getAllUser();
	
	//save one user
	void saveOneUser(UserEntity userEntity);
	
	//update one user
	void updateOneUser(UserEntity userEntity);
	
	//Delete one user
	void deleteOneUser(long id);

}
