package bean.factory;

public class Main {
    public static void main(String[] args) {
        Notification sms = NotificationFactory.getNotificationFactory(Channel.SMS);

        sms.sendNotification("Hello sending you a sms :) !");
    }
}
