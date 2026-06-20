package design.pattern.creational.factory.method;

import design.pattern.creational.factory.method.creator.Creator;
import design.pattern.creational.factory.method.creator.concreate.CreatorA;
import design.pattern.creational.factory.method.creator.concreate.CreatorB;

import java.util.Scanner;

/**
 * Client class. Everything comes together here.
 */
public class Client {
    private static Creator creator;

    public static String type = "";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your product A or B : ");
        type = sc.next();

        configure(type);
        runBusinessLogic();
    }

    /**
     * The concrete factory is usually chosen depending on configuration or
     * environment options.
     */
    static void configure(String productType) {
        if (productType.equals("A")) {
            creator = new CreatorA();
        } else {
            creator = new CreatorB();
        }
    }

    /**
     * All of the client code should work with factories and products through
     * abstract interfaces. This way it does not care which factory it works
     * with and what kind of product it returns.
     */
    static void runBusinessLogic() {
        creator.doSomething();
    }
}
