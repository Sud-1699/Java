public class HRTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.sayHow(null);
        Person emp = new Employee();
        emp.sayHow(null);
        User user = emp;
        user.sayHow(null);
    }
}

interface How {
    public default void sayHow(String how) throws RuntimeException {
        sayHow(how, 1);
        try {
            if (null == how) throw new RuntimeException("again");
        } catch (RuntimeException e) {

        }
    }

    public void sayHow(String how, int n);
    }


class User implements How {

    @Override
    public void sayHow(String how, int n) {
        try {
            if (null == how) throw new RuntimeException("again user");
        } catch (RuntimeException e) {
            System.out.println("user");
        }
    }
}

class Person extends User {
    public void start() {
        sayHow(null);
    }

    @Override
    public void sayHow(String how, int n) {
        try {
            if (null == how) throw new RuntimeException("again person");
        } catch (RuntimeException e) {
            System.out.println("person");
        }
    }
}

class Employee extends Person {
    public void start() {
sayHow(null);
    }

    @Override
    public void sayHow(String how, int n) {
        try {
            if (null == how) throw new RuntimeException("again employee");
        } catch (RuntimeException e) {
            System.out.println("employee");
        }
    }
}