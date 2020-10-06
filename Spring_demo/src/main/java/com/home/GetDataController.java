package com.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.h2Curd.UserBean;

@RestController
public class GetDataController {

	@RequestMapping("/hello")
	public String getData() {
		return "Hello";
	}
	
	@RequestMapping("/")
	public String getData1() {
		return "Hello177777777777777777777";
	}
	
	

	@GetMapping("/hello2")
	public String getData2() {
		return "New Data";
	}
	
	@Autowired
	UserBean userBean1;
	
	@GetMapping("/hello3")
	public UserBean getDataBean() {
		return userBean1;//"New Data";
	}
}
