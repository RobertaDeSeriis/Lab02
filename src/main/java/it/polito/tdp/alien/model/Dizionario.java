package it.polito.tdp.alien.model;

import java.util.*;
import java.util.regex.Pattern;

public class Dizionario {
	List <Parola> parole;

	public Dizionario() {
		this.parole= new LinkedList <Parola>(); 
	} 
	
	public void add (String p, String t) {
		boolean  pp= Pattern.matches(("[A-Za-z]+"), p); 
		boolean  pt= Pattern.matches(("[A-Za-z]+"), t); //il più dietro indica una o pi lettere 
		
		if (pp && pt) {
			for (Parola pa: parole) {
				if(pa.nomeP.compareTo(p)==0) {
					pa.getTraduzioni().add(t); 
					return; // se non c'è deve uscire dall'if e aggiungere la traduzione
				}
			}
				
			
				Parola par= new Parola(p); 
				parole.add(par); 
				par.getTraduzioni().add(t); //aggiungo la traduzione corrispondente alla parola
				
					
			}
				
		}	
		
	
		
	public List <String> translate (String p) {
		for (Parola paro: parole) {
			if(paro.nomeP.compareTo(p)==0)
				return paro.getTraduzioni(); 
		}
		return null; 
	}
	}


