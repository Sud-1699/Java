import java.util.Arrays;
import java.util.LinkedList;

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
    }
}

public class LinkedListDemo {
    public static void main(String[] args) {
        // Custom Linked List using node

        Node<String> n1 = new Node<>("ABC");
        Node<String> n2 = new Node<>("DEF");
        Node<String> n3 = new Node<>("GHI");

        n3.next = null;
        n2.next = n3;
        n1.next = n2;

        Node<String> head = n1;


        while(head != null) {
            System.out.println(head.data);
            head = head.next;
        }

        // Using collection framework Linkedlist
        LinkedList<String> ll = new LinkedList<>();
        ll.add("abc");
        ll.add("def");
        ll.add("ghi");

        System.out.println(ll);
        //Direct way
        LinkedList<String> ll1 = new LinkedList<>(Arrays.asList("ert", "09", "9iu"));

        ll.addAll(ll1);
        System.out.println(ll);
    }
}
