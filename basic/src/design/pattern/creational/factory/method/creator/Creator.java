package design.pattern.creational.factory.method.creator;

import design.pattern.creational.factory.method.product.IProduct;

public abstract class Creator {
    // Factory Method an abstract method that force subclasses to write their own logic
    public abstract IProduct createProduct();

    public void doSomething() {
        IProduct product = createProduct();
        product.doStuff();
    }
}
