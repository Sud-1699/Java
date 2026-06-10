package design.pattern.structural.facade;

public class FacadePattern {

    public static void main(String[] args) {
        OrderSystem facadeExample = new OrderSystem(
                new PaymentProcess(),
                new InventoryProcess(),
                new ShippingProcess()
        );

        try {
            facadeExample.processOrder("Test", "Apple");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
