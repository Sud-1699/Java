package designpattern.creational.builder;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee.EmployeeBuilder(UUID.randomUUID().toString(), "Facade", 26)
                .gender(Gender.MALE)
                .bloodGroup("O+ve")
                .build();

        System.out.println(employee);
    }
}
