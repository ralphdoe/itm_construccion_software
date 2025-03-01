package co.edu.itm.itm_construccion_software.clase1.solid.dependencyinversion.solution;

public class Main {

  public static void main(String[] args) {
    // Uso:
    Calculadora calc = new Calculadora();
    Operacion operacion = new Suma();
    Operacion resta = new Resta();

    int resultado = calc.calcular(operacion, 10, 5);
    System.out.println("Resultado: " + resultado);

    int resultadoResta = calc.calcular(resta, 10, 5);
    System.out.println("Resultado: " + resultadoResta);
  }

}
