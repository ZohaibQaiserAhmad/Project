Mimport java.awt.*;
static final Color c = new Color(255, 255, 0);

public class PacmanCharacter {

  private int lives;
  private int score;
  int xPos;
  int yPos = 20;
  


  public void draw() {


    fill(255, 255, 0);
    ellipse(xPos, yPos, 20, 20);
    



    this.xPos ++;
  }
}