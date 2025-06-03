public class Film {
    private String judul;
    private String genre;
    private String jamTayang;
    private double hargaTiket;

    public Film(String judul, String genre, String jamTayang, double hargaTiket) {
        this.judul = judul;
        this.genre = genre;
        this.jamTayang = jamTayang;
        this.hargaTiket = hargaTiket;
    }

    public String getJudul() {
        return judul;
    }

    public String getGenre() {
        return genre;
    }

    public String getJamTayang() {
        return jamTayang;
    }

    public double getHargaTiket() {
        return hargaTiket;
    }

    public void tampilInfo() {
        System.out.println("Judul Film   : " + judul);
        System.out.println("Genre        : " + genre);
        System.out.println("Jam Tayang   : " + jamTayang);
        System.out.println("Harga Tiket  : Rp" + hargaTiket);
    }
}
