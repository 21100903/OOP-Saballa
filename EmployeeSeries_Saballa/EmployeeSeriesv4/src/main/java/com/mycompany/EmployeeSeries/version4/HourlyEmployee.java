/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.EmployeeSeries.version4;

/**
 *
 * @author User
 */
public class HourlyEmployee extends Employee{
    private float totalHoursWorked;
    private double ratePerHour;

    public HourlyEmployee() {
    }

    public HourlyEmployee(EmpName name, int empID){
        super(name, empID);
    }
    
    public HourlyEmployee(EmpName name, Date startDate, Date endDate, int empID){
        super(name, startDate, endDate, empID);
    }

    public HourlyEmployee(float totalHoursWorked, double ratePerHour) {
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(float totalHoursWorked, double ratePerHour, EmpName name, Date dateHired, Date dob, int id) {
        super(name, dateHired, dob, id);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }
    
    public double computeSalary() {
        if (this.totalHoursWorked <= 40) {
            return this.ratePerHour * this.totalHoursWorked;
        } else {
            return 40 * this.ratePerHour + ((this.totalHoursWorked - 40) * this.ratePerHour * 1.5);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hourly Employee");
        sb.append("\nEmployee Name:").append(name);
        sb.append("\nTotal Hours Worked = ").append(totalHoursWorked);
        sb.append("\nratePerHour = ").append(ratePerHour);
        return sb.toString();
    }
    
    @Override
    public void display(){
        super.display();
        System.out.printf("Salary:  %f\n\n",computeSalary());
    }
    
    
}
