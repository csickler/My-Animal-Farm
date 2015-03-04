public class Farm
{
  public static void main(String[] a)
  {
    World ref=new World();
    GrapeApe grapo=new GrapeApe(ref);
    Rhino rhinoo = new Rhino(ref); 
    
    // giving comands for rhino
    rhinoo.forward(30);
   
  }
}