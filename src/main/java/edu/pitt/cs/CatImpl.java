package edu.pitt.cs;

public class CatImpl implements Cat {

	
	int id;
	String name;
	boolean rented;	

	public CatImpl(int id, String name) {
		
		this.id = id;
		this.name = name;
		this.rented = false;
	}

	public void rentCat() {
		
		this.rented = true;
	}

	public void returnCat() {
	
		this.rented = false;
	}

	public void renameCat(String name) {
		
		this.name = name;
	}

	public String getName() {
		
		return this.name;
	}

	public int getId() {
		
		return this.id;
	}

	public boolean getRented() {
		
		return this.rented;
	}

	public String toString() {
		String ret = "ID ";
		ret += this.id + ". " + this.name;
		
		return ret;
	}

}