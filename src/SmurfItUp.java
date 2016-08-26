
public class SmurfItUp {
public static void main(String[] args) {
	Smurf HandySmurf = new Smurf("Handy");
	Smurf Papa = new Smurf("Papa Smurf");
	Smurf fette = new Smurf("Smurfette");
	Smurf Keme = new Smurf("Kemestar");
	HandySmurf.eat();
	String hand =HandySmurf.getName();
	String Gender=HandySmurf.isGirlOrBoy();
	System.out.println(hand);
	System.out.println(Gender);
	String pappa =Papa.getName();
	
	String Gen =Papa.isGirlOrBoy();
	System.out.println(pappa);	
	System.out.println(Gen);
	String fettee =fette.getName();
	String gend =fette.isGirlOrBoy();
	System.out.println(fettee);
	System.out.println(gend);
	String star =Keme.getHatColor();
	String meme =Keme.getName();
	System.out.println("\n\n\n\n"+meme);
	System.out.println(star);
	
	
}
}
