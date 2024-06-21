package com.vvsk.fullstack.spring_boot_web_starter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.vvsk.fullstack.spring_boot_web_starter.service.MovieService;

@Controller
public class MovieController {
	
	MovieService movieService;
	
	public MovieController(MovieService movieService) {
		this.movieService = movieService;
		System.out.println("Spring Bean Type:Controller = MovieController is created");
	}
	
	@GetMapping("/movies")
	public String movies(Model model) {
		System.out.println("Hello, Flow started with MovieController");
		model.addAttribute("movies", this.movieService.getMovies());
		return "movies";
	}
	

}
