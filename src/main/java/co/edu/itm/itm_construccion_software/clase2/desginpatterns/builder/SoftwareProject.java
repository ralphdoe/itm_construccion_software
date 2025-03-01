package co.edu.itm.itm_construccion_software.clase2.desginpatterns.builder;

import java.util.ArrayList;
import java.util.List;

public class SoftwareProject {

  private String projectName;
  private List<String> technologies;
  private int teamSize;
  private String projectManager;

  private SoftwareProject() {
    this.technologies = new ArrayList<>();
  }

  public static class Builder {

    private SoftwareProject softwareProject = new SoftwareProject();

    public Builder projectName(String name) {
      softwareProject.projectName = name;
      return this;
    }

    public Builder addTechnology(String tech) {
      softwareProject.technologies.add(tech);
      return this;
    }

    public Builder teamSize(int size) {
      softwareProject.teamSize = size;
      return this;
    }

    public Builder projectManager(String manager) {
      softwareProject.projectManager = manager;
      return this;
    }

    public SoftwareProject build() {
      if (softwareProject.projectName == null) {
        throw new IllegalStateException("Project name is required");
      }
      return softwareProject;
    }
  }

  public String getProjectName() { return projectName; }
  public List<String> getTechnologies() { return technologies; }
  public int getTeamSize() { return teamSize; }
  public String getProjectManager() { return projectManager; }

  @Override
  public String toString() {
    return "Software Project [" +
        "Name: " + projectName + ", " +
        "Technologies: " + technologies + ", " +
        "Team Size: " + teamSize + ", " +
        "Project Manager: " + projectManager +
        "]";
  }
}