public class Jaket {
    public static final int HARGA_JAKET_A = 100000;
    public static final int HARGA_JAKET_B = 125000;
    public static final int HARGA_JAKET_C = 175000;

    private int totalHarga;

    public void beliJaketA(int jumlah) {
        int harga = (jumlah > 100) ? 95000 : HARGA_JAKET_A;
        totalHarga += harga * jumlah;
        System.out.println("Harga jaket A per buah: Rp " + harga);
    }

    public void beliJaketB(int jumlah) {
        int harga = (jumlah > 100) ? 120000 : HARGA_JAKET_B;
        totalHarga += harga * jumlah;
        System.out.println("Harga jaket B per buah: Rp " + harga);
    }

    public void beliJaketC(int jumlah) {
        int harga = (jumlah > 100) ? 160000 : HARGA_JAKET_C;
        totalHarga += harga * jumlah;
        System.out.println("Harga jaket C per buah: Rp " + harga);
    }

    public int getTotalHarga() {
        return totalHarga;
    }
}
