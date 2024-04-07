package com.example.demo.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.UserService;
import com.example.demo.service.entity.Users;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/home")
public class HomeController {

	@Autowired
	UserService userService;
	
	@GetMapping("/users")
	public List<Users> getUser() 
	{
		List<Users> user=new ArrayList<Users>();
		log.info("getting users");
		user=userService.getUsers();
		if(user.isEmpty())
		{
			return null;
		}
		else
		{
			return user;
			
		}
	}
	@GetMapping("/current-users")
	public String getCurrent(Principal principl)
	{
		return "current login users ="+principl.getName();
	}
}
