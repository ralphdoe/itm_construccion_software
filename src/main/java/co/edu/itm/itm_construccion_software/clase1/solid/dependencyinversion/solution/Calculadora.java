package co.edu.itm.itm_construccion_software.clase1.solid.dependencyinversion.solution;

public class Calculadora {
  public int calcular(Operacion operacion, int a, int b) {
    return operacion.ejecutar(a, b);
  }

}
