package co.edu.itm.itm_construccion_software.clase2.grasp.model;

public class UserService {

  public void createUser(String name, String email, String phoneNumber) {
    User user = UserFactory.createUser(name, email, phoneNumber);
  }

}
