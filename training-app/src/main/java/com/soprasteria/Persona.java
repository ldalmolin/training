package Stipendio;

//classe per la definizione dei parametri di una generica persona

// Generoso ha inserito un commento
public class Persona {

	//parametri: nome ed indirizzo
	private String nome;
	private String indirizzo;

	////////////////////Costruttore/////////////////////////////////
	Persona(String nome, String indirizzo){
		this.nome=nome;
		this.indirizzo=indirizzo;
	}

	/////////////////Metodi Getters e Setters/////////////////////
	//la variabile nome una volta assegnata non pu� essere modificata,
	//a differenza invece dell'indirizzo
	public String getNome(){
		return nome;
	}

	public String getIndirizzo(){
		return indirizzo;
	}

	public void setIndirizzo(String ind){
		indirizzo=ind;
	}
	///////////////////Fine metodi GETTERS AND SETTERS/////////////
}
