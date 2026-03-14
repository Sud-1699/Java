import java.util.*;

public class HashMapExample {
    // Key as an object

    static class Student {
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if(this == o) return true;
            if(o == null || getClass() != o.getClass()) return false;

            Student student = (Student) o;
            return id == student.id && Objects.equals(name, student.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static void changeValue(int x) {
        x = 50;
    }

    public static void changeValue(Student s) {
        s = new Student(5, "ABC");
    }

    public static void main(String[] args) {
        Map<Student, String> division = new HashMap<>();

        Student s1 = new Student(1, "Alice");
        division.put(s1, "Class A");

        Student s2 = new Student(1, "Alice");
        division.put(s2, "Class B");

        System.out.println(division);

        Set<Student> uniqueStudents = new HashSet<>();
        uniqueStudents.add(s1);
        uniqueStudents.add(s2);

        System.out.println(uniqueStudents);

        int a = 10;
        changeValue(a);
        System.out.println(a);

        Student s = new Student(4, "DEF");
        changeValue(s);
        System.out.println(s);
        
    }
}
