package br.com.deus.extra;

public class EmployeeCommission extends Employee{
    private double grossSale;
    private double commissionRate;

    public EmployeeCommission(String firstName, String lastName, String socialSecurityNumber, double grossSale, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSale = grossSale;
        this.commissionRate = commissionRate;
    }

    public double earnings() {
        return grossSale * commissionRate;
    }

    @Override
    public String toString() {
        return String.format("%s%nGross Sales: %.2f%nCommission Rate: %.2f",
                super.toString(),grossSale,commissionRate);
    }
}
