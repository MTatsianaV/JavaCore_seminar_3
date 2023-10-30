package org.example;

class Manager extends Employee {
    public Manager(String name, String midName, String surName, String position, String phone, int salary, int birth, String dateOfBirth) {
        super(name, midName, surName, position, phone, salary, birth, dateOfBirth);
    }

    public void increaseSalaryForEmployees(Employee[] employees, int amount) {
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                employee.increaseSalary(amount);
            }
        }
    }
}
