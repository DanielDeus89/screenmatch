package br.com.deus.exercicios;

public class CommissionEmployeeBasePlusTest {
    public static void main(String[] args) {

        CommissionEmployeeBasePlus employee = new CommissionEmployeeBasePlus(
                "Daniel","Deus","333-333-333",5000,0.1,8000);
        System.out.println("Employee information obtained by get methods:\n");
        System.out.printf("%s %s%n", "First name is", employee.getFirstName());
        System.out.printf("%s %s%n", "Last name is", employee.getLastName());
        System.out.printf("%s %s%n", "Social security number is", employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross sales is", employee.getGrossSales());
        System.out.printf("%s %.2f%n", "Commission rate is", employee.getCommissionRate());
        System.out.printf("%s %.2f%n", "Base salary is", employee.getBaseSalary());

        employee.setBaseSalary(1000);


        System.out.printf("%n%s:%n%n%s%n", "Updated employee information obtained by toString", employee.toString());





    }
}
