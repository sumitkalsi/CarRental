package com.Rental.CarRental.Controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import com.Rental.CarRental.Models.Rental;
import com.Rental.CarRental.Services.RentalService;





@Controller
@RequestMapping("/rental")

public class RentalController {
	Long carid =0l;
	@Autowired
	private RentalService rs;
	
	@GetMapping("/addrental/{id}")
	public String rentalform(@PathVariable Long id , Model model) {
	carid = id;
	model.addAttribute("rental",new Rental());
	

		
		return "rentalform";
		
		
	}
	@PostMapping("/addrental")
	public String adduser(@ModelAttribute Rental rental ) {
		rental.setCarid(carid);
		System.out.println(rental);
		rs.addRental(rental);
		return "redirect:/";
	}
	


}
