import java.awt.*;
static final Color c = new Color(0,255,255);

public class Pacman {
    
    int lives;
    int score;
    int xPos;
    int yPos;
    int speed;
    
  public Pacman() {
    
    
  }

  
  public void draw() {
   
    ellipse(xPos,yPos,20,20);
    
    this.xPos ++;
    
    
    
  }
  
  
  
}