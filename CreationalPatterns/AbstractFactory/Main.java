package AbstractFactoryPattern;

public class Main {

	public static void main(String[] args) {
		
		//car factory
		AbstractFactory carFactory = VehicleFactory.getFactoryType("car");
		Vehicle vehicle =  carFactory.produceVehicle("sedan");
		vehicle.getName();

		carFactory = VehicleFactory.getFactoryType("car");
		vehicle =  carFactory.produceVehicle("hatchback");
		vehicle.getName();
		
		//bus factory
		AbstractFactory busFactory = VehicleFactory.getFactoryType("bus");
		Vehicle bus =  busFactory.produceVehicle("schoolbus");
		bus.getName();

		busFactory = VehicleFactory.getFactoryType("bus");
		bus =  busFactory.produceVehicle("publicbus");
		bus.getName();
		
		//bike factory
		AbstractFactory bikeFactory = VehicleFactory.getFactoryType("bike");
		Vehicle bike =  bikeFactory.produceVehicle("motorbike");
		bike.getName();

		bikeFactory = VehicleFactory.getFactoryType("bike");
		bike =  bikeFactory.produceVehicle("sportsbike");
		bike.getName();
				
	}

}
