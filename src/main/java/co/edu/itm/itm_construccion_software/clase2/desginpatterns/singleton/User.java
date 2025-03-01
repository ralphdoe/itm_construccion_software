package co.edu.itm.itm_construccion_software.clase2.desginpatterns.singleton;

public class User {



  private static User instance;
  private String name;

  private User() {

  }

  private User(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public static synchronized User getInstance() {
    if (instance == null) {
      instance = new User();
    }
    return instance;
  }
}
