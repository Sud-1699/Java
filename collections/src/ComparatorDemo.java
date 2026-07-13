import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    private String name;
    private double gpa;

    Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(o.getGpa(), this.gpa);
    }
}

public class ComparatorDemo {
    // Sort logic
    // (o1, o2) -> -1 o1 should come before o2
    // (o1, o2) -> 0 o1 and o2 will treat as same
    // (o1, o2) -> 1 o2 should come before o1


    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(23, 5, 2, 1, 50);
        nums.sort((n1, n2) -> n2 - n1);
        System.out.println(nums);

        List<String> fruits = Arrays.asList("banana", "apple", "date");
//        Collections.sort(fruits);
        fruits.sort((s1, s2) -> s2.length() - s1.length()); // Asc order
        System.out.println(fruits); // Asc order

        List<Student> students = Arrays.asList(
                new Student("Charlie", 3.5),
                new Student("Sam", 3.7),
                new Student("Alice", 3.5),
                new Student("Mac", 3.9)
        );


        // students.sort(null); // Exception will throw cuz we have not implements Comparable on Student
        // students.sort((a, b) -> (int) (b.getGpa() - a.getGpa())); // Bug casting double value to int will always return 0

        /*students.sort((a, b) -> {
            if(b.getGpa() - a.getGpa() < 0) {
                return -1;
            } else if(b.getGpa() - a.getGpa() > 0) {
                return 1;
            } else {
                // After gpa sort will sort name also if both are same order
                a.getName().compareTo(b.getName());
            }
        });*/


        Comparator<Student> comparator = Comparator
                .comparing(Student::getGpa)
                .reversed()
                .thenComparing((a, b) -> a.getName().compareTo(b.getName()));
//         Either you can use Collections to sort or directly sort from List interface
//        students.sort(comparator);
//        Collections.sort(students, comparator); // For Custom object have to create a comparator function
        System.out.println(students);
    }
}
