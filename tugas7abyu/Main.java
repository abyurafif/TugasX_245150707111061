public class Main {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("Daniel", "111", 800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karina", "234", 16.75, 40);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Kevin", "333", 10000, 0.06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Tri", "444", 5000, 0.04, 300);

        System.out.printf("%s\nearned: $%,.2f\n\n", salariedEmployee, salariedEmployee.earnings());
        System.out.printf("%s\nearned: $%,.2f\n\n", hourlyEmployee, hourlyEmployee.earnings());
        System.out.printf("%s\nearned: $%,.2f\n\n", commissionEmployee, commissionEmployee.earnings());
        System.out.printf("%s\nearned: $%,.2f\n\n", basePlusCommissionEmployee, basePlusCommissionEmployee.earnings());

        Employee[] employees = new Employee[4];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;

        System.out.println("Employees diproses secara polimorfisme:\n");

        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);

            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                System.out.printf("Gaji pokok setelah dinaikkan 10%% : $%,.2f\n", employee.getBaseSalary());
            }

            System.out.printf("pendapatan: $%,.2f\n\n", currentEmployee.earnings());
        }

        for (int j = 0; j < employees.length; j++) {
            System.out.printf("Employee %d = %s\n", j, employees[j].getClass().getName());
        }
    }
}
