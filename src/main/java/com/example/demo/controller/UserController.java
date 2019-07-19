package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.UserRepository;

import com.example.demo.model.User;

@RestController
@RequestMapping(value="/users")
public class UserController {
	@Autowired
	UserRepository users;
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String newUser(@RequestBody User user) {
		users.save(user);
		//model.addAttribute("user", new User());
		return "ok";
	}

}
