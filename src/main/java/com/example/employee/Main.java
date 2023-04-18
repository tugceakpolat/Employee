package com.example.employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Tuğçe Akpolat", 2000,45, 1995);
        // without overriding toString() method
        employee.employeInfo();

        // with overriding toString() method
        System.out.println(employee);
    }
    }


