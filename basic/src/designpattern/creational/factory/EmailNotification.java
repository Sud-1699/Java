package designpattern.creational.factory;

public class EmailNotification implements Notification{
    @Override
    public void sendNotification(String msg) {
        System.out.println("Sending email: " + msg);
    }
}
