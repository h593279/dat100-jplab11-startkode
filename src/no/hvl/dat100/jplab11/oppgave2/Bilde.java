package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;

public class Bilde extends Tekst {
	
	protected String url; 

	// TODO - objekt variable
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		
		super (id, bruker, dato, tekst); 
		this.url = url;  
		
		
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		
		super (id, bruker, dato, likes, tekst); 
		this.url = url;  
		
	}
	
	public String getUrl() {
		
		return url; 

	}

	public void setUrl(String url) {
		
		this.url = url; 
	}

	@Override
	public String toString() {
		
		String str = "BILDE" + "\n" + id  + "\n" + bruker + "\n" + dato + "\n" + likes + "\n" + "et bilde" + "\n" + url + "\n";  
		return str; 

				
	}
}
