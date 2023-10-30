package org.example;
import java.util.Comparator;

public class Employee {
    private static final int CURRENT_YEAR = 2022;
    String name;
    String midName;
    String surName;
    String position;
    String phone;
    int salary;
    int birth;
    private String dateOfBirth;

    public Employee(String name, String midName, String surName, String position, String phone, int salary, int birth, String dateOfBirth) {
        this.name = name;
        this.midName = midName;
        this.surName = surName;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getMidName() {
        return midName;
    }

    public String getSurName() {
        return surName;
    }

    public String getPosition() {
        return position;
    }

    public String getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return CURRENT_YEAR - birth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public void info() {
        System.out.println("Employee: " + name + " " + midName + " " + surName + ", position: "
                + position + ", phone: " + phone + ", salary: " + salary + ", age: " + getAge());
    }

    public void printInfo() {
        System.out.printf("Employee: %s %s %s, position: %s, phone: %s, salary: %d, age: %d%n",
                name, midName, surName, position, phone, salary, getAge());
    }

    public String getInfo() { // возврат значения
        return String.format("Employee: %s %s %s, position: %s, phone: %s, salary: %d, age: %d",
                name, midName, surName, position, phone, salary, getAge());
    }

    public void increaseSalary(int amount) {
        this.salary += amount;
    }

    public static void increaseSalaryForOlderEmployees(Employee[] employees, int age, int amount) {
        for (Employee employee : employees) {
            if (employee.getAge() > age) {
                employee.setSalary(employee.getSalary() + amount);
            }
        }
    }

    public static Comparator<Employee> dateComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee emp1, Employee emp2) {
            String[] dateParts1 = emp1.getDateOfBirth().split("-");
            String[] dateParts2 = emp2.getDateOfBirth().split("-");

            int year1 = Integer.parseInt(dateParts1[0]);
            int month1 = Integer.parseInt(dateParts1[1]);
            int day1 = Integer.parseInt(dateParts1[2]);

            int year2 = Integer.parseInt(dateParts2[0]);
            int month2 = Integer.parseInt(dateParts2[1]);
            int day2 = Integer.parseInt(dateParts2[2]);

            if (year1 != year2) {
                return year1 - year2;
            } else if (month1 != month2) {
                return month1 - month2;
            } else {
                return day1 - day2;
            }
        }
    };
}
