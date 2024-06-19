package com.vvsk.fullstack.spring_boot_web_starter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerExample {

    @GetMapping(value="/hello2")
	public String hello(Model model) {
		Employee e1 = new Employee();
		e1.id = 1;
		e1.name = "Chaitanya";
		e1.org = "Keystone";
		
		Employee e2 = new Employee();
		e2.id = 2;
		e2.name = "ABCD";
		e2.org = "MyOrg";
		
		model.addAttribute("e1",e1);
		model.addAttribute("e2",e2);
		return "employee";
	}

}
