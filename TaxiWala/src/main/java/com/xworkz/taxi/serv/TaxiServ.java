package com.xworkz.taxi.serv;

import java.util.List;

import com.xworkz.taxi.dto.TaxiDto;

public interface TaxiServ {
	public boolean saveTaxi(TaxiDto dto);
	public List<TaxiDto> findTaxiByLocation(String Location);
	public boolean updateTaxiByEarning(int TaxiNo,int Earning);
	public boolean updateTaxiAvailableAndNoOftripsById(boolean isAvailable,int NoOfTrips,int Id);
	public List<TaxiDto> ReadAll();
}
