package design.pattern.structural.facade;

public class OrderSystem {
    private final PaymentProcess paymentProcess;
    private final InventoryProcess inventoryProcess;
    private final ShippingProcess shippingProcess;

    public OrderSystem(
            PaymentProcess paymentProcess,
            InventoryProcess inventoryProcess,
            ShippingProcess shippingProcess
    ) {
        this.paymentProcess = paymentProcess;
        this.inventoryProcess = inventoryProcess;
        this.shippingProcess = shippingProcess;
    }

    public boolean processOrder(String user, String selectedItem) throws Exception {
        if(!this.inventoryProcess.isUserValid(user)) {
            throw new Exception("User is not validated");
        }

        if(!this.inventoryProcess.checkItemAvailable(selectedItem)) {
            throw new Exception("Selected item is not available");
        }

        var total = this.shippingProcess.calculateShipping(this.inventoryProcess.getItemPrice(selectedItem));
        return this.paymentProcess.processPayment(total);
    }
}
