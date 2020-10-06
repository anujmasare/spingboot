package com.home.h2Curd;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;



@RestController
public class UserController {

	@Autowired
	private UserService userServicea;
	

	@Autowired
	@Qualifier("b")
	private A a;
	
	@Autowired
	private B b;

	@GetMapping("/users")
	public List<UserBean> getAllUsers(
			@RequestHeader(value = "test", required = false,defaultValue = "test") String test, @RequestAttribute("visitorCounter") Integer counter) {
		a.print();
		System.out.println(b.om+"             "+B.om);
		B.om="ccc";
		System.out.println(b.om+"             "+B.om);
		System.out.println(test+"hearder    counter"+counter);
		return userServicea.getAllUsers();
	}
	
	//@RequestAttribute("visitorCounter") Integer counter
	@GetMapping("/users/{id}")
	public  Optional<UserBean> getSpecificUsers(@PathVariable("id") long id ) {
		try {int a=10/0;}catch(Exception e) {
		throw new ResponseStatusException(HttpStatus.BAD_GATEWAY, e.getMessage());}
		return userServicea.getSpecificUsers(id);
	}

	
	
	@PostMapping("/saveUsers")
	public  UserBean getSpecificUsers(@RequestBody UserBean user) {
		return userServicea.saveUsers(user);
	}
	

	@PutMapping("/updateUsers/{id}")
	public  UserBean update(@PathVariable("id")long id ,@RequestBody UserBean user) {
		return userServicea.updateUser(id,user);
	}
	
	
	@DeleteMapping("/deleteUsers")
	public  List<UserBean> deleteUser(@RequestBody UserBean user ) {
		return userServicea.deleteUser(user);
	}
	
	@DeleteMapping("/deleteUsers/{id}")
	public  List<UserBean> deleteUserbyId(@PathVariable("id")long id) {
		return userServicea.deleteUserbyId(id);
	}
	
	
	
	

}
















































