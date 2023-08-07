package com.xworkz.vehicle.service;

import java.util.List;

import com.xworkz.vehicle.dto.VehicleDto;

public interface VehicleServ {
	public boolean save(VehicleDto dto);
	public VehicleDto findByName(String name);
	public VehicleDto findByConsumeAndPower(String consume,int power);
	public boolean updateTypeByName(String type,String name);
	public boolean updateLaunchedInAndPowerById(int launchedIn,int Power,int id);
	public boolean deleteBylaunchedIn(int launchedIn);
	public List<VehicleDto> readAll();
}
