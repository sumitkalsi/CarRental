package com.Rental.CarRental.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Rental.CarRental.Models.Car;
@Repository
public interface CarRepo extends JpaRepository<Car,Long >{

}
