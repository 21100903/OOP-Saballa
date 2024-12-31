/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.EmployeeSeries.version4;

/**
 *
 * @author User
 */
public class EmpName {
    public String fName;
    public String lName;
    public String mName;

    public EmpName() {
    }

    public EmpName(String fName, String lName, String mName) {
        this.fName = fName;
        this.lName = lName;
        this.mName = mName;
    }
    
    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getmName() {
        return mName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setMI(String mName) {
        this.mName = mName;
    }
    
    public void display(){
        System.out.print(lName + ", " + fName);
        if(this.mName.equals("")){
            System.out.print(", " + mName);
        }
        System.out.print(" - ");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nFirst Name: ").append(fName);
        sb.append("\nLast Name: ").append(lName);
        sb.append("\nMI: ").append(mName);     
        return sb.toString();
    }
}
