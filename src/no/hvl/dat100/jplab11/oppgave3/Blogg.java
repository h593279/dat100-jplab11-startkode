package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {
	
	protected Innlegg[] innleggtabell;
	protected int nesteledige; 

	// TODO: objektvariable 

	public Blogg() {
		innleggtabell = new Innlegg[20];
		nesteledige = 0; 
		
		
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
		nesteledige = 0; 
	
		
	}

	public int getAntall() {
	
		return nesteledige; 
		
	
	}
	
	public Innlegg[] getSamling() {
		
		return innleggtabell; 
		
		

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		
		for (int i = 0; i < nesteledige; i++) {
			if(innlegg.erLik(innleggtabell[i])) {
				return i; 
			}
		}
		return -1; 
		
	}

	public boolean finnes(Innlegg innlegg) {
		
		boolean finnes = false; 
		
		if (finnInnlegg(innlegg) != -1 ) { 
			finnes = true; 
		}
			
		return finnes; 
		
		
	}

	public boolean ledigPlass() {
		
		boolean ledig = false; 
		
		if (nesteledige < innleggtabell.length) {
			ledig = true; 
		}
		
		return ledig; 
		
		//den logiske tabellen (nesteledige), kan aldri være større enn den fysiske tabellen (innleggtabell)
		

	}
	
	public boolean leggTil(Innlegg innlegg) {

		boolean leggtil = false; 
		
		if (!finnes(innlegg))
			innleggtabell[nesteledige] = innlegg; 
			nesteledige++; 
				leggtil = true;
		
		return leggtil; 
	}
	
	public String toString() {
		
		String utskrift = nesteledige + "\n"; 

		for (int i = 0; i < nesteledige; i++) {
			utskrift += innleggtabell[i].toString(); 
		}
		return utskrift; 
		
		
		
		
	}

	
}