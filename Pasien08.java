public class Pasien08 {
    String nama;
    String nik;
    String keluhan;
    int umur;
    Pasien08 next;

    public Pasien08(String nama, String nik, String keluhan, int umur) {
        this.nama = nama;
        this.nik = nik;
        this.keluhan = keluhan;
        this.umur = umur;
        this.next = null;
    }
}