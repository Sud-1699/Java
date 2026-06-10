package design.pattern.creational.builder;

import java.util.UUID;

public class BuilderPattern {
    public static void main(String[] args) {
        Employee employee = new Employee.EmployeeBuilder(UUID.randomUUID().toString(), "Builder", 26)
                .gender(Gender.MALE)
                .bloodGroup("O+ve")
                .build();

        System.out.println(employee);
    }
}
