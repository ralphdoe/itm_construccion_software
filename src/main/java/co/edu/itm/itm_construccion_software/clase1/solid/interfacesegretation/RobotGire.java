package co.edu.itm.itm_construccion_software.clase1.solid.interfacesegretation;

public class RobotGire implements GenericRobot {

  @Override
  public void girar() {
    System.out.println("Girar");
  }

  @Override
  public void rotarBrazos() {
     throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void moverAntenas() {
    throw new UnsupportedOperationException("Not supported yet.");
  }
}
