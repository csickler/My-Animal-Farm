public class Rhino extends Turtle
{ 
  /**
   * Constructor that takes a model display and adds
   * a turtle in the middle of it
   * @param display the model display
   */
  public Rhino(World wref)
  {
    super(wref);
    Picture pic = new Picture("/Users/irai/Downloads/rhino_vector.jpg");
    this.getPenColor(72,62,139);
    
  }
  
  /**
   * Constructor that takes the x and y position and the
   * model displayer
   * @param x the x pos
   * @param y the y pos
   * @param display the model display
   */
  public Rhino(int x, int y, World wref)
  {
    super(x, y, wref);
  }
}