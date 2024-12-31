/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseriesv5.v5;

import java.util.ArrayList;

/**
 *
 * @author janse
 */
public class EmployeeRoster {
    ArrayList<Employee> myList;


    public EmployeeRoster() {
        myList = new ArrayList<>();
    }
    
    public boolean addEmployee(Employee emp){
        return myList.add(emp);
    }
    
    public Employee removeEmployee(int id) {
        for(int i = 0; i < myList.size(); ++i){
            if(myList.get(i).getId() == id){
                return myList.remove(i);
            }
        }
        return null;
    }
        
    public int countHE() {
        return (int) myList.stream().filter(emp -> emp instanceof HourlyEmployee).count();
    }
    
    public int countCE(){
        return (int) myList.stream().filter(emp -> emp instanceof CommissionEmployee && !(emp instanceof BasePlusCommissionEmployee)).count();
    }
    
    public int countBPCE(){
        return (int) myList.stream().filter(emp -> emp instanceof BasePlusCommissionEmployee).count();
    }
    
    public int countPWE(){
        return (int) myList.stream().filter(emp -> emp instanceof PieceWorkerEmployee).count();
    }
    
    public void displayHE(){
        System.out.println("Hourly Employees:");
        myList.stream().filter(emp -> emp instanceof HourlyEmployee).forEach(emp -> ((HourlyEmployee)emp).display());
    }
    
    public void displayCE(){
        System.out.println("Commission Employees:");
        myList.stream().filter(emp -> emp instanceof CommissionEmployee && !(emp instanceof BasePlusCommissionEmployee)).forEach(emp -> ((CommissionEmployee) emp).display());
    }
    
    public void displayBPCE(){
        System.out.println("Base Plus Commission Employees:");
        myList.stream().filter(emp -> emp instanceof BasePlusCommissionEmployee).forEach(emp -> ((BasePlusCommissionEmployee) emp).display());
    }
    
    public void displayPWE(){
        System.out.println("Piece Worker Employees:");
        myList.stream().filter(emp -> emp instanceof PieceWorkerEmployee).forEach(emp -> ((PieceWorkerEmployee) emp).display());
    }
     
    public void displayAllEmployee(){
        System.out.printf("%10s|%20s|%15s|%15s|%10s|%30s\n", "ID", "Name", "DateOfBirth", "DateHired", "Salary", "Type of Employee");
        myList.forEach(emp -> {
            System.out.printf("%10s|", emp.id);
            System.out.printf("%20s|", emp.name);
            System.out.printf("%15s|", emp.dob);
            System.out.printf("%15s|", emp.dateHired);

            if(emp instanceof BasePlusCommissionEmployee){
                System.out.printf("%,10.2f|", ((BasePlusCommissionEmployee) emp).computeSalary());
            } else if(emp instanceof CommissionEmployee){
                System.out.printf("%,10.2f|", ((CommissionEmployee) emp).computeSalary());
            } else if(emp instanceof HourlyEmployee){
                System.out.printf("%,10.2f|", ((HourlyEmployee) emp).computeSalary());
            } else if(emp instanceof PieceWorkerEmployee){
                System.out.printf("%,10.2f|", ((PieceWorkerEmployee) emp).computeSalary());
            }
            System.out.printf("%30s|\n", emp.getClass().getSimpleName());
        });
        
        System.out.println();
    }
}
