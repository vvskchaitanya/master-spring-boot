package com.vvsk.fullstack.spring_boot_web_starter.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vvsk.fullstack.spring_boot_web_starter.dataaccess.Movie;
import com.vvsk.fullstack.spring_boot_web_starter.service.MovieService;

@RestController
public class MoviesRestController {
	
	@Autowired
	MovieService service;
	
	
	
	@RequestMapping("/movies/add")
	public String add(@RequestBody Movie movie) {
		
		System.out.println("Adding Movie "+movie);
		this.service.addMovie(movie);
		return "SUCCESS";
		
	}
	
	@RequestMapping("/movies/fetch")
	public List<Movie> fetch() {
		
		return this.service.getMovies();
		
	}
	
	@RequestMapping("/movies/query")
	public List<Movie> query(@RequestParam String language) {
		return this.service.getMovies(language);
		
	}

}
