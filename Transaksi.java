class Transaksi {
    String namaPasien, idDokter, namaDokter;
    int durasi;
    int biaya;

    Transaksi(String namaPasien, String idDokter, String namaDokter, int durasi, int biaya) {
        this.namaPasien = namaPasien;
        this.idDokter = idDokter;
        this.namaDokter = namaDokter;
        this.durasi = durasi;
        this.biaya = biaya;
    }
}