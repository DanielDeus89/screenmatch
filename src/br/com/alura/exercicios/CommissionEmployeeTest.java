package br.com.alura.exercicios;

public class CommissionEmployeeTest {
    public static void main(String[] args) {
        CommissionEmployee commissionEmployee = new CommissionEmployee(
                "Daniel","Deus", "123123",1000.0,0.7);

        System.out.println("Employee information obtained by get methods: ");
        System.out.printf("%n%s %s", "First name: ", commissionEmployee.getFirstName());
        System.out.printf("%n%s %s", "Last name: ", commissionEmployee.getLastName());
        System.out.printf("%n%s %s", "Social security number: ", commissionEmployee.getSocialSecurityNumber());
        System.out.printf("%n%s %s", "Gross Sales is: ", commissionEmployee.getGrossSales());
        System.out.printf("%n%s %s", "Commision rate is: ", commissionEmployee.getCommissionRate());

        System.out.printf("%n%s:%n%nï%s%n",
                "Updated employee information obtained by toString", commissionEmployee);
    }
}
