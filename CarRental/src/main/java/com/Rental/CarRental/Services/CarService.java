package com.Rental.CarRental.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Rental.CarRental.Models.Car;
import com.Rental.CarRental.Repositories.CarRepo;



@Service

public class CarService {
	@Autowired
	private  CarRepo repo ;
	
	public Car addCar(Car car) {
		return repo.save(car);
		
	}
	
	 public Car getCarById(long id) {
	   	 Optional<Car> car = repo.findById(id);
	if (car.isPresent()) {
	       	 
	       	 
	            return car.get();
	        } else {
	               return null;
	        }
	

	 }
	 
	 public Car updateCar(long id ,Car upc) {
		 
		 Car c = getCarById(id);
		 if(c!=null) {
		 c.setBrand(upc.getBrand());
		 c.setModel(upc.getModel());
		 c.setAvailable(upc.isAvailable());
		 c.setDescription(upc.getDescription());
		 c.setImage(upc.getImage());
		 c.setPrize(upc.getPrize());
		 
		 return repo.save(c);
		 }
		 else {
			 return null;
		 }
	 }
	 
	 
	 
	  public void deleteCar(long id) {
	       repo.deleteById(id);
	   }
	 public List<Car> getAllCars(){
		 return repo.findAll();
	 }
	 public List<Car> addCars(List<Car> list){
		 return repo.saveAll(list);
	 }
	 
	 
	 
}
