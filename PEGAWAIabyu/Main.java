public class Main {
    public static void main(String[] args) {
        // Menggunakan Default Constructor
        Pegawai p1 = new Pegawai();
        p1.setNama("Dina");
        p1.setJabatan("Staff HRD");
        p1.setGajiPokok(4000000);
        p1.setTunjangan(500000);
        p1.setBonus(300000);
        p1.setPotongan(200000);

        // Menambahkan bonus tambahan
        p1.tambahBonus(100000);

        // Menggunakan Overloaded Constructor
        Pegawai p2 = new Pegawai("Rudi", "Manager", 8000000, 1500000, 500000, 1000000);

        // Menampilkan informasi pegawai
        System.out.println("=== Informasi Pegawai ===");
        p1.displayInfo();
        p2.displayInfo();
    }
}
