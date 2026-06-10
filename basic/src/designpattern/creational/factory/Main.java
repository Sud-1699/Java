package designpattern.creational.factory;

public class Main {
    public static void main(String[] args) {
        Notification sms = NotificationFactory.notificationFactory(Channel.SMS);

        sms.sendNotification("Hello sending you a sms :) !");
    }
}
