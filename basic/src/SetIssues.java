import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetIssues {
    static class Employee {
        private int id;
        private String name;

        public Employee(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            if(this == obj) return true;
            if(obj == null || getClass() != obj.getClass()) return false;
            Employee emp = (Employee) obj;
            return id == emp.id && Objects.equals(name, emp.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    }

    public static void main(String[] args) {
        System.out.println("Try programiz.pro");

        Set<Employee> employees = new HashSet<>();

        employees.add(new Employee(101, "ABC"));
        employees.add(new Employee(101, "ABC"));

        System.out.println(employees.size());

        String s = "swiss";
        int left = 0, right = s.length() - 1;

        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                System.out.println(s.charAt(left));
                break;
            }

            left++;
            right--;
        }

        int[] nums = {1, 2, 3, 4, 2, 5, 1};
        Set<Integer> nums1 = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            nums1.add(nums[i]);
        }

        System.out.println(nums1);
    }
}
