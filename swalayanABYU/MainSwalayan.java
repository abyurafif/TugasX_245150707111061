import java.util.Scanner;

public class MainSwalayan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AkunPelanggan akun = new AkunPelanggan("Andi", "5612345678", "1234", 2000000);

        int pilihan;
        do {
            System.out.println("\n==== Menu Swalayan Tiny ====");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Top Up");
            System.out.println("3. Pembelian");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1 -> System.out.println("Saldo Anda: Rp" + akun.getSaldo());
                case 2 -> {
                    System.out.print("Nomor Pelanggan: ");
                    String no = scanner.nextLine();
                    System.out.print("PIN: ");
                    String pin = scanner.nextLine();
                    System.out.print("Nominal Top Up: ");
                    double topup = scanner.nextDouble();
                    akun.topUp(no, pin, topup);
                }
                case 3 -> {
                    System.out.print("Nomor Pelanggan: ");
                    String no = scanner.nextLine();
                    System.out.print("PIN: ");
                    String pin = scanner.nextLine();
                    System.out.print("Total Belanja: ");
                    double belanja = scanner.nextDouble();
                    akun.beli(no, pin, belanja);
                }
                case 4 -> System.out.println("Terima kasih!");
                default -> System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 4);
    }
}