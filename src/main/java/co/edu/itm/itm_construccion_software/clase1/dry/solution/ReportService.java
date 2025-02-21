package co.edu.itm.itm_construccion_software.clase1.dry.solution;

public class ReportService {
  private final ReportGenerator reportGenerator;

  public ReportService(ReportGenerator reportGenerator) {
    this.reportGenerator = reportGenerator;
  }

  public void generate(String data) {
    reportGenerator.generate(data);
  }

}
