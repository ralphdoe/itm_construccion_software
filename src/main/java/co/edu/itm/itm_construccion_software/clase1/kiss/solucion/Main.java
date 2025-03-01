package co.edu.itm.itm_construccion_software.clase1.kiss.solucion;

public class Main {

  public static void main(String[] args) {
    // Uso:
    Calculadora calc = new Calculadora();
    Operacion operacion = new Suma();
    int resultado = calc.calcular(operacion, 10, 5);
    System.out.println("Resultado: " + resultado);
  }

}
