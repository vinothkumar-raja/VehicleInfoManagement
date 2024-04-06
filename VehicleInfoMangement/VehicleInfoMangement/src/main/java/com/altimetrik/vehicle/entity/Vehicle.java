package com.altimetrik.vehicle.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema= "vehicle", name = "vehicles")
public class Vehicle {
	
	@Id
	private Long id;
	
	@Column(name="model")
	private String model;
	
	@Column(name="make")
	private Integer make;
	
	@Column(name="year")
	private Integer year;
	
	@Column(name="vin")
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
