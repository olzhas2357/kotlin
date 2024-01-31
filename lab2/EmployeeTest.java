package lab2;

public class EmployeeTest {
    public static void main(String[] args){
        Employee emp = new Employee(0, null, null, 0);
        emp.setEmpId(101);
        emp.setName("Jane Smith");
        emp.setSSN("012-34-5678");
        emp.setSalary(120_345.0);
        
        System.out.println("Employee id:     " + emp.getEmpId());
        System.out.println("Employee name:   " + emp.getName());
        System.out.println("Employee Soc Sec " + emp.getSSN());
        System.out.println("Employee salary  " + emp.getSalary());
    }    
}
