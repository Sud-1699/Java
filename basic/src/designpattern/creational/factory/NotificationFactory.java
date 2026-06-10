package designpattern.creational.factory;

public class NotificationFactory {
    public static Notification notificationFactory(Channel channel) {
        Notification factory = null;
        switch (channel) {
            case SMS:
                factory = new SMSNotification();
                break;
            case EMAIL:
                factory = new EmailNotification();
        }

        return factory;
    }
}
