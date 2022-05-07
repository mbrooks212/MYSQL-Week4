import java.util.stream.Collectors;

public class VehicleStreamer {

	
	public static void main(String[] args) {
		new VehicleStreamer().run();

	}

	private void run() {
		String names = Vehicle
				.getVehicles() 
				.stream() 										
				.map(p -> p.toString()) 						
				.sorted() 										
				.collect(Collectors.joining(", ")); 			
		System.out.println(names);
	}
}
