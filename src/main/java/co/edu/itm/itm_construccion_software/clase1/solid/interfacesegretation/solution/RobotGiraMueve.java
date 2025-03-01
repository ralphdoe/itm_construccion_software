package co.edu.itm.itm_construccion_software.clase1.solid.interfacesegretation.solution;

public class RobotGiraMueve implements RobotGirador, RobotMovedor {
  @Override
  public void moverAntenas() {
    System.out.println("Mover antenas");
  }

  @Override
  public void girar() {
    System.out.println("Girar");
  }
}
