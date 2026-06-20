package design.pattern.creational.factory.method.creator.concreate;

import design.pattern.creational.factory.method.creator.Creator;
import design.pattern.creational.factory.method.product.IProduct;
import design.pattern.creational.factory.method.product.concreate.ProductA;

public class CreatorA extends Creator {
    @Override
    public IProduct createProduct() {
        return new ProductA();
    }
}
