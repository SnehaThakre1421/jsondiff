package com.jsondiff.microservice.dto;

public class MicroserviceResponse {


//	private String name;
	private String city;
	private String Country;
	private String pincode;
	private String state;
//	public String getName() {
////		return name;
//	}
//	public void setName(String name) {
////		this.name = name;
//	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public MicroserviceResponse(String name, String city) {
		super();
//		this.name = name;
		this.city = city;
	}
	public MicroserviceResponse() {
		
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}


}
