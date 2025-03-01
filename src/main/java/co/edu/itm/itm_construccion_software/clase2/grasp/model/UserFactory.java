package co.edu.itm.itm_construccion_software.clase2.grasp.model;

public class UserFactory {
  public static User createUser(String name, String email, String phoneNumber) {
    return new User(name, email, phoneNumber);
  }

}
