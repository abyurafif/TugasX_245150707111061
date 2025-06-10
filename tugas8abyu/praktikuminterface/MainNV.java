package praktikuminterface;

public class MainNV {
    public static void main(String[] args) {
        Invoice[] daftarBelanja = {
            new Invoice("Sabun", 2, 5000),
            new Invoice("Minyak Goreng", 1, 30000),
            new Invoice("Beras", 1, 60000)
        };

        Employee karyawan1 = new Employee(101, "Andi", 5000000, daftarBelanja);
        karyawan1.displayEmployeeInfo();
    }
}
