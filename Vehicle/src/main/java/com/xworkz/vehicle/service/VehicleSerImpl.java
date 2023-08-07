package com.xworkz.vehicle.service;

import java.util.List;

import com.xworkz.vehicle.dto.VehicleDto;
import com.xworkz.vehicle.repo.VehicleRepo;
import com.xworkz.vehicle.repo.VehicleRepoImpl;

public class VehicleSerImpl implements VehicleServ{
	VehicleRepo repo = new VehicleRepoImpl();
	@Override
	public boolean save(VehicleDto dto) {
		if(dto!=null) {
			System.out.println("saved");
			return repo.save(dto);
		}
		return false;
	}
	@Override
	public VehicleDto findByName(String name) {
		if(name!=null) {
			System.out.println("finded");
			return repo.findByName(name);
		}
		return null;
	}
	@Override
	public VehicleDto findByConsumeAndPower(String consume, int power) {
		if(consume!=null) {
			if(power!=0) {
				System.out.println("findedby");
				return repo.findByConsumeAndPower(consume, power);
			}
		}
		return null;
	}
	@Override
	public boolean updateTypeByName(String type, String name) {
		if(type!=null) {
			System.out.println("updated");
			return repo.updateTypeByName(type, name);
		}
		return false;
	}
@Override
public boolean updateLaunchedInAndPowerById(int launchedIn, int Power, int id) {
	if(id!=0) {
		System.out.println("updated");
		return repo.updateLaunchedInAndPowerById(launchedIn, Power, id);
	}
	return false;
}
@Override
public boolean deleteBylaunchedIn(int launchedIn) {
	if(launchedIn>0) {
		System.out.println("deleted");
		return repo.deleteBylaunchedIn(launchedIn);
	}
	return false;
}
@Override
public List<VehicleDto> readAll() {
	System.out.println("readed");
	return repo.readAll();
}
	

}
