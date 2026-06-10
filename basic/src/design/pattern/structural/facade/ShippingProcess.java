package design.pattern.structural.facade;

public class ShippingProcess {
    private final int shippingCharges;

    public ShippingProcess() {
        this.shippingCharges = 10;
    }

    public int calculateShipping(int total) {
        /*Thread thread = new Thread();

        try {
            thread.wait(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/

        return total + this.shippingCharges;
    }
}
