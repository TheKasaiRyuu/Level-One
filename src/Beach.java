
public class Beach {
String location;
boolean waves;
boolean nudeBeach;
int grainsOfSand;
	
void bolleyBall(){
	System.out.println("Playing BolleyBall at " + location);
}
void sandCastle(){
	if(grainsOfSand > 150){
		System.out.println("Yay you successfully built a castle!");
		grainsOfSand=grainsOfSand-150;
	}
	else{
		System.out.println("It seems like you can't build a castle :'(");
	}
}
void Nudes(){
	if(nudeBeach == true && waves == false){
		System.out.println("Only you are naked here!!");
	}
	else if(nudeBeach == true){
		System.out.println("There are naked people... is that weird???");
	}
	else{
		System.out.println("There are no naked people...");
	}
}


Beach(String location, boolean waves, boolean nudeBeach, int grainsOfSand){
	this.location=location;
	this.waves=waves;
	this.nudeBeach=nudeBeach;
	this.grainsOfSand=grainsOfSand;
}




}
