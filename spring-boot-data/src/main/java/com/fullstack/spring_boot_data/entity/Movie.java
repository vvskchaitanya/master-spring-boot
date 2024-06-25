package com.fullstack.spring_boot_data.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="MOVIES")
public class Movie {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="MOVIE_ID")
	private Integer id;
	
	@Column(name="MOVIE_NAME")
	private String name;
	
	@Column(name="LANGUAGE")
	private String language;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
	
	
	
}
