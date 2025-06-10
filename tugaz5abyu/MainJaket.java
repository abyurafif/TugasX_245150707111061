import java.util.Scanner;

public class MainJaket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jaket jaket = new Jaket();

        System.out.print("Masukkan jumlah jaket A yang dibeli: ");
        int a = sc.nextInt();
        jaket.beliJaketA(a);

        System.out.print("Masukkan jumlah jaket B yang dibeli: ");
        int b = sc.nextInt();
        jaket.beliJaketB(b);

        System.out.print("Masukkan jumlah jaket C yang dibeli: ");
        int c = sc.nextInt();
        jaket.beliJaketC(c);

        System.out.println("Total harga pembelian: Rp " + jaket.getTotalHarga());
    }
}
