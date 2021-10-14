package Employee;

public class EmployeeService {
    private Employee[] employees;

    public Employee[] getEmployees() {
        return employees;
    }

    public EmployeeService(Employee[] employees) {
        this.employees = employees;
    }

    public void printEmployees() {
        for(Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public double calculateSalaryAndBonus() {
        double totalSalary = 0.0;
        for(Employee employee : employees) {
            totalSalary += employee.totalSalary();
        }
        return totalSalary;
    }


}
