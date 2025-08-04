public class employeemanagement {
    private Employee[] employees = new Employee[10];
    private int count = 0;


    public void addEmployee(Employee e) {
        if (count < employees.length) {
            employees[count++] = e;
            System.out.println("Employee added.");
        } else {
            System.out.println("Employee list full!");
        }
    }


    public Employee searchEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                return employees[i];
            }
        }
        return null;
    }


    public void displayAllEmployees() {
        for (int i = 0; i < count; i++) {
            employees[i].display();
        }
    }


    public boolean deleteEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {

                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--count] = null;
                return true;
            }
        }
        return false;
    }

}
