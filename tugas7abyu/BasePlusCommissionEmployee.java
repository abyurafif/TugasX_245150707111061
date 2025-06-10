public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String name, String noKTP, double sales, double rate, double salary) {
        super(name, noKTP, sales, rate);
        setBaseSalary(salary);
    }

    public void setBaseSalary(double salary) {
        baseSalary = salary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    public String toString() {
        return String.format("Base-Salaried %s\nBase Salary: %.2f", super.toString(), getBaseSalary());
    }
}
