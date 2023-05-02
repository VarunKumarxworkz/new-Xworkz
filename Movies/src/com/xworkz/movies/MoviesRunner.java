package com.xworkz.movies;

import com.xworkz.movies.dao.MoviesDao;
import com.xworkz.movies.dto.MoviesDto;

public class MoviesRunner {

	public static void main(String[] args) {
		
		MoviesDto dto = new MoviesDto("DOOM","Sanjay Gadhiv",35,"hrithick Roshan",47);
		MoviesDao dao = new MoviesDao();
		MoviesDto dto1 = new MoviesDto("DOOM","Sanjay Gadhiv",35,"hrithick Roshan",47);
		MoviesDto dto2= new MoviesDto(null,"Sanjay Gadhiv",35,"hrithick Roshan",47);
		
		
		dao.SaveMovies(dto);
		dao.SaveMovies(dto1);
		dao.SaveMovies(dto2);
		
		
		MoviesDto[] revf = dao.read();
		for(int i=0;i<revf.length;i++) {
			if(revf[i]!=null) {
				System.out.println(revf[i]);
			}
					}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
