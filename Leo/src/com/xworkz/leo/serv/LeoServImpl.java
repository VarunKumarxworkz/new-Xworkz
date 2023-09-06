package com.xworkz.leo.serv;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.leo.dto.LeoDto;
import com.xworkz.leo.reepo.LeoRepo;

@Component
public class LeoServImpl implements LeoServ {
	@Autowired
	private LeoRepo repo;

	@Override
	public boolean save(LeoDto dto) {
		if (!doExist(dto.getHero())) {
			if (dto != null) {
				if (dto.getId() > 0) {
					if (dto.getHero().length() > 3) {
						if (dto.getVillan() != null) {
							if (dto.getMusicDirector() != null) {
								if (dto.getBudget() != 0) {
									if (dto.getDirector().length() > 3) {
										System.out.println("Leo Is Ready Now");
										repo.save(dto);
										return true;
									}
									System.out.println("Director Name is not valid");
									return false;
								}
								System.out.println("Budget is not valid");
								return false;
							}
							System.out.println("Music Director is not valid");
							return false;
						}
						System.out.println("Villan Is Null");
						return false;
					}
					System.out.println("Hero Name is not valid");
					return false;
				}
				System.out.println("Id is not Valid");
				return false;
			}
			System.out.println("Dto is not null");
			return false;
		}
		System.out.println("heroName is Already Exist");
		return false;
	}

	@Override
	public List<LeoDto> findByHeroName(String heroName) {
		System.out.println("this is find method 2");
		List<LeoDto> dto = repo.findByHeroName(heroName);
		if(dto!=null) {
			return dto;
		}
		System.out.println("dto is null");
		return null;
	}

	@Override
	public boolean doExist(String heroName) {
		if(findByHeroName(heroName)!=null) {
			System.out.println("given hero name is crt");
			return true;
		}
		return false;
	}

	



}
