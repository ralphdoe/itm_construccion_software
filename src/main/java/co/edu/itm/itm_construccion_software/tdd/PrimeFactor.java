package co.edu.itm.itm_construccion_software.tdd;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

  public static List<Integer> generate(int number) {
    List<Integer> result = new ArrayList<>();
    int divisor = 2;

    int numeroCopia = number;

    while (numeroCopia != 1) {
      int modulo = numeroCopia % divisor;
      if  (modulo == 0) {
        numeroCopia = numeroCopia / divisor;
        result.add(divisor);
      } else {
        divisor++;
      }
    }

    return result;
  }

}
