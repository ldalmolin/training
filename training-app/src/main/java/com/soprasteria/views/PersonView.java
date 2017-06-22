package com.soprasteria.views;

import com.soprasteria.models.PersonModel;

public class PersonView {
	
	private PersonModel person;
	
	public PersonView(PersonModel person){
		this.person = person;
	}
	
	public void printInfo(){
		System.out.println(person.toString());
	}

	public PersonModel getPerson() {
		return person;
	}

	public void setPerson(PersonModel person) {
		this.person = person;
	}
	
}
