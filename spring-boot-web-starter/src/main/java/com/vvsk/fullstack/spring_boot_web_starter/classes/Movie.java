package com.vvsk.fullstack.spring_boot_web_starter.classes;

public class Movie {
	
	private String name;
	
	private String language;
	
	private String date;
	
	private int rating;
	
	private int views;
	
	

	public Movie(String name, String language, String date, int rating, int views) {
		super();
		this.name = name;
		this.language = language;
		this.date = date;
		this.rating = rating;
		this.views = views;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	@Override
	public String toString() {
		return "Movie [name=" + name + ", language=" + language + ", date=" + date + ", rating=" + rating + ", views="
				+ views + "]";
	}
	
	

}
