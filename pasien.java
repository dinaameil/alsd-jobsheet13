class Pasien {
    String nama;
    String nik;
    String keluhan;
    Pasien next;

    Pasien(String nama, String nik, String keluhan) {
        this.nama = nama;
        this.nik = nik;
        this.keluhan = keluhan;
        this.next = null;
    }
}
