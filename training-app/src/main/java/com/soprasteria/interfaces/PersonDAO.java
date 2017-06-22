package com.soprasteria.interfaces;

import com.soprasteria.models.PersonModel;

public interface PersonDAO {

	public PersonModel getPersonInfo(String email);
	public void updatePersonInfo(String email);
	public void insertUser(PersonModel personModel);
	
}
