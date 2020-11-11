package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;

public abstract class Innlegg {
		
		protected int id; 
		protected String bruker; 
		protected String dato; 
		protected int likes;
		

		
	// TODO - deklarering av objektvariable
	
	public Innlegg(int id, String bruker, String dato) {
		
		this.id = id; 
		this.bruker = bruker;
		this.dato = dato; 
		likes = 0; 
		

		// TODO
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		this.id = id;
		this.bruker = bruker;
		this.dato = dato; 
		this.likes = likes; 
		
		// TODO - START
		
	
	}
	
	public String getBruker() {
		
		return bruker; 
		

	}

	public void setBruker(String bruker) {
		
		this.bruker = bruker; 
	
	}

	public String getDato() {
		
		return dato; 
		
	}

	public void setDato(String dato) {
		
		this.dato = dato; 
		
	}

	public int getId() {
		
		return id; 
	}

	public int getLikes() {
		
		
		return likes; 

	}
	
	public void doLike () {
		
		likes++; 
		
	}
	
	public boolean erLik(Innlegg innlegg) {
		
		if (id == innlegg.id) {
			return true; 
		} else {
			return false;
		}
		
		

	}
	
	@Override
	public String toString() {
		
			
		String str = id  + "\n" + bruker + "\n" + dato + "\n" + likes + "\n"; 
		return str; 
		
	
				
	}
	

		
}
