package practice;

public class Manager {
    private String deptName;
    
    public Manager(String deptName){ // constructor
        this.deptName = deptName;
    }

    public String getDeptName(){
        return deptName;
    }
     
    public void setDeptName(String deptName){
        this.deptName = deptName;
    }
    public static void main(String[] args) {
        Employee emp = new Employee(0, null, null, 0);
        Manager mnr = new Manager(null);
        emp.setEmpId(101);
        emp.setName("Jane Smith");
        emp.setSSN("012-34-5678");
        emp.raiseSalary(120_345.27);    
        mnr.setDeptName("US Marketing");
        System.out.println(emp.getEmpId());
        System.out.println(emp.getName());
        System.out.println(emp.getSSN());
        System.out.println(emp.getSalary());
        System.out.println(mnr.getDeptName());
    }
}
