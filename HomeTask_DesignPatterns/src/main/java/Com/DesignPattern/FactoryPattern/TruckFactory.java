package Com.DesignPattern.FactoryPattern;

public class TruckFactory extends VehicleFactory {

	@Override
	public Vehicle createVehicle(String size) {
		
		if (size.equals("small"))
			return new SmallTruck();
		else if (size.equals("large")) 
			return new LargeTruck();
		
		return null;
	}

}

abstract class Truck extends Vehicle{
	String color;
	public void setColor(String color) {
		this.color=color;
	}
}

class SmallTruck extends Truck{
	String color;
	public void setColor(String color) {
		this.color=color;
	}
}

class LargeTruck extends Truck{
	String color;
	public void setColor(String color) {
		this.color=color;
	}
}
