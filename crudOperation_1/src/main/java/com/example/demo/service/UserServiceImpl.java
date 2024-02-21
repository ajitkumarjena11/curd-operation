package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserEntity getOneUser(long id) {
		Optional<UserEntity> byId = userRepository.findById(id);
		UserEntity userEntity = byId.get();
		return userEntity;
		// return userRepository.findById(id).get();
	}

	@Override
	public List<UserEntity> getAllUser() {
		List<UserEntity> allUserEntity = userRepository.findAll();
		return allUserEntity;
	}

	@Override
	public void saveOneUser(UserEntity userEntity) {

		userRepository.save(userEntity);
	}

	@Override
	public void updateOneUser(UserEntity userEntity) {

		userRepository.save(userEntity);
	}

	@Override
	public void deleteOneUser(long id) {

		userRepository.deleteById(id);

	}

	@Override
	public UserEntity getByUserName(String userName) {

		UserEntity userEntity = userRepository.findByuserName(userName);
		return userEntity;
	}

}
