package com.p1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.p1.Customer;

@Component
public class Company {
	
	@Autowired
	private Customer customer;
	
	@Autowired
	private Dog dog;
	
	private String name="TCS PVT. LTD.";
	int pinCode=2039;
	
	
	@Override
	public String toString() {
		return "Company [name=" + name + ", pinCode=" + pinCode + "]";
	}
	
	public void printCustomer() {
		System.out.println(customer);
	}
	public void printDog() {
		System.out.println(dog);
	}
}
