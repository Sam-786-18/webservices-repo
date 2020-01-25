package com.springrestapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrestapi.service.UserService;
@RestController
@RequestMapping(value="users")
public class UserController {
	@Autowired
private UserService userService;
	//in these controller class called handler class
	@RequestMapping(value="getUser/{userId}",method=RequestMethod.GET)
	@ResponseBody
//produces the output int the form of json/xml the we can use this annotation
public String searchUser(@PathVariable("userId")Integer userId){
	String jsonUser=userService.searchUser(userId);
	return jsonUser;
	}
}
