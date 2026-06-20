package design.pattern.creational.factory.method.creator.concreate;

import design.pattern.creational.factory.method.creator.Creator;
import design.pattern.creational.factory.method.product.IProduct;
import design.pattern.creational.factory.method.product.concreate.ProductB;

public class CreatorB extends Creator {
    @Override
    public IProduct createProduct() {
        return new ProductB();
    }
}
