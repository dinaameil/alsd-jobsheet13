import java.util.*;

public class LinkedListAntrian19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianPasien19 antrian = new AntrianPasien19();
        QueueTransaksi19 riwayat = new QueueTransaksi19(100);

        while (true) {
            System.out.println("\n=== SISTEM ANTRIAN KLINIK===");
            System.out.println("1. Tambah Pasien ke Antrian");
            System.out.println("2. Lihat Antrian");
            System.out.println("3. Layani Pasien");
            System.out.println("4. Cek Sisa Antrian Pasien");
            System.out.println("5. Lihat Riwayat Transaksi");
            System.out.println("6. Lama Sakit Pasien Berdasarkan Nama");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            int pilih = sc.nextInt(); sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama pasien: ");
                    String nama = sc.nextLine();
                    System.out.print("ID Pasien: ");
                    String idPasien = sc.nextLine();
                    System.out.print("Keluhan: ");
                    String alamatPasien = sc.nextLine();
                    System.out.print("Umur: ");
                    int umur = sc.nextInt(); sc.nextLine();
                    System.out.print("Lama Sakit (hari): ");
                    int lamaSakit = sc.nextInt(); sc.nextLine();
                    antrian.tambahPasien(nama, idPasien, alamatPasien, umur);
                    System.out.println(">> Pasien masuk ke dalam antrian");
                    break;
                case 2:
                    System.out.println("-- Antrian Pasien --");
                    System.out.println("Antrian pasien:");
                    antrian.tampilkanAntrian();
                    break;
                case 3:
                    String namaDilayani = antrian.layaniPasien();
                    if (namaDilayani == null) {
                        System.out.println("Antrian kosong.");
                    } else {
                        System.out.println("Pasien " + namaDilayani + " dipanggil");
                        System.out.print("Masukkan ID Dokter: ");
                        String idDokter = sc.nextLine();
                        System.out.print("Masukkan Nama Dokter: ");
                        String namaDokter = sc.nextLine();
                        System.out.print("Masukkan Durasi layanan (jam): ");
                        int durasi = sc.nextInt(); sc.nextLine();
                        int biaya = durasi * 50000;
                        Transaksi19 t = new Transaksi19(namaDilayani, idDokter, namaDokter, durasi, biaya);
                        riwayat.enqueue(t);
                        System.out.println(">>Pasien telah dilayani, transaksi berhasil ditambahkan.");
                    }
                    break;
                case 4:
                    System.out.println(">> Sisa pasien dalam antrian: " + antrian.hitungAntrian());
                    break;
                case 5:
                    System.out.println("-- Riwayat Transaksi --");
                    System.out.println("Riwayat transaksi:");
                    riwayat.tampilkanTransaksi();
                    break;
                case 6:
                    System.out.print("Masukkan nama pasien: ");
                    String namaCari = sc.nextLine();
                    Pasien19 pasien = antrian.cariPasienBerdasarkanNama(namaCari);
                    if (pasien != null) {
                        System.out.println("Pasien ditemukan: " + pasien.nama + ", lama sakit: " + pasien.lamaSakit + " hari");
                    } else {
                        System.out.println("Pasien tidak ditemukan.");
                    }
                    break;
                case 7:
                    System.out.print("Masukkan nomor antrian: ");
                case 0:
                    System.out.println("Terima kasih.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}