  PImage donkey;
  PImage tail;
    import ddf.minim.*;          //at the very top of your sketch
AudioSample woohooSound;          //at the top of your sketch
boolean playSound = true;          //at the top of your sketch

 

boolean isStuck = false;
int stuckX;
int stuckY;
void setup() {
Minim minim = new Minim(this);     //In the setup method
woohooSound = minim.loadSample("homer-woohoo.wav");  
// put these lines where you want the sound to play
  size(550,406);
  donkey = loadImage("donkey.jpg");
  tail = loadImage("tail.png");
  tail.resize(100,100);
  image(tail,0,0);
}

void draw() {
 background(donkey);
 if(dist(0,0,mouseX,mouseY)<30){
    }
    else{
     rect(0,0,550,406); 
    }
 image(tail,mouseX-10, mouseY-20); 
 if(mousePressed){
   isStuck  = true;
   stuckX = mouseX;
   stuckY  = mouseY;
 }
 if(isStuck){
  image(tail, stuckX, stuckY);
 
  if(dist(454, 75, stuckX, stuckY) < 30){
playWin();
background(donkey);
  image(tail, stuckX, stuckY);
 }
 }
}

void playWin(){
 if (playSound) {
     woohooSound.trigger();
     playSound = false;
} 
}
