package com.soprasteria.models;

public class PersonModel {
	
	private String name;
	private String surname;
	private String email;
	private int numTelefono;
	
	public PersonModel (){};
	public PersonModel (String name,String surname,String email, int 	numTelefono){		
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.numTelefono = numTelefono;		
	};
	
	@Override
	public String toString() {
				
		StringBuilder builder = new StringBuilder();
		
		builder.append("Name = ").append(name).append("\n")
		.append("Surname = ").append(surname).append("\n")
		.append("email = ").append(email).append("\n");
		.append("telefono = ").append(numTelefono).append("\n");
			
		return builder.toString();
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumTelefono() {
		return email;
	}
	public void setNumTelefono(int numTelefono) {
		this.numTelefono = numTelefono;
	}
	
}
