package com.example.demo;

import java.util.List;

// Data for the company.
public class Company 
{
	private String name;// Name of the company.
	private String address;// Address of the company's office.
	private String phoneNumber;// Phone number of the company's office. 
	private String email;// Email of the company.
	private List<Product>products;// Products that the company sells.
	private List<Company>clients;// Clients of the company.
}
