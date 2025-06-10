package praktikuminterface;

public class Employee implements Payable {
    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;

    public Employee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    @Override
    public double getPayableAmount() {
        double totalBelanja = 0;
        for (Invoice invoice : invoices) {
            totalBelanja += invoice.getPayableAmount();
        }
        return salaryPerMonth - totalBelanja;
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee: " + name + " (Reg#: " + registrationNumber + ")");
        System.out.println("Gaji sebelum potongan: " + salaryPerMonth);
        System.out.println("Detail belanja:");
        for (Invoice invoice : invoices) {
            invoice.displayInvoice();
        }
        System.out.println("Gaji setelah potongan belanja: " + getPayableAmount());
    }
}
