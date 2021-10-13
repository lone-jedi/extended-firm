package Test;

import Designer.Designer;
import Developer.Developer;
import Employee.Employee;
import Manager.Manager;
import Employee.Gender;
import Employee.EmployeeService;

public class TestEmployee extends Test {
    private EmployeeService employeeService;

    public TestEmployee() {
        Employee[] employees = {
                new Manager(12, "Harry", 31, 700, Gender.MALE),
                new Designer(2, "Ira", 18, 500, Gender.FEMALE, 164, 5.5),
                new Developer(0, "Alex", 20, 120_000, Gender.MALE, 120)
        };

        employeeService = new EmployeeService(employees);
        // calculateSalaryAndBonus() can`t test due to Random().nextBoolean() at Developer
        System.out.println(employeeService.calculateSalaryAndBonus());
        // Test printEmployees
        employeeService.printEmployees();
    }





}
