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


    public Employee getById(long id) {
        return null;
    }

    public Employee[] getByName(String name) {
        return new Employee[0];
    }

    public Employee[] sortByName() {
        return new Employee[0];
    }

    public Employee[] sortByNameAndSalary() {
        return new Employee[0];
    }

    public Employee edit(Employee to) {
        return null;
    }

    public void add(Employee employee) {
    }

    public Employee remove(long id) {
        return null;
    }
}
