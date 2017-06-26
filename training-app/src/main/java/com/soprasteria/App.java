package com.soprasteria;

import org.apache.log4j.Logger;

import com.soprasteria.controllers.PersonController;
import com.soprasteria.interfaces.PersonDAO;
import com.soprasteria.interfaces.impl.DefaultPersonDAO;
import com.soprasteria.models.PersonModel;
import com.soprasteria.views.PersonView;

/**
 * Hello world!
 *
 */
public class App
{
	final static Logger logger = Logger.getLogger(App.class);




	
	//commento di flavio
    



		//sono francesco fiorentino e sono stato qui!


	public static void main( String[] args ) {

		PersonModel personModel = getPersonFromDB(args[0]); //TODO qualche check su args[0]
		PersonView personView = new PersonView(personModel);
		PersonController personController = new PersonController(personView, personModel);

	// Secondo Commento prova Generoso
		personView.printInfo();

		//dal front la vista viene aggiornata --> aggiorniamo il model e poi il db
		personModel.setEmail("mario.rossi@gmail.com");
		//aggiorno la vista
		personController.updateView(personModel);
		personView.printInfo();
		//aggiorno il db
		updateUser(personModel);

    }

	private static void updateUser(PersonModel personModel) {
		// TODO Auto-generated method stub
	}

	//commento di flavio 2
	private static PersonModel getPersonFromDB(String email) {

		PersonDAO personDAO = new DefaultPersonDAO();
		return personDAO.getPersonInfo(email);
	}
}
