package Com.DesignPattern.FactoryPattern;

public class MainImplementation {
	public static void main (String s[]) {
		VehicleFactory bikeFactory = new VehicleFactory() {			
			@Override
			public Vehicle createVehicle(String size) {
						
				if (size.equals("small"))
					return new MountainBike();
				else if (size.equals("large"))
					return new CityBike();		
						
				return null;
			}
		};
		Vehicle bike= bikeFactory.orderVehicle("large", "blue");
		System.out.println("bike.color:"+bike.color);
	}
}

abstract class Bike extends Vehicle{
	String color;
	public void setColor(String color) {
		this.color=color;
	}
}

class MountainBike extends Bike{
	String color;
	public void setColor(String color) {
		this.color=color;
	}
}

class CityBike extends Bike{
	String color;
	public void setColor(String color) {
		this.color=color;
	}
}