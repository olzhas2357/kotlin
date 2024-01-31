package practice;
// import java.util.Scanner;

public class Employee {
    public int empId;
    public String name;
    public String ssn;
    public double salary;
    
    public Employee(int empId, String name, String ssn, double salary){ // constructor
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary; 
    }

    public void setEmpId(int empId){
        this.empId = empId;
    }
    public int getEmpId(){
        return empId;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setSSN(String ssn){
        this.ssn = ssn;
    }
    public String getSSN(){
        return ssn;
    }
    public void raiseSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }
}
