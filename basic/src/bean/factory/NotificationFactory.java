package bean.factory;

public class NotificationFactory {
    public static Notification getNotificationFactory(Channel channel) {
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
