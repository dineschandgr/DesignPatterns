package AbstractFactoryPattern;

public class BikeFactory extends AbstractFactory{

	@Override
	public Vehicle produceVehicle(String vehicle) {
		if(vehicle.equalsIgnoreCase("motorbike")){
			return new MotorBike();
		}else if(vehicle.equalsIgnoreCase("sportsbike")){
			return new SportsBike();
		}
		return null;
	}
	
}
