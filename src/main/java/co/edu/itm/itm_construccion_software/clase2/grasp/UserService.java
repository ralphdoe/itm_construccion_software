package co.edu.itm.itm_construccion_software.clase2.grasp;

import co.edu.itm.itm_construccion_software.clase2.grasp.model.User;

// Necesito crea un Servicio que Registra un Usuario y envia un correo de bienvenida.
public class UserService {


  private final NotificationService notificationService;

  public UserService(NotificationService notificationService) {
    this.notificationService = notificationService;
  }

  public void registerUser(User user) {

    System.out.println("Registrando usuario " + user.getName() + " " + user.getEmail());
    // Depende de una Logica de Negocio
    notificationService.sendNotification(user.getEmail(), "Bienvenido a nuestro Sistema.");
  }

}
