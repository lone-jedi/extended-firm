package designer;

import employee.Employee;
import employee.Gender;

public class Designer extends Employee {
    private int workedDays;
    private int rate;

    public Designer(long id, String name, int age, int salary, Gender gender, int workedDays, int rate) {
        super(id, name, age, salary, gender);
        this.workedDays = workedDays;
        this.rate = rate;
    }

    public Designer(Employee employee, int workedDays, int rate) {
        super(employee);
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
                ", workedDays=" + workedDays +
                ", rate=" + rate;
    }
}
