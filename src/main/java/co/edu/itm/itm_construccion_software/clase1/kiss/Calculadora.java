package co.edu.itm.itm_construccion_software.clase1.kiss;

public class Calculadora {
  public int operacion(String tipo, int a, int b) {
    switch (tipo) {
      case "suma" -> {
        return a + b;
      }
      case "resta" -> {
        return a - b;
      }
      case "multiplicacion" -> {
        return a * b;
      }
      case "division" -> {
        if (b == 0) {
          throw new ArithmeticException("División por cero");
        }
        return a / b;
      }
      default -> throw new IllegalArgumentException("Operación no soportada");
    }
  }

}
