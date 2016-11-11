
public class Testlol {
public static void main(String[] args) {

	Beach Cancoon = new Beach("Cancoon", true, false, 9999);
	Beach Backyard = new Beach("Backyard", false, true, 10);
	Cancoon.bolleyBall();
	for(int i = 0;i <78;i++){
		Cancoon.sandCastle();
	}
	Backyard.Nudes();
	Backyard.sandCastle();
	
	SeaCreatures SpongeBob = new SeaCreatures("SpongeBob");
	SpongeBob.eat();
	SpongeBob.laugh();
	SeaCreatures Patrik = new SeaCreatures("Patrick");
	SeaCreatures Squidward = new SeaCreatures("Squidward");
	String name = Patrik.getName();
	System.out.println(name);
	Patrik.eat();
	Patrik.laugh();
	String names = Squidward.getName();
	System.out.println(names);
	Squidward.eat();
	Squidward.laugh();
	
}
}
