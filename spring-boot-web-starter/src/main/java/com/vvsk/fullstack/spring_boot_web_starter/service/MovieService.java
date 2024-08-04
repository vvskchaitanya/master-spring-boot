package com.vvsk.fullstack.spring_boot_web_starter.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vvsk.fullstack.spring_boot_web_starter.classes.Movie;
import com.vvsk.fullstack.spring_boot_web_starter.dataaccess.MovieDataLoader;

@Service
public class MovieService {
	
	MovieDataLoader movieDataLoader;
	
	public MovieService(MovieDataLoader movieDataLoader) {
		this.movieDataLoader = movieDataLoader;
		System.out.println("Spring Bean Type:Service = MovieService is created");
	}
	
	public List<Movie> getMovies(){
		System.out.println("Hello, Flow is inside MovieService");
		return this.movieDataLoader.getMovies();
	}
	
	public List<Movie> getMovies(String language){
		System.out.println("Hello, Flow is inside MovieService");
		return this.movieDataLoader.getMovies().stream().filter(m->m.getLanguage().equalsIgnoreCase(language)).toList();
	}
	
	public boolean addMovie(Movie movie) {
		this.movieDataLoader.getMovies().add(movie);
		return true;
	}

}
