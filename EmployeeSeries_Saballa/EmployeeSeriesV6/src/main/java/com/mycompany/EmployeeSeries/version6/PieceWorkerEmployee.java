/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.EmployeeSeries.version6;

/**
 *
 * @author janse
 */
public class PieceWorkerEmployee extends Employee{
    private int totalPiecesFinished; 
    private double ratePerPiece;

    public PieceWorkerEmployee() {
    }

    public PieceWorkerEmployee(EmpName name, int empID){
        super(name, empID);
    }
    
    public PieceWorkerEmployee(EmpName name, Date startDate, Date endDate, int empID){
        super(name, startDate, endDate, empID);
    }

    public PieceWorkerEmployee(int totalPiecesFinished, double ratePerPiece) {
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceWorkerEmployee(int totalPiecesFinished, double ratePerPiece, EmpName name, Date dateHired, Date dob, int id) {
        super(name, dateHired, dob, id);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public double getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(double ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }
    
    @Override
    public double computeSalary(){
       return (this.totalPiecesFinished * this.ratePerPiece) + ((this.totalPiecesFinished/100) * (this.ratePerPiece * 10)); 
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Total Pieces Finished = ").append(totalPiecesFinished);
        sb.append(", Rate Per Piece = ").append(ratePerPiece);
        return sb.toString();
    }
    
    @Override
    public void display(){
        super.display();
        System.out.printf("Salary:  %f\n",computeSalary());
    }
}

