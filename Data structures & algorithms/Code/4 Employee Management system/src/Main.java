public class Main {
    public static void main(String[] args) {
        employeemanagement system = new employeemanagement();

        system.addEmployee(new Employee(1, "Hari", "Manager", 6000));
        system.addEmployee(new Employee(2, "Saran", "Engineer", 50000));

        System.out.println("Current Employees:");
        system.displayAllEmployees();

        System.out.println("Searching for Employee with ID 2...");
        Employee found = system.searchEmployee(2);
        if (found != null) {
            System.out.println("Employee Found:");
            found.display();
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println("Attempting to delete Employee with ID 1...");
        boolean deleted = system.deleteEmployee(1);
        if (deleted) {
            System.out.println("Employee deleted successfully.");
        } else {
            System.out.println("Employee not found. Nothing deleted.");
        }

        System.out.println("Updated Employee List:");
        system.displayAllEmployees();
    }
}