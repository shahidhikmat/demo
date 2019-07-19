package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Hotel;
import com.example.demo.model.User;
import com.example.demo.repository.HotelRepository;

import com.example.demo.repository.UserRepository;



@RestController
public class ApplicationController {

	@Autowired
	HotelRepository hotels;
	@Autowired
	UserRepository users;
	
	@RequestMapping(value="/comments/moderation")
	 public @ResponseBody List<Hotel> moderateComments()
	{
		List<Hotel> hotel=(List<Hotel>) hotels.findAll();
		//System.out.println("hotel"+hotel);
		//model.addAttribute("hotels", hotels.findAll());
		//return hotel.;
		return hotel;
	}
	@RequestMapping(value="/admin/user")
	public @ResponseBody List<User> manageUsers()
	{   List<User> user=(List<User>) users.findAll();
	
		return user;
	}
	@RequestMapping(value="/admin/hotels")
	public @ResponseBody List<Hotel> manageHotels()
	{   List<Hotel> hotel=(List<Hotel>) hotels.findAll();


		return hotel;
	}
}
