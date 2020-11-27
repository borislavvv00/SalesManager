package com.example.demo;

import java.util.List;

public class Manager implements Admin
{
	private String userName;// User name of the user.
	private String password;// Password of the user.
	private List<Product>products;// Products that the company sells.
	private List<Client>clients;// Clients of the company.
}
