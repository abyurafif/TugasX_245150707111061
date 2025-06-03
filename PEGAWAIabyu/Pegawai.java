public class Pegawai {
    private String nama;
    private String jabatan;
    private double gajiPokok;
    private double tunjangan;
    private double potongan;
    private double bonus;

    // Default Constructor
    public Pegawai() {
        this.nama = "";
        this.jabatan = "";
        this.gajiPokok = 0;
        this.tunjangan = 0;
        this.potongan = 0;
        this.bonus = 0;
    }

    // Overloaded Constructor
    public Pegawai(String nama, String jabatan, double gajiPokok, double tunjangan, double potongan, double bonus) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
        this.potongan = potongan;
        this.bonus = bonus;
    }

    // Setter Methods
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public void setPotongan(double potongan) {
        this.potongan = potongan;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // Instance Method: Menghitung total gaji
    public double hitungGajiTotal() {
        return gajiPokok + tunjangan + bonus - potongan;
    }

    // Instance Method: Menampilkan informasi pegawai
    public void displayInfo() {
        System.out.println("Nama       : " + nama);
    System.out.println("Jabatan    : " + jabatan);
    System.out.printf("Gaji Pokok : Rp%,.0f\n", gajiPokok);
    System.out.printf("Tunjangan  : Rp%,.0f\n", tunjangan);
    System.out.printf("Bonus      : Rp%,.0f\n", bonus);
    System.out.printf("Potongan   : Rp%,.0f\n", potongan);
    System.out.printf("Total Gaji : Rp%,.0f\n", hitungGajiTotal());
    System.out.println("----------------------------------");
}

    // Instance Method: Menambahkan bonus tambahan
    public void tambahBonus(double tambahanBonus) {
        this.bonus += tambahanBonus;
    }
}
