package co.edu.itm.itm_construccion_software.clase1.calidad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

  @Test
  void testSuma() {
    // Arrange
    int a = 2;
    int b = 3;
    Calculadora calc = new Calculadora();

    // Act

    int result = calc.sumar(a, b);

    // Assert
    assertEquals(5, result);
  }

  @Test
  void testSumaError() {
    // Arrange
    int a = 10;
    int b = 3;
    Calculadora calc = new Calculadora();

    // Act

    int result = calc.sumar(a, b);

    // Assert
    assertNotEquals(5, result);
  }

}