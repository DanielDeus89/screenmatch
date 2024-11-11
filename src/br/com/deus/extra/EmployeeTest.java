package br.com.deus.extra;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Daniel","Deus","333-333-333");
        EmployeeCommission  employeeCommission = new EmployeeCommission("Heitor","Damin","123-123-123",1000,100);

        System.out.println(employee);
        System.out.println();
        System.out.println(employeeCommission);


    }
}
