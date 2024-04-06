package com.altimetrik.vehicle.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altimetrik.vehicle.data.VehicleDTO;
import com.altimetrik.vehicle.entity.Vehicle;
import com.altimetrik.vehicle.repository.VehicleRepository;

@Service
public class VehicleService {

	@Autowired
	VehicleRepository repository;

	public VehicleDTO getVehicle(Long id) {
		Optional<Vehicle> data = repository.findById(id);
		if(data.isPresent()) {
			convertEntityToDTO(data);
		}
	}

	private void convertEntityToDTO(Optional<Vehicle> byId) {
		
		
	}

	public List<VehicleDTO> getAllVehicle() {

	}

	public void deleteVehicle(Long id) {
		
	}

	public VehicleDTO createVehicle(VehicleDTO vehicleDTO) {

	}
	
	

}
