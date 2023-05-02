package com.xworkz.movies.dao;

import com.xworkz.movies.dto.MoviesDto;

public class MoviesDao {

	MoviesDto[] movie = new MoviesDto[10]; 
	
	public MoviesDto[] SaveMovies(MoviesDto dto) {
		
		if(dto!=null) {
		for(int i=0;i<movie.length;i++) {
			if(movie[i]==null) {
				movie[i] = dto;
				System.out.println("dto is null so we can initialize the value");
				return movie; 
			}
			System.out.println("value is not null check the value");
			return movie;
		}

			
		}
		System.out.println("dto is null check the value");
		return movie;
		
	}
	
	public MoviesDto[] read() {
		return movie;
	
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

