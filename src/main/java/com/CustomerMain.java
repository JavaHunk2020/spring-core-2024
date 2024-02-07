package com;

import com.p1.Customer;

public class CustomerMain {
	
	
	public static void main(String[] args) {
		//Customer is managed by whom ?? programmer
		Customer customer=new Customer();
		customer.setName("James Bond!");
		System.out.println(customer);
		customer=null;
	}

}
