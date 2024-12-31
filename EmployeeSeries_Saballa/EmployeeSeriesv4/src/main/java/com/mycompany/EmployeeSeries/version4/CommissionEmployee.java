/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.EmployeeSeries.version4;

/**
 *
 * @author User
 */
public class CommissionEmployee extends Employee{
    public double totalSales;

    public CommissionEmployee() {
    }

    public CommissionEmployee(EmpName name, int id) {
        super(name, id);
    }

    public CommissionEmployee(EmpName name, Date dateHired, Date dob, int id) {
        super(name, dateHired, dob, id);
    }

    public CommissionEmployee(double totalSales, EmpName name, Date dateHired, Date dob, int id) {
        super(name, dateHired, dob, id);
        this.totalSales = totalSales;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }
    
    public double computeSalary(){
        float rate;
        if(this.totalSales < 10000){
            rate = 0.05f;
        } else if(this.totalSales >= 10000 && this.totalSales < 100000){
            rate = 0.1f;
        } else if(this.totalSales >= 100000 && this.totalSales < 1000000){
            rate = 0.2f;
        } else {
           rate = 0.3f;
        }
        return rate * totalSales;
    }    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Commission Employee");
        sb.append("\nEmployee Name:").append(name);
        sb.append("\nTotal Sales = ").append(totalSales);
        return sb.toString();
    }
    
    @Override
    public void display(){
        super.display();
        System.out.printf("Salary:  %f\n\n",computeSalary());
    }
}
