package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Tekst extends Innlegg {

	// TODO: objektvariable 
	
	protected String tekst; 
	
	
	
	public Tekst(int id, String bruker, String dato, String tekst) {
		
		super(id, bruker, dato); 
		this.tekst = tekst; 
		
	
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		
		super(id, bruker, dato, likes); 
		this.tekst = tekst; 
		

	}
	
	public String getTekst() {
		
		return tekst; 

	}

	public void setTekst(String tekst) {
		
		this.tekst = tekst; 
		
		
	}

	@Override
	public String toString() {
		
		String str = ("TEKST" + "\n" + id  + "\n" + bruker + "\n" + dato + "\n" + likes + "\n" + "en tekst" + "\n"); 
		return str; 
		

	}
				
	}

