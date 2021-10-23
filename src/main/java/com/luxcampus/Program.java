package com.luxcampus;

import com.luxcampus.employee.Employee;
import com.luxcampus.employee.EmployeeFabric;
import com.luxcampus.employee.EmployeeService;

import com.luxcampus.test.TestEmployeeService;

import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {
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

        System.in.read();
    }
}
