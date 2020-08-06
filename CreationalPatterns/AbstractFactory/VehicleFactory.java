package AbstractFactoryPattern;

public class VehicleFactory {
	
	public static AbstractFactory getFactoryType(String type){
		
		if(type.equalsIgnoreCase("car")){
			return new CarFactory();
		}else if(type.equalsIgnoreCase("bus")){
			return new BusFactory();
		}else if(type.equalsIgnoreCase("bike")){
			return new BikeFactory();
		}
		
		return null;
	}
}
