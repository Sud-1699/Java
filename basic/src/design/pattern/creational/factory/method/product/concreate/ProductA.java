package design.pattern.creational.factory.method.product.concreate;

import design.pattern.creational.factory.method.product.IProduct;

public class ProductA implements IProduct {
    @Override
    public void doStuff() {
        System.out.println("Creating a product for A");
    }
}
