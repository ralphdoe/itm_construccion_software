package co.edu.itm.itm_construccion_software.tdd;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PrimeFactorTest {

  @BeforeEach
  void setUp() {
    // prepare data...
  }

  @Test
  public void testWhenSend2Returns2() {
    // Arrange
    int number = 2;

    // Act
    List<Integer> generate = PrimeFactor.generate(number);
    // Assert
    assertEquals(2, generate.get(0));
  }

  @Test
  public void testWhenSend3Returns3() {
    // Arrange
    int number = 3;

    // Act
    List<Integer> generate = PrimeFactor.generate(number);
    // Assert
    assertEquals(3, generate.get(0));
  }

  @Test
  public void testWhenSend4Returns2And2() {
    // Arrange
    int number = 4;

    // Act
    List<Integer> generate = PrimeFactor.generate(number);
    // Assert
    assertEquals(2, generate.get(0));
    assertEquals(2, generate.get(1));
  }

  @Test
  public void testWhenSend6Returns2And3() {
    // Arrange
    int number = 6;

    // Act
    List<Integer> generate = PrimeFactor.generate(number);
    // Assert
    assertEquals(2, generate.get(0));
    assertEquals(3, generate.get(1));
  }

  @Test
  public void testWhenSend8Returns2And2And2() {
    // Arrange
    int number = 8;

    // Act
    List<Integer> generate = PrimeFactor.generate(number);
    // Assert
    assertEquals(2, generate.get(0));
    assertEquals(2, generate.get(1));
    assertEquals(2, generate.get(2));
  }

  @Test
  public void testWhenSend9Returns3And3() {
    // Arrange
    int number = 9;

    // Act
    List<Integer> generate = PrimeFactor.generate(number);
    // Assert
    assertEquals(3, generate.get(0));
    assertEquals(3, generate.get(1));
  }

  @Test
  public void testWhenSend10Returns2And5() {
    // Arrange
    int number = 10;

    // Act
    List<Integer> generate = PrimeFactor.generate(number);
    // Assert
    assertEquals(2, generate.get(0));
    assertEquals(5, generate.get(1));
  }

  @Test
  public void testWhenSend12Returns2And2And3() {
    // Arrange
    int number = 12;

    // Act
    List<Integer> generate = PrimeFactor.generate(number);
    // Assert
    assertEquals(2, generate.get(0));
    assertEquals(2, generate.get(1));
    assertEquals(3, generate.get(2));
  }

  @Test
  public void testWhenSend11Returns11() {
    // Arrange
    int number = 11;

    // Act
    List<Integer> generate = PrimeFactor.generate(number);
    // Assert
    assertEquals(11, generate.get(0));
  }

  @Test
  public void testWhenSend15Returns3And5() {
    // Arrange
    int number = 15;

    // Act
    List<Integer> generate = PrimeFactor.generate(number);
    // Assert
    assertEquals(3, generate.get(0));
    assertEquals(5, generate.get(1));
  }

  @Test
  public void testWhenSend43Returns43() {
    // Arrange
    int number = 43;

    // Act
    List<Integer> generate = PrimeFactor.generate(number);
    // Assert
    assertEquals(43, generate.get(0));
  }

  @Test
  public void testWhenSend40Returns2And2And2And5() {
    // Arrange
    int number = 40;

    // Act
    List<Integer> generate = PrimeFactor.generate(number);
    // Assert
    assertEquals(2, generate.get(0));
    assertEquals(2, generate.get(1));
    assertEquals(2, generate.get(2));
    assertEquals(5, generate.get(3));
  }

  @AfterEach
  void tearDown() {
    // .. close connections.
  }
}