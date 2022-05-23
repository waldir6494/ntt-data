package com.nttdata.app.models.entity;

public class Customer {

	private long id;
	private String name;
	private String surname;
	private String dni;

	public Customer() {

	}

	public Customer(long id, String name, String surname, String dni) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.dni = dni;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

}
