public class Farm
{
  public static void main(String[] a)
  {
    World ref=new World();
    GrapeApe grapo=new GrapeApe(ref);
    Rhino rhinoo = new Rhino(ref);
    
    // giving comands for rhino
    rhinoo.forward(30);
    
    // giving commands for grapo
    grapo.animateTurn(270);
    grapo.animateForward(60);
    grapo.animateTurn(90);
    grapo.animateForward(70);
    grapo.animateTurn(90);
    grapo.animateForward(110);
    grapo.animateTurn(270);
    grapo.animateForward(110);
    grapo.animateTurn(270);
    grapo.animateForward(250);
    grapo.animateTurn(270);
    grapo.animateForward(300);
    grapo.animateForward(0);
   
  }
}