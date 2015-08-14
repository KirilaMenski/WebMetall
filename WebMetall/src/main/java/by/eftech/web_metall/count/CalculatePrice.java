package by.eftech.web_metall.count;

public class CalculatePrice {

	private int number;
	private double price;
	private double mass;
	private double diameter;
	private double length;
	private double density;
	private double totalMass;
	private double totalPrice;

	public CalculatePrice(int number, double price, double density, double diameter, double length) {
		this.number = number;
		this.price = price;
		this.density = density;
		this.diameter = diameter;
		this.length = length;
		
		mass = Math.PI * (Math.pow(diameter, 2) / 4) * length * density;
		totalMass = mass * number;
		totalPrice = totalMass * price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getMass() {
		return mass;
	}

	public void setMass(double mass) {
		this.mass = mass;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getDensity() {
		return density;
	}

	public void setDensity(double density) {
		this.density = density;
	}

	public double getTotalMass() {
		return totalMass;
	}

	public void setTotalMass(double totalMass) {
		this.totalMass = totalMass;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	

}
