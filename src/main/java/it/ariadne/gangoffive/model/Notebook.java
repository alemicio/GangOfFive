package it.ariadne.gangoffive.model;

public class Notebook implements Resource{

	private String id;

	public String getId() {
		
		return id;
	}

	public String filter() {
		return "SELECT FROM WHERE";//da modificare 
	}

}
