
public class Journey {
	int distance;
	String destination = "home";

	void travel() {
		System.out.println("I'm traveling " + distance + " miles to get to " + destination);

	}

	Journey(int distance, String destination) {
		this.distance = distance;
		this.destination = destination;
	}
	public static void main(String[] args) {
		Journey home = new Journey(78, "Home");
	home.travel();
		Journey uso;
//	System.out.println(uso.distance);
	}
}
