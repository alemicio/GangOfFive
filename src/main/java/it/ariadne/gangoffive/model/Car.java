package it.ariadne.gangoffive.model;

public class Car{
	
	private String brand;
	private String model;
	private int seats;
	private String displacemnt;
	
	
	public Car(String brand, String model, int seats, String displacemnt) {
		super();
		this.brand = brand;
		this.model = model;
		this.seats = seats;
		this.displacemnt = displacemnt;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public String getDisplacemnt() {
		return displacemnt;
	}
	public void setDisplacemnt(String displacemnt) {
		this.displacemnt = displacemnt;
	}
	
	
	
}
