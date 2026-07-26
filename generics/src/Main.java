public class Main {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.setValue(10);

        System.out.println(box.getValue());

        Pair<String, Integer> pair = new Pair<>("Age", 28);
        System.out.println(pair.getKey() + " -> " + pair.getValue());
    }
}
