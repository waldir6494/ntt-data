package com.nttdata.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nttdata.app.models.entity.Customer;

@Configuration
public class ApplicationConfig {
	
	@Bean
	public List<Customer> listCustomer(){

		List<Customer> list = new ArrayList<>();
		Customer customer1 = new Customer(1,"Waldir","Ortiz","45744477");
		Customer customer2 = new Customer(2,"Pedro","Ramirez","46454411");
		
		list.add(customer1);
		list.add(customer2);
		return list;
		//List <Customer> newList = new ArrayList(customer1);
		//List<Integer> list = Lists.newArrayList(array);
		//return new newList;
		//return Arrays.asList(customer1, customer2);
	}

}
