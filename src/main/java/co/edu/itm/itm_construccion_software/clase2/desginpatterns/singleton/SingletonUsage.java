package co.edu.itm.itm_construccion_software.clase2.desginpatterns.singleton;

public class SingletonUsage {

  public static void main(String[] args) {

    UserSingleton userSingleton = UserSingleton.getInstance();
    userSingleton.setName("Juanito");

    UserSingleton userSingleton2 = UserSingleton.getInstance();
    userSingleton2.setName("Pepito");

    System.out.println("El nombre es: " + userSingleton.getName());
    System.out.println("El nombre es: " + userSingleton2.getName());

  }

}
