
public class Pokemon {
String type;
String type2;
String Pkmn;
boolean hasTail;
void attack(){
	
	System.out.println(Pkmn + " used Tackle");
}
void run(){
	System.out.println(Pkmn + " ran away");
}
void heal(){
	System.out.println(Pkmn + " heals");
}
void damage(){
	System.out.println(Pkmn + " took damage");
}
void feint(){
	System.out.println(Pkmn + " feinted");
}

Pokemon(String type, String type2, String Pkmn, boolean hasTail){
	this.type = type;
	this.type2 = type2;
	this.Pkmn = Pkmn;
	this.hasTail = hasTail;
}



}
