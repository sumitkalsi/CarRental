package com.Rental.CarRental.Services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Rental.CarRental.Models.Rental;
import com.Rental.CarRental.Repositories.RentalRepo;



@Service

public class RentalService {
	@Autowired
	 RentalRepo repo;
	
	public Rental addRental(Rental rental) {
		return repo.save(rental);
	}
	
	
	
	
	public Rental getRentalById(Long id) {
		Optional<Rental>op = repo.findById(id);
		if(op!=null) {
			return op.get();
		}else {
			return null;
		}
	}
	
	public Rental updateRentalById(Long id , Rental rental) {
		Rental ur = getRentalById(id);
		if (ur!=null) {
			ur.setCarid(rental.getCarid());
			ur.setEnddate(rental.getEnddate());
			ur.setRentalname(rental.getRentalname());
			ur.setStartdate(rental.getStartdate());
			
			return repo.save(ur);
		}else {
			return null;
		} 
	}
	
	public void deleteRental(Long id) {
		repo.deleteById(id);
	}
	
	public List<Rental> getAllRentals(){
		return (List<Rental>)repo.findAll();
	}
	

	
	

}
