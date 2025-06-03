public class Main {
    public static void main(String[] args) {      
        Film film1 = new Film("Avengers: Endgame", "Action", "14:00", 50000);
        Film film2 = new Film("Frozen II", "Animation", "16:30", 45000);
        Film film3 = new Film("Joker", "Thriller", "19:00", 55000);

        Studio studio1 = new Studio(1, 100, film1);
        Studio studio2 = new Studio(2, 80, film2);
        Studio studio3 = new Studio(3, 60, film3);

        System.out.println("=== INFORMASI STUDIO ===");
        studio1.tampilInfo();
        System.out.println();
        studio2.tampilInfo();
        System.out.println();
        studio3.tampilInfo();
        System.out.println();

        Penonton penonton1 = new Penonton("Andi");
        Penonton penonton2 = new Penonton("Budi");
        Penonton penonton3 = new Penonton("Citra");

        Tiket tiket1 = new Tiket("T001", film1, studio1, 12, penonton1);
        Tiket tiket2 = new Tiket("T002", film2, studio2, 5, penonton2);
        Tiket tiket3 = new Tiket("T003", film3, studio3, 1, penonton3);

        System.out.println("=== INFORMASI TIKET YANG TELAH DIPESAN ===");
        tiket1.tampilInfo();
        tiket2.tampilInfo();
        tiket3.tampilInfo();
    }
}
