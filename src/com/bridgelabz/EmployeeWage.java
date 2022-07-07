package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage");
     //   int employeepresent = Math.random();
        double randomVal = Math.random();
        double floorVal = Math.floor(randomVal*10);
        int employeePresent =(int)Math.floor(Math.random()*10) % 2;
        System.out.println(employeePresent);
        if(employeePresent == 1)
            System.out.println("Employee is present");
        else
            System.out.println("Employee is absent");
    }
}
