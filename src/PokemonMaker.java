
public class PokemonMaker {
public static void main(String[] args) {
	Pokemon Pikachu = new Pokemon("Lightning", "Lightning", "Pikachu", true);
	Pokemon Digglet = new Pokemon("Ground", "Ground", "Digglet", false);
	
	Pikachu.attack();
	Digglet.damage();
	Digglet.heal();
	Pikachu.attack();
	Digglet.feint();
	Pikachu.run();
}
}
