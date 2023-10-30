package org.example;

import java.util.Arrays;

import static org.example.Employee.dateComparator;
import static org.example.Employee.increaseSalaryForOlderEmployees;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static void main(String[] args) {



        Employee andrey = new Employee("Andrey", "Alekseevich", "Arbuzov", "department_head", "+375 29 158-58-58", 2000, 1971, "1971-12-12");
        Employee boris = new Employee("Boris", "Bogdanovich", "Burov", "saler", "+375 33 258-78-98", 1200, 1995, "1995-11-11");
        Employee gleb = new Employee("Gleb", "Grigorevich", "Gromov", "saler", "+375 29 568-47-23", 1400, 1978, "1978-10-10");
        Employee dmitriy = new Employee("Dmitriy", "Danilovich", "Drozdov", "driver", "+375 33 265-74-69", 1350, 1969, "1969-09-09");
        Employee pavel = new Employee("Pavel", "Petrovich", "Pushkin", "loader", "+375 44 785-96-22", 1150, 1996, "1996-08-08");
        Manager sergey = new Manager("Sergey", "Stanislavovich", "Sarnov", "manager", "+375 29 456-77-99", 3500, 1982, "1982-07-07");

        Employee[] company = new Employee[6];
        company[0] = andrey;
        company[1] = boris;
        company[2] = gleb;
        company[3] = dmitriy;
        company[4] = pavel;
        company[5] = sergey;

        for (int i = 0; i < company.length; i++) {
            company[i].info();
        };
        System.out.println("Average age: " + averageAge(company));
        System.out.println("Average salary: " + averageSalary(company));

        sergey.increaseSalaryForEmployees(company, 1000);
        increaseSalaryForOlderEmployees(company, 45, 500);

        for (int i = 0; i < company.length; i++) {
            System.out.println(company[i].getInfo());
        };


    }

    private static void increaser(Employee[] emp, int amount) {
        for (int i = 0; i < emp.length; i++) {
            if (emp[i].getAge() > 45) {
                emp[i].increaseSalary(amount);
            }
        }
    }

    private static float averageSalary(Employee[] emp){
        float result = 0;
        for (int i = 0; i < emp.length; i++)
            result += emp[i].getSalary();
        return result/emp.length;
    }

    private static float averageAge(Employee[] emp){
        float result = 0;
        for (int i = 0; i < emp.length; i++)
            result += emp[i].getAge();
        return result/emp.length;
    }





}