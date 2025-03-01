package co.edu.itm.itm_construccion_software.clase1.dry;

public class ReportService {

  public void generatePDFReport(String data) {
    System.out.println("Generando PDF con datos: " + data);
    sumarMultiplicarYExportar();
  }

  public void generateExcelReport(String data) {
    System.out.println("Generando Excel con datos: " + data);
    sumarMultiplicarYExportar();
  }

  public void generateWprdReport(String data) {
    System.out.println("Generando Excel con datos: " + data);
    sumarMultiplicarYExportar();
  }

  private static void sumarMultiplicarYExportar() {
    int suma =  1 + 2;
    int multiplicacion =  suma * suma;
    System.out.println(multiplicacion);
  }
}
