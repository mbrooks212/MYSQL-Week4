import java.util.*;

public class Vehiclesort {
	
	public static void main(String[] args) {
		new Vehiclesort().run();
	}
	
	private void run() {
		boolean sortWithLambda = true;
		List<Vehicle> vehicles;
		String name;
	
		System.out.println("Before Change: " + Vehicle.getVehicles());
	
		if (sortWithLambda) {
			vehicles = sortWithLambda();
			name = "Lambda: ";
		}
		else {
			vehicles = sortWithMethodReference();
			name = "Method: ";
		}
		System.out.println(name + vehicles);
	}
	private List<Vehicle> sortWithMethodReference(){
		List<Vehicle> vehicles = Vehicle.getVehicles();
		vehicles.sort(Vehicle::compare);
		return vehicles;
	}
	private List<Vehicle> sortWithLambda(){
		List <Vehicle> vehicles = Vehicle.getVehicles();
		vehicles.sort((v1, v2) -> v1.compare(v2));
		return vehicles;
	}
	

		
	


}