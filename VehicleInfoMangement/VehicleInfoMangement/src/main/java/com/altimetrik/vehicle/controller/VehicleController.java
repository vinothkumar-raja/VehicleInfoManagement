package com.altimetrik.vehicle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.altimetrik.vehicle.data.VehicleDTO;
import com.altimetrik.vehicle.service.VehicleService;

@RestController
public class VehicleController {
	
	@Autowired
	VehicleService service;
	
	@GetMapping(name = "getVehicle/{id}")
	public ResponseEntity<VehicleDTO> getVehicle(@PathVariable("id") Long id) {
		
		if(id!=null && id.longValue()>0) {
			return ResponseEntity.ok(service.getVehicle(id));
		}
		return null;
	}
	
	@GetMapping(name = "getAllVehicle")
	public ResponseEntity<List<VehicleDTO>> getAllVehicle() {
		return ResponseEntity.ok(service.getAllVehicle());
	}
	
	@PostMapping(name = "getVehicle/{id}")
	public ResponseEntity<VehicleDTO> createVehice(@RequestBody VehicleDTO vehicle) {
		
		if(vehicle != null) {
			return ResponseEntity.ok(service.createVehicle(vehicle));
		}
		
		return null;
	}
	
	@DeleteMapping(name = "delete/{id}")
	public ResponseEntity<String> deleteVehice(@PathVariable("id") Long id) {
		service.deleteVehicle(id);
		return ResponseEntity.ok("Vehicle Deleted Successfully!");
	}

}
