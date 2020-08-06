package AbstractFactoryPattern;

public class CarFactory extends AbstractFactory{

	@Override
	public Vehicle produceVehicle(String vehicle) {
		if(vehicle.equalsIgnoreCase("sedan")){
			return new SedanCar();
		}else if(vehicle.equalsIgnoreCase("hatchback")){
			return new HatchbackCar();
		}
		return null;
	}
	
}
