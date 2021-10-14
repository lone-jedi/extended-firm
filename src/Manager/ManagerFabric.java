package Manager;

import Designer.Designer;
import Developer.Developer;
import Employee.Employee;
import Employee.EmployeeFabric;

public class ManagerFabric {
    public Manager generate() {
        return new Manager(EmployeeFabric.generateEmployee());
    }

    public Manager[] generate(int size) {
        Manager[] managers = new Manager[size];
        for (int i = 0; i < size; i++) {
            managers[i] = generate();
        }
        return managers;
    }
}
