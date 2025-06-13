
public class Flight1 {
	int id;
	String airline;
	String source;
	String destination;
	float fare;
	float duration;
	
	Flight1(){}
	
	public static void main(String args[]) {
		Flight1 flight = new Flight1();
		System.out.println(flight.id);
		System.out.println(flight.airline);
		System.out.println(flight.source);
		System.out.println(flight.destination);
		System.out.println(flight.fare);
		System.out.println(flight.duration);
	}
}
