/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.EmployeeSeries.version4;

/**
 *
 * @author User
 */
public class Date {
    public int month;
    public int day;
    public int year;
 
    
    public Date(){
        
    }

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }
    
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(year);
        sb.append("/").append(month);
        sb.append("/").append(day);
        return sb.toString();
    }
    
    public void display(){
        System.out.printf(this.toString());
    }
    
    
    
}
