  PImage face;
  int pupilX = 400;
int pupilY = 300;
int topY = 310;
int bottomY = 350;
int rightX = 290;
int leftX = 210;
void setup() {
  face = loadImage("download.jpg");
  size(600,800);
  face.resize(width,height);
  background(face);
}

void draw() {

    background(face);
    if(mousePressed){
      println(mouseX +" "+ mouseY);}
if(mouseX>=leftX && mouseX <= rightX) {
  pupilX = mouseX;
}
if( mouseY >= topY && mouseY <= bottomY){
 pupilY = mouseY ;
}
//else if(mouseY <=topY && mouseX >= rightX){
//  pupilY = topY;
//  //pupilX = mouseX;
//}
//else if(mouseY>= bottomY && mouseX <= leftX){
// pupilY = bottomY; 
////pupilX = mouseX;
//}
if(mouseX <=leftX){
 pupilX = leftX; 
}
if(mouseX >= rightX){
 pupilX =rightX; 
}
if(mouseY>= bottomY){
 pupilY = bottomY; 
//pupilX = mouseX;
}
if(mouseY <=topY){
  pupilY = topY;
  //pupilX = mouseX;
}


    fill(#FFFFFF);
  ellipse(250,330,80,50);
ellipse(400,330,80,50);
        fill(#000000);
  ellipse(pupilX,pupilY,20,20);
  ellipse(pupilX+150,pupilY,20,20);
}
