package com.home.h2Curd;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//Service
@Service
public class UserService {

	// Autowire the UserRepository
	@Autowired
	private UserRepository userRepository;

	// getAllUsers Method
	public List<UserBean> getAllUsers() {
		return userRepository.findAll();
	}

	public  Optional<UserBean> getSpecificUsers(long id) {
		Optional<UserBean> user=userRepository.findById(id);
		return user;
	}
	public  UserBean saveUsers(UserBean userBean) {
		UserBean userbean= userRepository.save(userBean);
		return userbean;
	}
	public  UserBean updateUser(long id,UserBean userBean) {
		UserBean userbean= userRepository.save(userBean);
		return userbean;
	}

	public  List<UserBean> deleteUser(UserBean userBean) {
		userRepository.delete(userBean);
		return userRepository.findAll();
	}

	public  List<UserBean> deleteUserbyId(long id) {
		try {
			userRepository.deleteById(id);
		}catch (Exception e) {
			System.out.println(e);
		}
		return userRepository.findAll();
	}




}