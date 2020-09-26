package com.home.h2Curd;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/users")
	public List<UserBean> getAllUsers(
			@RequestHeader(value = "test", required = false) String test, @RequestAttribute("visitorCounter") Integer counter) {
		System.out.println(test+"hearder    counter"+counter);
		return userService.getAllUsers();
	}
	
	//@RequestAttribute("visitorCounter") Integer counter
	@GetMapping("/users/{id}")
	public  Optional<UserBean> getSpecificUsers(@PathVariable("id") long id ) {
		return userService.getSpecificUsers(id);
	}

	
	
	@PostMapping("/saveUsers")
	public  UserBean getSpecificUsers(@RequestBody UserBean user) {
		return userService.saveUsers(user);
	}
	

	@PutMapping("/updateUsers/{id}")
	public  UserBean update(@PathVariable("id")long id ,@RequestBody UserBean user) {
		return userService.updateUser(id,user);
	}
	
	
	@DeleteMapping("/deleteUsers")
	public  List<UserBean> deleteUser(@RequestBody UserBean user ) {
		return userService.deleteUser(user);
	}
	
	@DeleteMapping("/deleteUsers/{id}")
	public  List<UserBean> deleteUserbyId(@PathVariable("id")long id) {
		return userService.deleteUserbyId(id);
	}
	
	
	
	

}
















































