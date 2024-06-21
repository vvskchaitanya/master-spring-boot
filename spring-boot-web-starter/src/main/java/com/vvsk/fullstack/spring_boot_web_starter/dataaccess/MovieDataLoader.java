package com.vvsk.fullstack.spring_boot_web_starter.dataaccess;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

import org.springframework.stereotype.Component;

@Component
public class MovieDataLoader {
	
	List<Movie> movies = new ArrayList<Movie>();
	
	public MovieDataLoader(){
		
		try {
			this.loadMovies();
			
		}catch(IOException ioe) {
			System.out.println("Unable to load the movies data from file");
		}
		System.out.println("Spring Bean Type:Component = MovieDataLoader is created");
	}
	
	public void loadMovies() throws IOException {
		
		List<String> moviesdata = Files.readAllLines(Paths.get("C:\\Users\\lenovo\\Desktop\\JAVA_FULLSTACK\\spring-boot-web-starter\\spring-boot-web-starter\\src\\main\\resources\\movies.txt"));
		
		moviesdata.forEach(m->{
			
			String[] mdata = m.split(",");
			Movie movie = new Movie(mdata[0],mdata[1],mdata[2],Integer.parseInt(mdata[3]),Integer.parseInt(mdata[4]));
			
			System.out.println("Loading Movie "+movie);
			movies.add(movie);
			
		});
	}

	public List<Movie> getMovies() {
		System.out.println("Hello, Flow is inside Data Access");
		return movies;
	}
	
	

}
