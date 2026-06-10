package design.pattern.creational.builder;

public class Employee {
    // All attributes are final to ensure immutability
    private final String id; // required
    private final String name; // required
    private final int age; // required
    private final Gender gender; // optional
    private final String bloodGroup; // optional

    // Private constructor so objects can only be created via the Builder
    private Employee(EmployeeBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
        this.gender = builder.gender;
        this.bloodGroup = builder.bloodGroup;
    }

    // Getters (No Setters to keep the class immutable)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", bloodGroup='" + bloodGroup + '\'' +
                '}';
    }

    // Static nested Builder class
    public static class EmployeeBuilder {
        private final String id;
        private final String name;
        private final int age;
        private Gender gender;
        private String bloodGroup;

        // Constructor enforces mandatory fields
        public EmployeeBuilder(String id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        // Setter-like methods for optional fields return 'this' for chaining
        public EmployeeBuilder gender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public EmployeeBuilder bloodGroup(String bloodGroup) {
            this.bloodGroup = bloodGroup;
            return this;
        }

        // The final build method that constructs the target object
        public Employee build() {
            // Optional: Add validation logic here before instantiating
            return new Employee(this);
        }
    }
}
