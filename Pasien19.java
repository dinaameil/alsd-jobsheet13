class Pasien19 {
    String nama, nik, keluhan;
    int umur;
    int lamaSakit; // tambahkan field lamaSakit
    Pasien19 next;

    Pasien19(String nama, String nik, String keluhan, int umur) {
        this.nama = nama;
        this.nik = nik;
        this.keluhan = keluhan;
        this.umur = umur;
        this.next = null;
    }
    Pasien19(String nama, String nik, String keluhan, int umur, int lamaSakit) {
        this.nama = nama;
        this.nik = nik;
        this.keluhan = keluhan;
        this.umur = umur;
        this.lamaSakit = lamaSakit;
        this.next = null;
    }
}