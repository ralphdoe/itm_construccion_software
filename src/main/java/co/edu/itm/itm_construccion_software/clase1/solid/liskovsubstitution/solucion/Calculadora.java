package co.edu.itm.itm_construccion_software.clase1.solid.liskovsubstitution.solucion;

public class Calculadora {
  public int calcular(Operacion operacion, int a, int b) {
    return operacion.ejecutar(a, b);
  }

}
