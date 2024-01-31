package practice;

public class Admin {
    public static void main(String[] args) {
        Employee emp = new Employee(0, null, null, 0);
        emp.setEmpId(304);
        emp.setName("Bill Monroe");
        emp.setSSN("108-23-6509");
        emp.raiseSalary(75_002.27);    
        System.out.println(emp.getEmpId());
        System.out.println(emp.getName());
        System.out.println(emp.getSSN());
        System.out.println(emp.getSalary());
    }
}
