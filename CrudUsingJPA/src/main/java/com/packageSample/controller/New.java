package com.packageSample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class New {

	@RequestMapping("/vaibhav")
	public String vaibhav()
	{
		return "vaibhav guptA";
	}
	
}
