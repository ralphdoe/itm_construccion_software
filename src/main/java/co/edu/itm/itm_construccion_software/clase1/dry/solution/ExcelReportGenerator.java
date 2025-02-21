package co.edu.itm.itm_construccion_software.clase1.dry.solution;

public class ExcelReportGenerator implements ReportGenerator {

  @Override
  public void generate(String data) {
    System.out.println("Generando Excel con datos: " + data);
  }
}
