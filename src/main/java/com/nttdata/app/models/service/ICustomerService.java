package com.nttdata.app.models.service;

import java.util.List;

import com.nttdata.app.models.entity.Customer;

public interface ICustomerService {
	public Customer save(Customer customer);
	public Customer show(long id);
	public List<Customer> all();
	public Customer update();
	public void delete(long id);

}
