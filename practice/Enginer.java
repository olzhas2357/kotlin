package practice;

public class Enginer {
    public static void main(String[] args) {
        Employee emp = new Employee(0, null, null, 0);
        emp.setEmpId(101);
        emp.setName("Jane Smith");
        emp.setSSN("012-34-5678");
        emp.raiseSalary(120_345.27);    
        System.out.println(emp.getEmpId());
        System.out.println(emp.getName());
        System.out.println(emp.getSSN());
        System.out.println(emp.getSalary());
    }    
}
