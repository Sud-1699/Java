"# Java Note and Example" 

__Java 8 features__
```
stream api
method reference
functional interface
lambda function
date time api
```

__Java 17 features__
```
sealed class
    ```
        // Sealed class allowing only specific subclasses
        public sealed class Vehicle permits Car, Bike {}
        
        // `final` class - cannot be extended further
        public final class Car extends Vehicle {}
        
        // `non-sealed` class - can be extended further
        public non-sealed class Bike extends Vehicle {}
        
        // ✅ Allowed: ElectricBike can extend Bike (since Bike is non-sealed)
        public class ElectricBike extends Bike {}
        
        public class Main {
            public static void main(String[] args) {
                Vehicle v1 = new Car(); // ✅ Allowed
                Vehicle v2 = new Bike(); // ✅ Allowed
                Vehicle v3 = new ElectricBike(); // ✅ Allowed (due to non-sealed)
            }
        }
    ```
record
    ```
        public record Employee(String name, int age) {}
    ```
    immutable
    compact constructor
        ```
            public record Employee(String name, int age) {
                public Employee {
                    if (age < 18) {
                        throw new IllegalArgumentException("Age must be 18 or above");
                    }
                }
            }
        ```
multi line string literal
Pattern Matching for switch
    ```
    switch (obj) {
            case Integer i -> System.out.println("Integer: " + (i * 2));
            case String s -> System.out.println("String: " + s.toUpperCase());
            case Double d -> System.out.println("Double: " + (d + 10.5));
            case null -> System.out.println("Null value provided!");
            default -> System.out.println("Unknown type!");
        }
    ```
instanceof pattern matching with conditional
    obj instanceof String str
    obj instanceof String str && str.equals("hello")
strictfp
```