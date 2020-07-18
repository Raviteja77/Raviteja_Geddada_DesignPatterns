package Com.DesignPattern.FactoryPattern;

public abstract class VehicleFactory {

	public abstract Vehicle createVehicle(String item);
	
	public Vehicle orderVehicle(String size, String color)
	{
		Vehicle vehicle = createVehicle(size);
		
		vehicle.setColor(color);
		
		return vehicle;
	}
}

abstract class Vehicle {
	String color;
	public void setColor(String color) {
		this.color=color;
	}
	
}
