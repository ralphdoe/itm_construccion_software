package co.edu.itm.itm_construccion_software.clase2.grasp;

public class EmailService implements NotificationService {


  @Override
  public void sendNotification(String recipient, String message) {
      System.out.println("Enviando email a " + recipient + " Contenido " + message);
  }
}
