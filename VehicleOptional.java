import java.util.NoSuchElementException;
import java.util.Optional;

public class VehicleOptional {

	

		public static void main(String[] args) {
			new VehicleOptional().run();

		}

		private void run() {
			Vehicle vehicles = vehiclesMethod(Optional.of(new Vehicle("GTR")));
			System.out.println("I have a " + vehicles + ".");

			try {
				vehiclesMethod(Optional.empty());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		private Vehicle vehiclesMethod(Optional<Vehicle> vehicleOptional) {
			return vehicleOptional.orElseThrow(() -> new NoSuchElementException("The vehicle does not exist."));
		}

}
