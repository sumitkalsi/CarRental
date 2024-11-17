package com.Rental.CarRental.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity


public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private long id;
 private String brand;
 private String model;
 private int prize;
private String description;
 private String image;
 private boolean available;
 
 public int getPrize() {
	return prize;
}
public void setPrize(int prize) {
	this.prize = prize;
}
 
 public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public boolean isAvailable() {
	return available;
}
public void setAvailable(boolean available) {
	this.available = available;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public Car() {
	super();
	// TODO Auto-generated constructor stub
}
public Car(long id, String brand, String model, int prize, String description, String image, boolean available) {
	super();
	this.id = id;
	this.brand = brand;
	this.model = model;
	this.prize = prize;
	this.description = description;
	this.image = image;
	this.available = available;
}


 
 
 
}
