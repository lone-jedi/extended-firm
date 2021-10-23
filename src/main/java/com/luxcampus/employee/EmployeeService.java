package com.luxcampus.employee;

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
        for (Employee employee : employees) {
            if(employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public EmployeeService getByName(String name) {
        int numberOfEmployees = 0;
        for (Employee employee : employees) {
            if(employee.getName().equals(name)) {
                numberOfEmployees++;
            }
        }

        Employee[] employeesByName = new Employee[numberOfEmployees];

        int counter = 0;
        for (Employee employee : employees) {
            if(employee.getName().equals(name)) {
                employeesByName[counter++] = employee;
            }
        }

        return new EmployeeService(employeesByName);
    }

    public EmployeeService sortByName() {
        Employee[] employees = this.employees.clone();

        for(int i = 0; i < employees.length; ++i) {
            int min = i;
            for(int j = i + 1; j < employees.length; ++j) {
                if(employees[min].getName().compareTo(employees[j].getName()) > 0) {
                    min = j;
                }
            }
            Employee temporary = employees[i] ;
            employees[i] = employees[min];
            employees[min] = temporary;
        }

        return new EmployeeService(employees);
    }

    public EmployeeService sortByNameAndSalary() {
        Employee[] employees = this.employees.clone();

        for(int i = 0; i < employees.length; ++i) {
            int min = i;
            for(int j = i + 1; j < employees.length; ++j) {
                if(employees[min].isBigger(employees[j])) {
                    min = j;
                }
            }
            Employee temporary = employees[i] ;
            employees[i] = employees[min];
            employees[min] = temporary;
        }

        return new EmployeeService(employees);
    }

    public Employee edit(Employee to) {
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getId() == to.getId()) {
                Employee from = employees[i];
                employees[i] = to;
                return from;
            }
        }

        return null;
    }

    public void add(Employee employee) {
        Employee[] newEmployees = new Employee[employees.length + 1];
        for (int i = 0; i < employees.length; i++) {
            newEmployees[i] = employees[i];
        }

        newEmployees[employees.length] = employee;
        employees = newEmployees;
    }

    public Employee remove(long id) {
        Employee[] newEmployees = new Employee[employees.length - 1];
        Employee deletedEmployee = null;
        int employeesCounter = 0;

        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getId() == id) {
                deletedEmployee = employees[i];
                continue;
            }

            if(employeesCounter > newEmployees.length - 1) {
                return null;
            }

            newEmployees[employeesCounter++] = employees[i];
        }

        employees = newEmployees;

        return deletedEmployee;
    }
}
