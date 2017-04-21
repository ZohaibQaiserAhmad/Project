//March-29-2017
//Zohaib Ahmad
//Recursion Fractal

//Set up Void
void setup() {

 //Creates Canvas of size 600 by 600
   size(600, 600);
  
  //Makes background(Canvas) black
   background(0);
  
  //Fills the original circle with random color each time
  fill(random(255), random(255), random(255), random(255));
  drawCircle(width/2, height/2, 300 , 0);


}


//Draw Circle function : has x position , y position , radius demension and height demension
void drawCircle(float x, float y, float radius , float height) {
  
  //Dimension of original circle 
  ellipse(x , y, radius*2, radius*2);
  
  //If radius is greater then 10 keep doing recursion
  if (radius > 10) {
    // drawCircle() calls itself twice in order to create a more unique pattern
     
    //Fill color
    
    
      //Fills with random color
    fill(random(255),random(255),random(255),random(255));
     
     //Recursion : Call function back every time and changes dimensions and location
     
    
     //Left to right : Calls function again and changes  
     drawCircle(x - radius/2, y, radius/2 , height);
    
     drawCircle(x - radius/2, y, radius/4 , height);
    
     drawCircle(x + radius/2, y, radius/2 , height);
    
     drawCircle(x + radius/2, y, radius/4 , height);
     
     //Top and bottom : Calls function again
     drawCircle(x, y - radius/2, radius/4 , height);
    
     drawCircle(x, y + radius/2, radius/4 , height);     
    
   

  }
}