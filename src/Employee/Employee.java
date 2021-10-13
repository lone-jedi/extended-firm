package Employee;

public class Employee {
    protected long id;
    protected String name;
    protected int age;
    protected double salary;
    protected Gender gender;

    public Employee() {}

    public Employee(long id, String name, int age, double salary, Gender gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
    }

    public double totalSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender=" + gender;
    }
}
