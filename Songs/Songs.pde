import ddf.minim.*;       
Minim minim = new Minim(this); 
/**
 We're going to use BANANAS to stop and start songs. Different bananas will play different songs.
 If you haven't used the Makey Makey before, check out this guide before you start: http://makeymakey.com/howto.php
 
 1. Download a song from YouTube using: youtube-mp3.org
 2. Plug the Makey Makey into the bananas.
 3. Finish the Processing code below so that touching a banana will start and stop a song.
 **/

AudioPlayer Smash;              //1. Change to the name of your song
AudioPlayer T;
boolean SmashIsStopped = true;  

void loadSongs() {
  Smash = minim.loadFile("Smash.mp3");  //2. Drop mp3 onto this sketch and put its name here
  T = minim.loadFile("T.mp3");
}

void keyPressed() {

  if (keyCode == UP) {
    if (SmashIsStopped==true) {
      playSong(Smash);
      SmashIsStopped= false;
    } else {
      stopSong(Smash);
      SmashIsStopped=true;
    }
  }
  if (keyCode == DOWN) {
    if (SmashIsStopped==true) {
      playSong(T);
      SmashIsStopped= false;
    } else {
      stopSong(T);
      SmashIsStopped=true;
    } 
  }

  /* 5. Add other songs for the other bananas. keyCode will tell you which banana was pressed. */
  println("you pressed " + keyCode);
}

void playSong(AudioPlayer song) {
  song.play();
}

void stopSong(AudioPlayer song)
{
  song.pause();
}

void draw() {
}

void setup() {
  loadSongs();
}



