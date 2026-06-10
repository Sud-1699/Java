package design.pattern.creational.factory;

public class FactoryPattern {
    public static void main(String[] args) {
        Notification sms = NotificationFactory.notificationFactory(Channel.SMS);

        sms.sendNotification("Hello sending you a sms :) !");
    }
}
