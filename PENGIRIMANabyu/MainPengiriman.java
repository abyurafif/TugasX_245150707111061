public class MainPengiriman {
    public static void main(String[] args) {
        PengirimanBarang dummy = new PengirimanBarang();
        dummy.displayInfoLogistik();

        PengirimanBarang kiriman1 = new PengirimanBarang();
        System.out.println("\nPengiriman 1 (Default Constructor):");
        System.out.println("Biaya Ongkir (jarak 30km): " + kiriman1.hitungOngkir(30));

        PengirimanBarang kiriman2 = new PengirimanBarang("Andi", "Surabaya", 5.0, 50000);
        System.out.println("\nPengiriman 2 (Overloaded Constructor):");
        System.out.println("Nama Pengirim: " + kiriman2.getNamaPengirim());
        System.out.println("Alamat Tujuan: " + kiriman2.getAlamatTujuan());
        System.out.println("Biaya Dasar: " + kiriman2.getBiayaDasar());

        System.out.println("\n=== Perhitungan Ongkir ===");
        System.out.println("1. Diskon 10%: " + kiriman2.hitungOngkir(10));
        System.out.println("2. Diskon 10% + Biaya Tambahan Rp15.000: " + kiriman2.hitungOngkir(10, 15000));
        System.out.println("3. Berdasarkan Jarak 70km: " + kiriman2.hitungOngkir(70));
        System.out.println("4. Berdasarkan Jarak 30km: " + kiriman2.hitungOngkir(30));
    }
}
