package com.vvsk.fullstack.spring_boot_web_starter.controllers;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerExample {

    @RequestMapping(value="/hello",produces="text/html")
	public String hello() {
		return "<h1>Hello World, This is my first RestController<h1>";
	}
}
