package design.pattern.structural.facade;

public class PaymentProcess {

    public PaymentProcess() {

    }

    public boolean processPayment(int total) throws InterruptedException {
        /*Thread thread = new Thread();

        thread.wait(100);*/
        System.out.println("Payment process successfully of amount: " + total);
        return true;
    }
}
