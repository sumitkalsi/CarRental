	package com.Rental.CarRental.Controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


import com.Rental.CarRental.Models.Car;
import com.Rental.CarRental.Services.CarService;





@Controller
@RequestMapping("/car")

public class CarController {
	@Autowired
	private  CarService cs;
	

	
	@GetMapping("/get/{id}")
		public String getcar(@PathVariable Long id,Model model) {
		
		model.addAttribute("car", cs.getCarById(id));
		
		return  "details";
	}
	
	@PostMapping("/addcar")
	public ResponseEntity<Car> addCar(@RequestBody Car car) {
		cs.addCar(car);
		return new ResponseEntity<>(car, HttpStatus.OK);
	}
	@PostMapping("/addall")
	public ResponseEntity<List<Car>> addall(@RequestBody List<Car> cars){
		cs.addCars(cars);
		return new ResponseEntity<List<Car>>(cars,HttpStatus.OK);
	}

	  @GetMapping
     public  String getAllCars(Model model) {
		  model.addAttribute("cars", cs.getAllCars());
		  return "cars";
	  }
	  
	  @PostMapping("/update")
	  public Car update(@RequestBody long id,@RequestBody Car car) {
		  return cs.updateCar(id, car);
	  }
	  
	
	  @DeleteMapping("/delete")
	  public void delete(@RequestBody long id) {
		  cs.deleteCar(id);
	  }
	  
	  @GetMapping("/view")
	public String gg() {
		  return "hello world";
	  }
	  
}
