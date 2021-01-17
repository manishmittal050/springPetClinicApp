package com.mmittal.springPetClinicApp.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
	
	
	public String printStr()
	{
		System.out.println("Inside printStr");
		return "Hello fox";
	}
	
	

}
