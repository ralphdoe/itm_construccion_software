package co.edu.itm.itm_construccion_software.clase2.grasp;


import co.edu.itm.itm_construccion_software.clase2.grasp.model.User;
import co.edu.itm.itm_construccion_software.clase2.grasp.model.UserFactory;

public class UserController {


  public void registerUser(String name, String email, String phoneNumber) {
    User user = UserFactory.createUser(name, email, phoneNumber);

  }

}
