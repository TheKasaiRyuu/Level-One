
public class Lion {
	String name;
	String color;
	int pack;
	int age;
void loyalty(){
	System.out.println("My "+pack+" members say im loyal");
}
void intro(){
	System.out.println("My name is "+name+" my fur color is "+color+" I am "+age+" years old.");
}	
void roar(){
	System.out.println("Roaring");
}
void nap(){
	System.out.println("Napping");

}
void hunt(){
	System.out.println("Hunting");
}
Lion(String name, String color, int pack, int age){
	this.name = name;
	this.color = color;
	this.pack = pack;
	this.age = age;
}
}
