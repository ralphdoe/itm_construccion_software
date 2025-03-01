package co.edu.itm.itm_construccion_software.clase2.desginpatterns.singleton;

public class UserService {
  public static void main(String[] args) {
    User user = User.getInstance();
    user.setName("Roger");
    System.out.println("Primera Instancia:" + user.getName());
    User secondUser = User.getInstance();
    System.out.println("Segunda Instancia: " + secondUser.getName());
  }

}
