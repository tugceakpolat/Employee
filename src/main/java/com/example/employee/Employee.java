package com.example.employee;

public class Employee {

    String employeNameSurname;
    double salary;
    int weekWorkHour;
    int startingYear;

    public Employee(String employeNameSurname, int salary, int weekWorkHour, int startingYear){
        this.employeNameSurname = employeNameSurname;
        this.salary = salary;
        this.weekWorkHour = weekWorkHour;
        this.startingYear = startingYear;

    }

    public double taxCalculate(){
        //  If the employee's salary is more than 1000 TL, 3% of his salary is taxed.
        double tax=0;
        if (salary > 1000){
            tax = salary * 0.03;
        }
        return tax;

    }

    public double bonusCalculate(){
        //f the employee has worked more than 40 hours per week,30 TL per hour.
        double bonus=0;
        int extraHour = weekWorkHour - 40;
            if (extraHour >0){
               bonus = extraHour * 30;
            }
        return bonus;
    }

    public double raiseSalary() {
        //10 years %5
        //10-20 years %10
        //20 years and more %15
        int currentYear = 2022;
        int yearsWorked = currentYear - startingYear;
        double salaryRaise = 0;
        if (yearsWorked < 10) {
            salaryRaise = salary * 0.05;
        } else if (yearsWorked >= 10 && yearsWorked < 20) {
            salaryRaise = salary * 0.1;
        }else{
            salaryRaise = salary * 0.15;
        }

      return salaryRaise;
    }

    public double totalSalary(){
        return salary + bonusCalculate() + raiseSalary() - taxCalculate();
    }


//        public void employeInfo(){
//        System.out.println("Name Surname: " + this.employeNameSurname);
//        System.out.println("Salary's : " + this.salary);
//        System.out.println("Starting Year : " + this.startingYear);
//        System.out.println("Tax : " + taxCalculate());
//        System.out.println("Bonus : " + bonusCalculate());
//        System.out.println("Salary increase : " + raiseSalary());
//        System.out.println("Salary with bonus & tax : " + (salary +bonusCalculate() - taxCalculate()));
//        System.out.println("Total salary : " + totalSalary());
//    }

    //override method.
    public String toString(){
        return "Name Surname: " + this.employeNameSurname + "\nSalary's : " + this.salary +"\nTax : " + taxCalculate() +"\nBonus : "
                + bonusCalculate() +"\nSalary increase : " + raiseSalary() + "\nSalary with bonus & tax : " + (salary +bonusCalculate())
               + "\nTotal salary : " + totalSalary();
    }
}

