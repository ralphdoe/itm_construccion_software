package co.edu.itm.itm_construccion_software.clase2.grasp;

public class SMSService implements NotificationService {


  @Override
  public void sendNotification(String recipient, String message) {
      System.out.println("Enviando SMS a " + recipient + " Contenido " + message);
  }
}
