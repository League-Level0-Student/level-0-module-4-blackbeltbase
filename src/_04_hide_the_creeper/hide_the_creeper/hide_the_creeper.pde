int creeperX = 400;
int creeperY = 400;
  PImage creeper; 
void setup() {
  size(1000,500);
 
    //at the top of your program
 //in draw method//in setup method  
}

void draw() {
  PImage minecraft = loadImage("minecraft.png");     //in setup method
minecraft.resize(width, height);          //in setup method
background(minecraft);
  creeper=loadImage("creeper.png");  
creeper.resize(50,50);//in setup method
image(creeper, creeperX, creeperY);
  if(mousePressed){
    if(mouseX < creeperX +50 && mouseX >creeperX && mouseY< creeperY+50 && mouseY > creeperY){
     fill( #05FF0F);
     println("you found the creeper");
    }
    else{
    fill(#FF0505);
    }
   ellipse(mouseX,mouseY, 30,30); 
  }
}
