public class PengirimanBarang {
  
    private String namaPengirim;
    private String alamatTujuan;
    private double berat;
    private double biayaDasar;

    public PengirimanBarang() {
        this.namaPengirim = "";
        this.alamatTujuan = "";
        this.berat = 0.0;
        this.biayaDasar = 0.0;
    }

    public PengirimanBarang(String namaPengirim, String alamatTujuan, double berat, double biayaDasar) {
        this.namaPengirim = namaPengirim;
        this.alamatTujuan = alamatTujuan;
        this.berat = berat;
        this.biayaDasar = biayaDasar;
    }


    public double hitungOngkir(double diskonPersen) {
        double diskon = biayaDasar * (diskonPersen / 100);
        return biayaDasar - diskon;
    }

    public double hitungOngkir(double diskonPersen, double biayaTambahan) {
        double ongkirSetelahDiskon = hitungOngkir(diskonPersen);
        return ongkirSetelahDiskon + biayaTambahan;
    }

    public double hitungOngkir(int jarak) {
        if (jarak > 50) {
            return biayaDasar + (biayaDasar * 0.10); // surcharge 10%
        } else {
            return biayaDasar - (biayaDasar * 0.05); // diskon 5%
        }
    }

    public void displayInfoLogistik() {
        System.out.println("===== INFO PERUSAHAAN LOGISTIK =====");
        System.out.println("Nama Perusahaan: PT. Kilat Logistik");
        System.out.println("Layanan: Pengiriman Barang Domestik & Internasional");
        System.out.println("====================================");
    }

    public String getNamaPengirim() {
        return namaPengirim;
    }

    public String getAlamatTujuan() {
        return alamatTujuan;
    }

    public double getBiayaDasar() {
        return biayaDasar;
    }
}
