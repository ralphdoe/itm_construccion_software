package co.edu.itm.itm_construccion_software.clase1.dry;

public class ReportService {

  public void generatePDFReport(String data) {
    System.out.println("Generando PDF con datos: " + data);
    sumarYMultiplicar();
  }

  public void generateExcelReport(String data) {
    System.out.println("Generando Excel con datos: " + data);
    sumarYMultiplicar();
  }

  public void generateWprdReport(String data) {
    System.out.println("Generando Excel con datos: " + data);
    sumarYMultiplicar();
  }

  private static void sumarYMultiplicar() {
    int suma =  1 + 2;
    int multiplicacion =  suma * suma;
    System.out.println(multiplicacion);
  }

}
