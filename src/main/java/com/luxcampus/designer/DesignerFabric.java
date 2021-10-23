package com.luxcampus.designer;

import java.util.Random;

import com.luxcampus.employee.Employee;
import com.luxcampus.employee.EmployeeFabric;

public class DesignerFabric {
    public Designer generate() {
        Random random = new Random();
        Employee employee = EmployeeFabric.generateEmployee();
        int workedDays = random.nextInt(10_000);
        int rate = random.nextInt(100);
        return new Designer(employee, workedDays, rate);
    }

    public Designer[] generate(int size) {
        Designer[] designers = new Designer[size];
        for (int i = 0; i < size; i++) {
            designers[i] = generate();
        }
        return designers;
    }
}
