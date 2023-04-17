package com.example.employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Tuğçe Akpolat", 2000,45, 2010);
        employee.employeInfo();
        employee.taxCalculate();
        employee.bonusCalculate();


    }
    }


