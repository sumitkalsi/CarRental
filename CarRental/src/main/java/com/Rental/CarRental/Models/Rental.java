package com.Rental.CarRental.Models;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity

public class Rental {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long carid;
	private String rentalname;
	private String phone;
	private String startdate;
	private String enddate;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCarid() {
		return carid;
	}
	public void setCarid(Long carid) {
		this.carid = carid;
	}
	public String getRentalname() {
		return rentalname;
	}
	public void setRentalname(String rentalName) {
		this.rentalname = rentalName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public Rental(Long id, Long carid, String rentalName, String phone, String startdate, String enddate) {
		super();
		this.id = id;
		this.carid = carid;
		this.rentalname = rentalName;
		this.phone = phone;
		this.startdate = startdate;
		this.enddate = enddate;
	}
	public Rental() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Rental [id=" + id + ", carid=" + carid + ", rentalname=" + rentalname + ", phone=" + phone
				+ ", startdate=" + startdate + ", enddate=" + enddate + "]";
	}
	
	
	

}
