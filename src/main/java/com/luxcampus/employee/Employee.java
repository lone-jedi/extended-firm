package com.luxcampus.employee;

public class Employee {
    protected long id;
    protected String name;
    protected int age;
    protected int salary;
    protected Gender gender;

    public long getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public Gender getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public Employee() {}

    public Employee(Employee employee) {
        id = employee.getId();
        name = employee.getName();
        age = employee.getAge();
        salary = employee.getSalary();
        gender = employee.getGender();
    }

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
        return String.format("id=%3d, name=%7s, age=%3d, salary=%5d, gender=%6s",
                id, name, age, salary, gender);
    }

    public boolean isBigger(Employee compared) {
        if(this.name.equals(compared.getName())) {
            return this.getSalary() > compared.getSalary();
        }
        return this.name.compareTo(compared.getName()) > 0;
    }
}
