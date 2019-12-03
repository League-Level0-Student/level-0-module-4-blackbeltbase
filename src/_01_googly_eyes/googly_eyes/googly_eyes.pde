  PImage face;
  int pupilX = 400;
int pupilY = 300;
int topY = 315;
int bottomY = 335;
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
if(mouseX>=leftX && mouseX <= rightX && mouseY >= topY && mouseY <= bottomY){
  pupilX = mouseX;
  pupilY = mouseY;
}
else if(mouseY <topY){
  pupilY = topY;
}
else if(mouseY> bottomY){
 pupilY = bottomY; 
}
else if(mouseX <leftX){
 pupilX = leftX; 
}
else if(mouseX > rightX){
 pupilX =rightX; 
}

    fill(#FFFFFF);
  ellipse(250,330,80,50);
ellipse(400,330,80,50);
        fill(#000000);
  ellipse(pupilX,pupilY,20,20);
  ellipse(pupilX+150,pupilY,20,20);
}
