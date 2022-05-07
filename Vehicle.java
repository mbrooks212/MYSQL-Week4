import java.util.*;
public class Vehicle {

	private String name;

	public String getName() {
		return name;
	}
	public String toString() {
		return name + " Vehicle";
	}
	public Vehicle(String name) {
		this.name = name;
	}
	public int compare(Vehicle that) {
		return this.name.compareTo(that.name);
	}
	private static final List<Vehicle> vehicles = List.of(
			new Vehicle("F-150"),new Vehicle("280zx"),new Vehicle("Boxster")
			,new Vehicle("Hummer")
			);
	
	public static List<Vehicle> getVehicles() {
		return new LinkedList<>(vehicles);
	}
	
}
