public class Kalkulator {

    // Static Method
    public static int penjumlahan(int a, int b) {
        return a + b;
    }

    public static int pengurangan(int a, int b) {
        return a - b;
    }

    // Non-Static Method
    public int perkalian(int a, int b) {
        return a * b;
    }

    public double pembagian(int a, int b) {
        if (b == 0) {
            System.out.println("Tidak bisa dibagi dengan nol.");
            return 0;
        }
        return (double) a / b;
    }

    // Method non-static untuk menyederhanakan pecahan
    public void sederhana(int pembilang, int penyebut) {
        int gcd = gcd(pembilang, penyebut);
        pembilang /= gcd;
        penyebut /= gcd;
        System.out.println("Pecahan disederhanakan: " + pembilang + "/" + penyebut);
    }

    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
