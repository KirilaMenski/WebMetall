package by.eftech.web_metall.count;

public interface Count {

	public double totalPrice(double diameter, double length, double density,
			int amount, double price);

	public double totalPrice(double x, double y, double h, double density,
			int amount, double price);

}
