package it.polito.tdp.alien.model;

import java.util.*;

public class Parola {
	String nomeP; 
	List <String> traduzioni= new LinkedList <String>(); //lista di traduzioni
	
	public Parola(String nomeP) {
		this.nomeP = nomeP;
	}

	public List<String> getTraduzioni() {
		return traduzioni;
	} 

	
	

}
