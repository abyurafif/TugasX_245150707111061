public class Tiket {
    private String nomorTiket;
    private Film film;
    private Studio studio;
    private int nomorKursi;
    private Penonton penonton;

    public Tiket(String nomorTiket, Film film, Studio studio, int nomorKursi, Penonton penonton) {
        this.nomorTiket = nomorTiket;
        this.film = film;
        this.studio = studio;
        this.nomorKursi = nomorKursi;
        this.penonton = penonton;
    }

    public void tampilInfo() {
        System.out.println("Nomor Tiket : " + nomorTiket);
        System.out.println("Nama Penonton: " + penonton.getNama());
        System.out.println("Studio       : " + studio.getNomorStudio());
        System.out.println("Nomor Kursi  : " + nomorKursi);
        System.out.println("Film         : " + film.getJudul() + " (" + film.getGenre() + ")");
        System.out.println("Jam Tayang   : " + film.getJamTayang());
        System.out.println("Harga Tiket  : Rp" + film.getHargaTiket());
        System.out.println("------------------------------");
    }
}
