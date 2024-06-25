package com.fullstack.spring_boot_data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fullstack.spring_boot_data.entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer>{

}
