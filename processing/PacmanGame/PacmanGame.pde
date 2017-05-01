
/*

 +* Name: Zohaib Ahmad
 +
 + * Date : Monday , May 1st
 +
 + * Version : v0.02
 +
 +  * Description : Creates pacman game - using class object - pacman character of which extends properties to ms pacman , pacman and ghost

/**
*
* @author 1ahmadzoh
*/


//Variables
//pacman object and ghost object
Pacman pacman;
ghost ghost;

//Makes boolean moved to check for movement from characters
boolean hasMoved;

//Makes a int 'movedspace' to calculate for distance travelled
int movedSpace = 0;

//Void setup
void setup() {
  
  //Creates canvas - 640 by 480
  size(640, 480);
  
  //Sets background to black
  background(0);
  
  //Uses smooth to make ellipse look better - pacman
  smooth();
  
  //Sets the ellipse to center - if no movement
  ellipseMode(CENTER);
  
  //Sets fram rate to 99
  frameRate(99);
  
  //Creates pacman object and ghost object
  pacman = new Pacman();
  ghost = new ghost();
}

//Actual function to draw on canvas
void draw() {
  
  //Draws pacman and ghost
  pacman.draw();
  ghost.draw();
  
  //If hasMoved(if they moved is set to false) and movedSpace is 0 - make moved space equal to pacman.x - ghost.x and have ghost move right
   if ( hasMoved == false) {
    if ( movedSpace == 0 ) {
      movedSpace = pacman.x - ghost.x;
      ghost.moveRight();
    }
    
    //Else have the ghost move left
    else {
      ghost.moveLeft();
    }
    
    
    //If movedSpace is equal to 1

    if ( movedSpace == 1) {
      
      //moved space is equal to pacman y position - ghost y position
      movedSpace = pacman.y - ghost.y;
      
      //Have the ghost move up
      ghost.moveUp();
    }
    
    //Else have the ghost move down
    else {
      ghost.moveDown();
    }

  }
}

//Function for when key is pressed
void keyPressed() {
  
  
  //if key is equal to  coded  do this
  if ( key == CODED) {
    
    //if keycode is equal to right  [->] on keyboard make pacman move right
    if ( keyCode == RIGHT ) {
      pacman.moveRight();
    }
  
    //if keycode is equal to left [<-] on keyboard make pacman move left
    if ( keyCode == LEFT ) {
      pacman.moveLeft();
    }
    
    //if keycode is equal to up[^] on keyboard make pacman move up
    if ( keyCode == UP ) {
      pacman.moveUp();
    }
    
    //if keycode is equal to down on keyboard make pacman move down
    if ( keyCode == DOWN ) {
      pacman.moveDown();
    }
  }
}

  
  //Create class the extends pacmanCharacter properties of which will be used
public class Pacman extends PacmanCharacter {

  
  //function that will be used to draw pacman
  public void draw() {

    // Pacman
    
    //fill with black
    fill(0);
    
    //have elipse be (x cordinate) and y cordinate and have ellipse be 50, 50
    ellipse(this.x, this.y, 50, 50);
    
    //fill pacman with yellow
    fill ( 255, 255, 0);
    
    //Create arc that will have these arguments 
    arc(this.x, this.y, 20, 20, PI/6, 11*PI/6, PIE);
    
    //Have the ellipse set to centre
    ellipseMode(CENTER);
    noStroke();
  }
}

//Class for pacmancharacter
public class PacmanCharacter {
  
  //Constants
  public static final int DIR_RIGHT = 1;
  public static final int DIR_LEFT = 2;
  public static final int DIR_UP = 3;
  public static final int DIR_DOWN = 4;
  
  //Int directions (x coordinate , y coordinate)
  int direction;
  int x, y;
  
  //Default constructor for pacman character
  public PacmanCharacter() {
    
    //Have him set at (300 , 250);
    this.x =  300;
    this.y = 250;
    //Have direction set to right
    this.direction = DIR_RIGHT;
  }

//Have a void function for right
  public void moveRight() {
    this.direction = DIR_RIGHT;
    this.x = this.x + 1;
  }
  
  //Void function for left
  public void moveLeft() {
    this.direction = DIR_LEFT;
    this.x = this.x - 1;
  }
  
  //Void function for up
  public void moveUp() {
    this.direction = DIR_UP;
    this.y = this.y - 1;
  }
  
  //Void function for down
  public void moveDown() {
    this.direction = DIR_DOWN;
    this.y = this.y + 1;
  }
  
  //void to move
  public void move() {
    
    //Switch cases that deal with the direction pacman moving via right,left,up and down
    switch( this.direction ) {
    case  DIR_RIGHT:
      this.moveRight();
 
    case  DIR_LEFT:
      this.moveLeft();

    case  DIR_UP:
      this.moveUp();

    case  DIR_DOWN:
      this.moveDown();
    }
  }
}


//Class of ghost that extends pacman character properties
public class ghost extends PacmanCharacter {

  
  //Void function for draw
  public void draw() {
    // Ghost
    
    //Fill with black
    fill(0);
    
    //Rectangle is equal to (x location , y location , and size (25 by 25))
    rect(this.x, this.y-10, 50, 50);
    
    //Fill ghost with red
    fill (255, 0, 0);
    
    //Rectangle is set to (x location , y location and size(20 x 20))
    rect(this.x, this.y, 20, 20);
    
    //Ellipse is equal (x location + 10 , y location + 2 , and size (20,20))
    ellipse(this.x+10, this.y+2, 20, 20);
    noStroke();
  }
}