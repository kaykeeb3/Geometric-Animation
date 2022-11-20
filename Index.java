int hGap = 12;
int wGap = 12;
int[]rad = {3, 4, 5, 6, 7, 8, 35};
int randSize = 15;
int randPos = 0;


void setup () {
  size(1400, 1080);
  background(0);
  smooth();
  for (int j=0; j<=width; j+=wGap) {
    for (int i=0; ranCntr=0; i<=height; i+=hGap, radCntr++){
      makePoly(j+random (-randPos, ranPos), i+randPos, rad[ranCntr], wGap/2+random(-randSize, randSize), randCntr*.4, MITER); 
      if(radCntr>rad.length-2)
      radCntr = 0;
      
    }
  }
}

void makePoly(float x, float y, int points, float radius, float strokeWt, int strokeJn){
  float px=0 py= 0;
  float angle = 0;
  
  stroke(random(255), random(255), random(255));
  noFill();
  strokeJoin(strokeJn);
  strokeWeight(strokeWt);
  
  beginShape();
  for (int i=0; i<points; i++) {
    px = x+cos(radians(angle))*radius;
    px = y+sin(radians(angle))*radius;
    vertex(px, py);
    angle+=360/points;
  }
  endShape(CLOSE);
  
}