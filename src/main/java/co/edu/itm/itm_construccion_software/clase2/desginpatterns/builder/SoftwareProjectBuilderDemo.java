package co.edu.itm.itm_construccion_software.clase2.desginpatterns.builder;

public class SoftwareProjectBuilderDemo {

  public static void main(String[] args) {
    SoftwareProject microservicesProject = new SoftwareProject.Builder()
        .projectName("E-Commerce Platform")
        .addTechnology("Java")
        .addTechnology("Spring Boot")
        .addTechnology("Kubernetes")
        .addTechnology("Docker")
        .teamSize(8)
        .projectManager("Maria Rodriguez")
        .build();

    System.out.println("Microservices Project: " + microservicesProject);
  }
}
