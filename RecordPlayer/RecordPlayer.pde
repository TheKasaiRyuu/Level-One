import ddf.minim.*;
PImage pictureOfRecord;
int angle = 0;
Minim minim;
AudioPlayer song;
int increase = 8;
void setup() {
size(1024, 768);
pictureOfRecord= loadImage("record.jpg");
minim = new Minim(this);
song = minim.loadFile("awesomeTrack.mp3", 512);

}

void draw(){
if(mousePressed){
angle = angle + 8;
increase = increase +2;
song.play();
}
else{
song.pause();  
}
image(pictureOfRecord, 0, 0);
rotateImage(pictureOfRecord, angle);
image(pictureOfRecord, 0, 0);
}

void rotateImage(PImage image, int amountToRotate) {
      translate(width/2, height/2);
      rotate(amountToRotate*TWO_PI/360);                              
      translate(-image.width/2, -image.height/2);
 
}


