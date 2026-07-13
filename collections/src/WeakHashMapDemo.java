import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) {
        // So need to create a non-literal string
        String key1 = new String("img1");
        String key2 = new String("img2");

        WeakHashMap<String, Image> cache = new WeakHashMap<>();
        cache.put(key1, new Image("Image 1"));
        cache.put(key2, new Image("Image 2"));
        System.out.println(cache);
        key1 = key2 = null; // While empty the key GBC remove the weak or non reference key along with it weak reference object
        // There is an alternate way also if you don't want to set null for key load data from other method or directly add new String("") into put method for key
        /*
        * First way
        * cache.put(new String("img1"), new Image("Image 1"));
        * cache.put(new String("img2"), new Image("Image 2"));
        * While doing this you don't have to set key null
        *
        * Second way
        * loadCaches(cache);
        * */
        System.gc(); // Telling GBC to remove the non-references obj, for testing purpose not to put in actual production code
        simulateOtherWork();
        System.out.println(cache); // Expected output empty,
        // Got non-empty because key are string literal (store in string pool) which is strong references through the end of program
    }

    // Second way using load data via method
    public static void loadCaches(Map<String, Image> cache) {
        String key1 = new String("img1");
        String key2 = new String("img2");

        cache.put(key1, new Image("Image 1"));
        cache.put(key2, new Image("Image 2"));
    }

    private static void simulateOtherWork() {
        System.out.println("Simulating other work....");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Image {
    String name;

    Image(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Image{" +
                "name='" + name + '\'' +
                '}';
    }
}
