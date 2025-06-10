import java.util.Scanner;

public class MainKalkulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kalkulator k = new Kalkulator();

        System.out.print("Masukkan nilai 1: ");
        int a = sc.nextInt();
        System.out.print("Masukkan nilai 2: ");
        int b = sc.nextInt();

        System.out.println("Hasil Penjumlahan: " + Kalkulator.penjumlahan(a, b));
        System.out.println("Hasil Pengurangan: " + Kalkulator.pengurangan(a, b));
        System.out.println("Hasil Perkalian: " + k.perkalian(a, b));
        System.out.println("Hasil Pembagian: " + k.pembagian(a, b));

        System.out.println("Menyederhanakan pecahan " + a + "/" + b);
        k.sederhana(a, b);
    }
}
