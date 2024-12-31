/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.EmployeeSeries;

/**
 *
 * @author jl
 */
public class EmployeeSeriesV7Main {

    public static void main(String[] args) {
        com.mycompany.EmployeeSeries.version7.HourlyEmployee test1 = new com.mycompany.EmployeeSeries.version7.HourlyEmployee(1000, 400, new com.mycompany.EmployeeSeries.version7.EmpName("Dusky","Saballa","S."),new com.mycompany.EmployeeSeries.version7.Date(8,5,2004), new com.mycompany.EmployeeSeries.version7.Date(2024,9,15), 1001);
        com.mycompany.EmployeeSeries.version7.PieceWorkerEmployee test2 = new com.mycompany.EmployeeSeries.version7.PieceWorkerEmployee(50000, 50, new com.mycompany.EmployeeSeries.version7.EmpName("Dusky Lorenz","CoSaballa","BS"),new com.mycompany.EmployeeSeries.version7.Date(5,20,2004), new com.mycompany.EmployeeSeries.version7.Date(2024,9,15), 1002);
        com.mycompany.EmployeeSeries.version7.CommissionEmployee test3 = new com.mycompany.EmployeeSeries.version7.CommissionEmployee(5000.00, new com.mycompany.EmployeeSeries.version7.EmpName("Ethan","Saballa","S"),new com.mycompany.EmployeeSeries.version7.Date(5,5,2004), new com.mycompany.EmployeeSeries.version7.Date(2024,9,15), 1003);
        com.mycompany.EmployeeSeries.version7.BasePlusCommissionEmployee test4 = new com.mycompany.EmployeeSeries.version7.BasePlusCommissionEmployee(15000.00, 2000, new com.mycompany.EmployeeSeries.version7.EmpName("NIg","DUsky","J"),new com.mycompany.EmployeeSeries.version7.Date(3,5,2004), new com.mycompany.EmployeeSeries.version7.Date(2024,9,15), 1004);
//        test1.display();
//        test2.display();
//        test3.display();
//        test4.display();
        
        com.mycompany.EmployeeSeries.version7.EmployeeRoster emplist = new com.mycompany.EmployeeSeries.version7.EmployeeRoster();
        emplist.addEmployee(test1);
        emplist.addEmployee(test2);
        emplist.addEmployee(test3);
        emplist.addEmployee(test4);
        
        System.out.printf("Count of CE: %d\n",emplist.countCE());
        System.out.printf("Count of PWE: %d\n",emplist.countPWE());
        System.out.printf("Count of BPCE: %d\n",emplist.countBPCE());
        System.out.printf("Count of HE: %d\n",emplist.countHE());
        
        emplist.displayAllEmployee();
        
        emplist.removeEmployee(1003);
        emplist.displayAllEmployee();
        
        System.out.printf("Count of CE: %d\n",emplist.countCE());
        System.out.printf("Count of PWE: %d\n",emplist.countPWE());
        System.out.printf("Count of BPCE: %d\n",emplist.countBPCE());
        System.out.printf("Count of HE: %d\n",emplist.countHE());
    }
}

