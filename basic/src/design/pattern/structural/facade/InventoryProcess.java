package design.pattern.structural.facade;

import java.util.Map;

public class InventoryProcess {
    private final Map<String, Integer> items;

    public InventoryProcess() {
        this.items = Map.of("Apple", 4, "Macbook Pro", 1000, "PS5", 500);
    }

    public boolean checkItemAvailable(String item) {
        System.out.println("Item available: " + this.items.containsKey(item));
        return this.items.containsKey(item);
    }

    public int getItemPrice(String item) {
        System.out.println("Item price: " + this.items.get(item));
        return this.items.get(item);
    }

    public boolean isUserValid(String user) {
        /*Thread thread = new Thread();

        try {
            thread.wait(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/

        System.out.println("User validated: " + user);
        return true;
    }
}
