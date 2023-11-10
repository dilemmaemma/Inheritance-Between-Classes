public class InheritanceChecker {
    public static void main(String[] args) {
        Employee employee = new Employee("Emma", 23, "Female", "123456789", "Manager");;

        System.out.println("Name: " + employee.getName() + ", Age: " + employee.getAge() + ", Gender: " + employee.getGender());
        
        if (employee.getEmployeeId() == null) {
            System.out.println(employee.getName() + " is unemployed");
        } else {
            System.out.println(employee.getName() + " is a/an " + employee.getTitle());
        }
    }
}
