package co.edu.itm.itm_construccion_software.clase1.calidad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

  @Test
  void testSuma() {
    Calculadora calc = new Calculadora();
    assertEquals(5, calc.sumar(2, 3));
  }

  @Test
  void testSumaErronea() {
    Calculadora calc = new Calculadora();
    assertNotEquals(6, calc.sumar(2, 3));
  }

}