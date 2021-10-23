package com.luxcampus.developer;

import com.luxcampus.employee.Employee;
import com.luxcampus.employee.EmployeeFabric;

import java.util.Random;

public class DeveloperFabric {
    public Developer generate() {
        Random random = new Random();
        Employee employee = EmployeeFabric.generateEmployee();
        int fixedBugs = random.nextInt(100);
        return new Developer(employee, fixedBugs);
    }

    public Developer[] generate(int size) {
        Developer[] developers = new Developer[size];
        for (int i = 0; i < size; i++) {
            developers[i] = generate();
        }
        return developers;
    }
}
