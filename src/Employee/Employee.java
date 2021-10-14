package Employee;

public class Employee {
    protected long id;
    protected String name;
    protected int age;
    protected int salary;
    protected Gender gender;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employee() {}

    public Employee(long id, String name, int age, int salary, Gender gender) {
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

    public boolean isBigger(Employee compared) {
        if(this.name.equals(compared.getName())) {
            return this.totalSalary() > compared.totalSalary();
        }
        return this.name.compareTo(compared.getName()) > 0;
    }
}
