package Manager;

import Employee.Employee;
import Employee.Gender;

public class Manager extends Employee {
    public Manager(long id, String name, int age, int salary, Gender gender) {
        super(id, name, age, salary, gender);
    }

    @Override
    public String toString() {
        return "Manager: " + super.toString();
    }
}
