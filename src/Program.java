import Employee.Employee;
import Employee.EmployeeFabric;
import Employee.EmployeeService;

import Test.TestEmployeeService;

public class Program {
    public static void main(String[] args) {
        EmployeeFabric employeeFabric = new EmployeeFabric();
        Employee[] employees = employeeFabric.generate(20);
        EmployeeService employeeService = new EmployeeService(employees);
        employeeService.printEmployees();

        System.out.println("--- Sorted by name:");
        employeeService.sortByName().printEmployees();

        System.out.println("--- Sorted by name and salary:");
        employeeService.sortByNameAndSalary().printEmployees();

        System.out.println("--- Get total salary:");
        System.out.println(employeeService.calculateSalaryAndBonus());
        System.out.println("--- --- --- ---");

        new TestEmployeeService();

    }
}
