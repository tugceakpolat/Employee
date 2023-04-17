package com.example.employee;

public class Employee {

    String employeNameSurname;
    int salary;
    int weekWorkHour;
    int startingYear;

    public Employee(String employeNameSurname, int salary, int weekWorkHour, int startingYear){
        this.employeNameSurname = employeNameSurname;
        this.salary = salary;
        this.weekWorkHour = weekWorkHour;
        this.startingYear = startingYear;

    }

    public void taxCalculate(){
        //  If the employee's salary is more than 1000 TL, 3% of his salary is taxed.
        int tax=0;
        if (salary >= 1000){
            tax += salary * 0.03;
            System.out.println(tax);
        }

    }

    public void bonusCalculate(){
        //f the employee has worked more than 40 hours per week,30 TL per hour.
        int hourRaise=0;
        int hour = weekWorkHour -40;
            if (hour >0){
               hourRaise = hour*30;
            }
        System.out.println(hourRaise);




    }

    public void raisSalary(){

        

    }

    public void employeInfo(){
        System.out.println("Name Surname: " + this.employeNameSurname);
        System.out.println("Salary's : " + this.salary);
        System.out.println("Starting Year : " + this.startingYear);
        System.out.println("Tax: " );

    }
}

