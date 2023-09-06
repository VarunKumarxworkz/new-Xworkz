package com.xworkz.taxi.serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.taxi.dto.TaxiDto;
import com.xworkz.taxi.repo.TaxiRepo;
@Component
public class TaxiServImpl implements TaxiServ {

	@Autowired
	private TaxiRepo repo;
	@Override
	public boolean saveTaxi(TaxiDto dto) {
		if(dto!=null) {
			if(dto.getId()>0) {
				if(dto.getTaxiNo()!=0) {
					if(dto.getEarnings()!=0) {
						if(dto.getLocation()!=null) {
							if(dto.getNoOfTrips()!=0) {
								System.out.println("Taxi is Ready");
								repo.saveTaxi(dto);
								return true;
							}
							System.out.println("Trips is Not valid ");
							return false;
						}
						System.out.println("location is Null ");
						return false;
					}
					System.out.println("Earning is Not valid ");
					return false;
				}
				System.out.println("TaxiNo is Not valid ");
				return false;
			}
			System.out.println("Id is Not valid ");
			return false;
		}
		System.out.println("Dto is not null");
		return false;
	}
	@Override
	public List<TaxiDto> findTaxiByLocation(String Location) {
		if(Location!=null) {
			System.out.println("Taxi is Arraiving there");
			return repo.findTaxiByLocation(Location);
		}
		return null;
	}
	@Override
	public boolean updateTaxiByEarning(int TaxiNo, int Earning) {
		if(TaxiNo!=0) {
			if(Earning!=0) {
				System.out.println("TaxiNo Updated");
				return repo.updateTaxiByEarning(TaxiNo, Earning);
			}
		}
		return false;
	}
	@Override
	public boolean updateTaxiAvailableAndNoOftripsById(boolean isAvailable, int NoOfTrips, int Id) {
		if(Id>0) {
			System.out.println("Available is updated");
			return repo.updateTaxiAvailableAndNoOftripsById(isAvailable, NoOfTrips, Id);
		}

		return false;
	}
	@Override
	public List<TaxiDto> ReadAll() {
		System.out.println("Readed All");
		return repo.ReadAll();
	}
	

}
