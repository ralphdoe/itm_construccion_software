package co.edu.itm.itm_construccion_software.clase1.dry.solution;

public class PDFReportGenerator implements ReportGenerator {
  @Override
  public void generate(String data) {
    System.out.println("Generando PDF con datos: " + data);
  }

}
