import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        // Read operation: Fast and direct, since they are directly reading from stable list without any modification
        // Write operation: A new copy of list is created for every modification
        // Then the reference to the list is then updated so that subsequent reads use this new list

        // This need to be used when read operation are more and write operation is minimal required
        // Because creating copy version of list utilize additional memory
        CopyOnWriteArrayList<Integer> nums = new CopyOnWriteArrayList<>();


        // Example 1
        // List<String> baskets = new ArrayList<>(Arrays.asList("egg", "bread", "cheese")); // Throw Exception in thread "main" java.util.ConcurrentModificationException
        // Fail fast iterator issues will iterate on current list at the same time write is also happening on same list which throw error
        // Will use CopyOnWriteArrayList
        // Will reading it read from original list but when write happen a copy create and modification done in copied version of list
        // And then it reference are mapped to original list to get latest version of list
        List<String> baskets = new CopyOnWriteArrayList<>(Arrays.asList("egg", "bread", "cheese"));
        for(String item: baskets) {
            System.out.println("Item in basket: " + item);
            if(item.equals("bread")) {
                baskets.add("butter");
                System.out.println("Added butter into basket");
            }
        }

        System.out.println("Baskets: " + baskets);

        // Example 2 using arraylist in threaded env will throw error ConcurrentModificationException
        // To prevent that use CopyOnWriteArrayList
        List<String> items = new ArrayList<>(Arrays.asList("item1", "item2", "item3"));
        Thread readerThread = new Thread(() -> {
            try{
                while(true) {
                    for(String item: items) {
                        // Iterate items
                        System.out.println("Item: " + item);
                        Thread.sleep(100); // simulate delay while reading
                    }
                }
            } catch (Exception e) {
                System.out.println("Exception occurred" + e);
            }
        });

        Thread writerThread = new Thread(() -> {
            try {
                Thread.sleep(500); // Delay to allow reading to start first
                items.add("item4");
                System.out.println("Item 4 added");

                Thread.sleep(500);
                items.remove("item1");
                System.out.println("Item1 removed");
            } catch (InterruptedException e) {
                System.out.println("Exception occurred" + e);
                e.printStackTrace();
            }
        });

        readerThread.start();
        writerThread.start();
    }
}
