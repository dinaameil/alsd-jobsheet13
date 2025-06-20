public class Pasien {
    String nama;
    String nik;
    String keluhan;
    int umur;
    Pasien next;

    public Pasien(String nama, String nik, String keluhan, int umur) {
        this.nama = nama;
        this.nik = nik;
        this.keluhan = keluhan;
        this.umur = umur;
        this.next = null;
    }
}