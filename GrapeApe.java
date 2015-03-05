import java.awt.Color;

public class GrapeApe extends Turtle
{ 
    /**
   * Constructor that takes a model display and adds
   * a turtle in the middle of it
   * @param display the model display
   */
  public GrapeApe(World wref)
  {
    super(wref);
    //this.getShellColor(147, 112, 219);
    Color shellColor = new Color(147, 112, 219); 
    //this.setShellColor();
    this.setHeight(30);
    this.setWidth(30);
    //this.animateForward(30,10);
  }
        /**
   * Constructor that takes the x and y position and the
   * model displayer
   * @param x the x pos
   * @param y the y pos
   * @param display the model display
   */
   public GrapeApe(int x, int y, World wref)
   {
     super(x,y,wref);
   }
}


   
     
  