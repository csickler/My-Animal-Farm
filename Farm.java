public class Farm
{
  public static void main(String[] a)
  {
    World ref=new World();
    GrapeApe grapo=new GrapeApe(ref);
    Rhino rhinoo = new Rhino(ref);
    
    // giving comands for rhino
    rhinoo.forward(30);
    rhinoo.turn(100);
    rhinoo.forward(200);
    rhinoo.turn(180);
    
    
    // giving commands for grapo
    grapo.turn(270);
    grapo.forward(60);
    grapo.turn(90);
    grapo.forward(70);
    grapo.turn(90);
    grapo.forward(110);
    grapo.turn(270);
    grapo.forward(110);
    grapo.turn(270);
    grapo.forward(250);
    grapo.turn(270);
    grapo.forward(300);
   
  }
}