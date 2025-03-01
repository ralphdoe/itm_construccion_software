package co.edu.itm.itm_construccion_software.clase1.yagni;

public class TestNotificationService {

  public NotificationService notificationService = new NotificationService();

  public void exeucute() {
    notificationService.sendEmail("Test", "Test");
    notificationService.sendPushNotification("Test", "Test");
  }

}
