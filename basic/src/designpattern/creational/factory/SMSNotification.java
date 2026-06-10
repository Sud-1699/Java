package designpattern.creational.factory;

public class SMSNotification implements Notification{
    @Override
    public void sendNotification(String msg) {
        System.out.println("Sending sms: " + msg);
    }
}
