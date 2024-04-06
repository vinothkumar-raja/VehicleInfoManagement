package com.altimetrik.vehicle.data;

public class VehicleDTO {
	
	private Long id;
	
	private String model;

	private Integer make;
	
	private Integer year;
	
	private String vin;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Integer getMake() {
		return make;
	}
	public void setMake(Integer make) {
		this.make = make;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}

	
}
