/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.EmployeeSeries.version4;

/**
 *
 * @author User
 */
public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    public BasePlusCommissionEmployee() {
    }

    public BasePlusCommissionEmployee(EmpName name, int id) {
        super(name, id);
    }

    public BasePlusCommissionEmployee(double totalSales, EmpName name, Date dateHired, Date dob, int id) {
        super(totalSales, name, dateHired, dob, id);
    }

    public BasePlusCommissionEmployee(double baseSalary, double totalSales, EmpName name, Date dateHired, Date dob, int id) {
        super(totalSales, name, dateHired, dob, id);
        this.baseSalary = baseSalary;
    }
    
    public BasePlusCommissionEmployee(CommissionEmployee e){
        super(e.getTotalSales(), e.getName(), e.getDateHired(), e.getDob(), e.getId());
    }
    
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    @Override
    public double computeSalary(){
        return super.computeSalary() + this.baseSalary;
    }
}
