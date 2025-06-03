public class Studio {
    private int nomorStudio;
    private int kapasitasKursi;
    private Film film;

    public Studio(int nomorStudio, int kapasitasKursi, Film film) {
        this.nomorStudio = nomorStudio;
        this.kapasitasKursi = kapasitasKursi;
        this.film = film;
    }

    public int getNomorStudio() {
        return nomorStudio;
    }

    public int getKapasitasKursi() {
        return kapasitasKursi;
    }

    public Film getFilm() {
        return film;
    }

    public void tampilInfo() {
        System.out.println("Nomor Studio     : " + nomorStudio);
        System.out.println("Kapasitas Kursi  : " + kapasitasKursi);
        System.out.println("Film yang Ditayangkan:");
        film.tampilInfo();
    }
}
