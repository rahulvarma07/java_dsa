
public class Flight2 {
	int id;
	String airline;
	String source;
	String destination;
	float fare;
	float duration;
	
	Flight2(){}
	
	Flight2(int id, String airline, String source, String destination, float fare, float duration){
		this.id = id;
		this.airline = airline;
		this.source = source;
		this.destination = destination;
		this.fare = fare;
		this.duration = duration;
	}
	public static void main(String args[]) {
		Flight2 flight = new Flight2(
				111, "Indigo", "Russia", "India", 25000.2f, 6.5f
				);
		System.out.println(flight.id);
		System.out.println(flight.airline);
		System.out.println(flight.source);
		System.out.println(flight.destination);
		System.out.println(flight.fare);
		System.out.println(flight.duration);
	}
}
