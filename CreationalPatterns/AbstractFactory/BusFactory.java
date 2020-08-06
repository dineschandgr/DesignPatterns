package AbstractFactoryPattern;

public class BusFactory extends AbstractFactory{

	@Override
	public Vehicle produceVehicle(String vehicle) {
		if(vehicle.equalsIgnoreCase("schoolbus")){
			return new SchoolBus();
		}else if(vehicle.equalsIgnoreCase("publicbus")){
			return new PublicBus();
		}
		return null;
	}
	
}
