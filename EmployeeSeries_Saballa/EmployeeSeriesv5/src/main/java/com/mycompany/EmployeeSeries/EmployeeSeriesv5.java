/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.EmployeeSeries;
import com.mycompany.employeeseriesv5.v5.*;

/**
 *
 * @author User
 */
public class EmployeeSeriesv5 {

    public static void main(String[] args) {
        HourlyEmployee test1 = new HourlyEmployee(1000, 400, new EmpName("Jericho","Rureas","A"),new Date(8,5,2004), new Date(2024,9,15), 1001);
        PieceWorkerEmployee test2 = new PieceWorkerEmployee(50000, 50, new EmpName("Chase","Clifford","V"),new Date(5,20,2004), new Date(2024,9,15), 1002);
        CommissionEmployee test3 = new CommissionEmployee(5000.00, new EmpName("Dusky","Saballa","S"),new Date(5,5,2004), new Date(2024,9,15), 1003);
        BasePlusCommissionEmployee test4 = new BasePlusCommissionEmployee(15000.00, 2000, new EmpName("Dusky","Samson","S"),new Date(3,5,2004), new Date(2024,9,15), 1004);
//        test1.display();
//        test2.display();
//        test3.display();
//        test4.display();
        
        EmployeeRoster emplist = new EmployeeRoster();
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
