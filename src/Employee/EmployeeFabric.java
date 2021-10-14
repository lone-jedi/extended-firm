package Employee;

import Designer.Designer;
import Developer.Developer;
import Manager.Manager;

import java.util.Random;

import Manager.ManagerFabric;
import Developer.DeveloperFabric;
import Designer.DesignerFabric;

public class EmployeeFabric {
    static private int id = 1;

    static public Employee generateEmployee() {
        Random random = new Random();
        int id = EmployeeFabric.id++;
        String[] maleNames = {"Alex", "Tom", "Yan", "Tim", "Igor", "Max"};
        String[] femaleNames = {"Kate", "Anna", "Irina", "Jenifer", "Jessica", "Elena"};

        boolean isMale = random.nextBoolean();
        String name = isMale ? maleNames[random.nextInt(maleNames.length)] :
                femaleNames[random.nextInt(femaleNames.length)];

        int age = random.nextInt(60) + 16;
        int salary = random.nextInt(10_000) + 200;
        Gender gender = isMale ? Gender.MALE : Gender.FEMALE;

        return new Employee(id, name, age, salary, gender);
    }

    public Employee generate() {
        Random random = new Random();
        Employee employee = null;

        switch (random.nextInt(3))  {
            case 0:
                employee = (new ManagerFabric()).generate();
                break;
            case 1:
                employee = (new DeveloperFabric()).generate();
                break;
            case 2:
                employee = (new DesignerFabric()).generate();
                break;
        }

        return employee;
    }

    public Employee[] generate(int size) {
        Employee[] employees = new Employee[size];
        for (int i = 0; i < size; i++) {
            employees[i] = generate();
        }
        return employees;
    }
}
