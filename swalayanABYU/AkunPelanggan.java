public class AkunPelanggan {
    private String nama;
    private String nomorPelanggan;
    private String pin;
    private double saldo;
    private boolean diblokir;
    private int percobaanGagal;

    public AkunPelanggan(String nama, String nomorPelanggan, String pin, double saldo) {
        this.nama = nama;
        this.nomorPelanggan = nomorPelanggan;
        this.pin = pin;
        this.saldo = saldo;
        this.diblokir = false;
        this.percobaanGagal = 0;
    }

    public String getNomorPelanggan() {
        return nomorPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isDiblokir() {
        return diblokir;
    }

    private boolean autentikasi(String nomor, String inputPin) {
        if (diblokir) return false;

        if (this.nomorPelanggan.equals(nomor) && this.pin.equals(inputPin)) {
            percobaanGagal = 0;
            return true;
        } else {
            percobaanGagal++;
            if (percobaanGagal >= 3) {
                diblokir = true;
            }
            return false;
        }
    }

    private String getJenisPelanggan() {
        String kode = nomorPelanggan.substring(0, 2);
        return switch (kode) {
            case "38" -> "Silver";
            case "56" -> "Gold";
            case "74" -> "Platinum";
            default -> "Unknown";
        };
    }

    public void topUp(String nomor, String inputPin, double nominal) {
        if (!autentikasi(nomor, inputPin)) {
            System.out.println("Autentikasi gagal. Akun mungkin diblokir.");
            return;
        }

        saldo += nominal;
        System.out.println("Top up berhasil. Saldo sekarang: Rp" + saldo);
    }

    public void beli(String nomor, String inputPin, double totalBelanja) {
        if (!autentikasi(nomor, inputPin)) {
            System.out.println("Autentikasi gagal. Akun mungkin diblokir.");
            return;
        }

        double cashback = 0;
        String jenis = getJenisPelanggan();

        if (totalBelanja > 1000000) {
            switch (jenis) {
                case "Silver" -> cashback = totalBelanja * 0.05;
                case "Gold" -> cashback = totalBelanja * 0.07;
                case "Platinum" -> cashback = totalBelanja * 0.10;
            }
        } else {
            switch (jenis) {
                case "Gold" -> cashback = totalBelanja * 0.02;
                case "Platinum" -> cashback = totalBelanja * 0.05;
            }
        }

        double totalBayar = totalBelanja - cashback;

        if (saldo - totalBayar < 10000) {
            System.out.println("Transaksi gagal. Saldo tidak mencukupi minimal Rp10.000 setelah transaksi.");
        } else {
            saldo -= totalBayar;
            System.out.println("Transaksi berhasil! Cashback: Rp" + cashback);
            System.out.println("Sisa saldo: Rp" + saldo);
        }
    }
}