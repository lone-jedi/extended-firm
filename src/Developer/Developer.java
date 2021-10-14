package Developer;

import Employee.Employee;
import Employee.Gender;

import java.util.Random;

public class Developer extends Employee {
    private int fixedBugs;

    public Developer(long id, String name, int age, int salary, Gender gender, int fixedBugs) {
        super(id, name, age, salary, gender);
        this.fixedBugs = fixedBugs;
    }

    @Override
    public double totalSalary() {
        return (salary + fixedBugs * 20) *
                (new Random().nextBoolean() ? 2 : 0);
    }

    @Override
    public String toString() {
        return "Developer: " +
                super.toString() +
                ", fixedBugs=" + fixedBugs;
    }
}
