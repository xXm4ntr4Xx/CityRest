package com.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.repository.CityRepository;

@Controller
public class PageController {

	@Autowired
	CityRepository cityRepository;
	
	
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/list")//show list of cities
	@ResponseBody
	public String getCities() {
		
		return cityRepository.findAll().toString();//show list as string
	}
}
