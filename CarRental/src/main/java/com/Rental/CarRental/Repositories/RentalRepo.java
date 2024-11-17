package com.Rental.CarRental.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Rental.CarRental.Models.Rental;
@Repository
public interface RentalRepo extends JpaRepository<Rental, Long>{

}
