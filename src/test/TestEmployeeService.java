package test;

import designer.Designer;
import developer.Developer;
import employee.Employee;
import manager.Manager;
import employee.Gender;
import employee.EmployeeService;

public class TestEmployeeService extends Test {
    private EmployeeService employeeService;

    public void testEmployeeFabric() {

    }

    public TestEmployeeService() {
        testEmployeeFabric();

        Employee[] employees = {
                new Manager(12, "Harry", 31, 700, Gender.MALE),
                new Designer(2, "Ira", 18, 500, Gender.FEMALE, 10, 5),
                new Developer(0, "Alex", 20, 10_000, Gender.MALE, 100)
        };

        employeeService = new EmployeeService(employees);

        testCalculateSalaryAndBonus();
        testGetById();
        testGetByName();
        testSortByName();
        testSortByNameAndSalary();
        testEdit();
        testAdd();
        testRemove();
    }

    public void testCalculateSalaryAndBonus() {
        String testId = "TestEmployeeService -> calculateSalaryAndBonus()";

        int totalSum = 25_250;
        int totalSumIfDeveloperSalaryZero = 1250;

        double result = employeeService.calculateSalaryAndBonus();

        if(totalSum == (int) result || totalSumIfDeveloperSalaryZero == (int) result) {
            printPassed(testId);
            return;
        }

        printFailed(testId, "Expected:" + totalSum + " or "
                + totalSumIfDeveloperSalaryZero + " actual:" + result);
    }

    public void testGetById() {
        String testId = "TestEmployeeService -> getById()";
        Employee expected = employeeService.getEmployees()[0];
        Employee actual   = employeeService.getById(12);
        assertEquals(testId, expected, actual);
    }

    public void testGetByName() {
        String testId = "TestEmployeeService -> getByName()";
        Employee[] expected = { employeeService.getEmployees()[2] };
        Employee[] actual   = employeeService.getByName("Alex").getEmployees();
        assertEquals(testId, expected, actual);
    }

    public void testSortByName() {
        String testId = "TestEmployeeService -> sortByName()";
        Employee[] expected = { employeeService.getEmployees()[2],
                                employeeService.getEmployees()[0],
                                employeeService.getEmployees()[1]};

        Employee[] actual   = employeeService.sortByName().getEmployees();
        assertEquals(testId, expected, actual);
    }

    public void testSortByNameAndSalary() {
        String testId = "TestEmployeeService -> sortByNameAndSalary()";
        Employee[] expected = { employeeService.getEmployees()[2],
                                employeeService.getEmployees()[0],
                                employeeService.getEmployees()[1]};

        Employee[] actual   = employeeService.sortByNameAndSalary().getEmployees();
        assertEquals(testId, expected, actual);
    }

    public void testEdit() {
        String testId = "TestEmployeeService -> edit()";
        Employee actual = new Manager(12, "Dumbledore", 132, 700, Gender.MALE);
        employeeService.edit(actual);
        assertEquals(testId, actual, employeeService.getEmployees()[0]);
    }

    public void testAdd() {
        String testId = "TestEmployeeService -> add()";
        Employee actual = new Manager(13, "Germoina", 21, 200, Gender.FEMALE);
        employeeService.add(actual);
        assertEquals(testId, actual, employeeService.getEmployees()[employeeService.getEmployees().length - 1]);
    }

    public void testRemove() {
        String testId = "TestEmployeeService -> remove()";
        Employee actual = employeeService.getEmployees()[employeeService.getEmployees().length - 2];
        employeeService.remove(13);
        assertEquals(testId, actual, employeeService.getEmployees()[employeeService.getEmployees().length - 1]);
    }


}
