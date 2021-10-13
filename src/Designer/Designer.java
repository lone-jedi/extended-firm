package Designer;

import Employee.Employee;
import Employee.Gender;

public class Designer extends Employee {
    private int workedDays;
    private double rate;

    public Designer(long id, String name, int age, double salary, Gender gender, int workedDays, double rate) {
        super(id, name, age, salary, gender);
        this.workedDays = workedDays;
        this.rate = rate;
    }

    @Override
    public double totalSalary() {
        return salary + rate * workedDays;
    }

    @Override
    public String toString() {
        return "Designer: " +
                super.toString() +
                "workedDays=" + workedDays +
                ", rate=" + rate;
    }
}
