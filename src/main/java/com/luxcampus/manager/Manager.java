package com.luxcampus.manager;

import com.luxcampus.employee.Employee;
import com.luxcampus.employee.Gender;

public class Manager extends Employee {
    public Manager(long id, String name, int age, int salary, Gender gender) {
        super(id, name, age, salary, gender);
    }

    public Manager(Employee employee) {
        super(employee);
    }

    @Override
    public String toString() {
        return "Manager:\t" + super.toString();
    }
}
