package practice;

import java.text.NumberFormat;

public class Director extends Manager{
    private double budget;
    public Director(String deptName, double budget){
        super(deptName);
        this.budget = budget;
    }
    public double getBudget(){
        return budget;
    }
    public void setBudget(double budget){
        this.budget = budget;
    }   
    public static void main(String[] args) {
        Employee emp = new Employee(0, null, null, 0);
        Manager mnr = new Manager(null);
        Director dir = new Director(null, 0);
        emp.setEmpId(12);
        emp.setName("Susan Wheeler");
        emp.setSSN("099-45-2340");
        emp.raiseSalary(120_345.27);    
        mnr.setDeptName("Global Marketing");
        dir.setBudget(1_000_000.00);
        // NumberFormat.getCurrencyInstance().format(emp.getSalary());
        // NumberFormat.getCurrencyInstance();
        System.out.println(emp.getEmpId());
        System.out.println(emp.getName());
        System.out.println(emp.getSSN());
        System.out.println(emp.getSalary());
        System.out.println(mnr.getDeptName());
        System.out.println(dir.getBudget());
        System.out.println(NumberFormat.getCurrencyInstance().format(emp.getSalary()));
    }
}
