package com.fullstack.spring_boot_data.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fullstack.spring_boot_data.entity.Movie;
import com.fullstack.spring_boot_data.repository.MovieRepository;

@RestController
public class MoviesApi {
	
	@Autowired
	MovieRepository repository;
	
	@GetMapping("/movies")
	public List<Movie> list(){
		return this.repository.findAll();
	}
	
	@PostMapping("/movies")
	public Movie add(@RequestBody Movie movie){
		return this.repository.save(movie);
	}
	
	@DeleteMapping("/movies")
	public void delete(@RequestParam int id){
		this.repository.deleteById(id);
	}
}
