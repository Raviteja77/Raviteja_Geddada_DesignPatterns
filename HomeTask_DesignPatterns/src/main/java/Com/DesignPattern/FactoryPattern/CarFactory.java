package Com.DesignPattern.FactoryPattern;

public class CarFactory extends VehicleFactory {

	@Override
	public Vehicle createVehicle(String size) {
		
		if (size.equals("small"))
			return new SportCar();
		else if (size.equals("large")) 
			return new SedanCar();
		
		return null;
	}
}

abstract class Car extends Vehicle{
	String color;
	public void setColor(String color) {
		this.color=color;
	}
}

class SportCar extends Car{
	String color;
	public void setColor(String color) {
		this.color=color;
	}
}

class SedanCar extends Car{
	String color;
	public void setColor(String color) {
		this.color=color;
	}
}
