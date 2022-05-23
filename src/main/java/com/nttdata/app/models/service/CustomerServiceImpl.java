package com.nttdata.app.models.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.app.models.entity.Customer;

@Service
public class CustomerServiceImpl implements ICustomerService {
	
	@Autowired
	public List<Customer> customers;
	
	@Override
	public Customer save(Customer customer) {
		Random random = new Random();
		customer.setId(random.nextLong(100000 - 0) + 0);
		this.customers.add(customer);
		return customer;
	}

	@Override
	public Customer show(long id) {
		try {
			return this.customers.stream()
					.filter(customer -> customer.getId() == id)
					.findFirst()
					.get();
		 } catch (Exception e) {
			 return new Customer();
		 }
		
	}

	@Override
	public List<Customer> all() {
		return this.customers;
	}

	@Override
	public Customer update() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long id) {
		this.customers.removeIf(customer -> customer.getId() == id);
	}

}
