package co.edu.itm.itm_construccion_software.clase1.yagni;

public class NotificationService {
  public void sendEmail(String recipient, String message) {
    System.out.println("Enviando email a " + recipient);
  }

  public void sendPushNotification(String recipient, String message) {
    System.out.println("Enviando push notification a " + recipient);
  }

  public void sendFax(String recipient, String message) { // ¿Quién usa fax?
    System.out.println("Enviando fax a " + recipient);
  }
}