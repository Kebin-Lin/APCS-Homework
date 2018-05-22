//Kevin Lin
//APCS2 Pd1
//HW52 -- Grow & Shrink
//2018-05-23

boolean shrink = true; //Is the ellipse shrinking?
float currX; //Current X position of ellipse
float currY; //Current Y position of ellipse
float currSize; //Current size of ellipse
color c = #b19cd9; //Pastel Purple

void setup() {
  background(0.0); //Black background
  size(500,500); //500x500 window
}

void draw() {
  background(0.0);
  if (!(currX == 0 && currY == 0)) { //If position set
    ellipse(currX,currY,currSize,currSize); //Create ellipse
    fill(c); //Fill ellipse with this color
  }
  if (shrink && currSize > 0) currSize--; //Shrink ellipse
  else currSize++; //Expand ellipse
}

void mouseClicked() {
   shrink = !shrink; //Toggles shrinking
   if (currX == 0 && currY == 0) { //Sets ellipse position if not set already
     currX = mouseX;
     currY = mouseY;
   }
}
