package co.edu.itm.itm_construccion_software.clase2.desginpatterns.singleton;

public class UserSingleton {

  private String name;

  private static UserSingleton instance;

  private UserSingleton() {

  }

  public static synchronized UserSingleton getInstance() {
    if (instance == null) {
      instance = new UserSingleton();
    }
    return instance;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
