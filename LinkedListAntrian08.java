import java.util.*;

public class LinkedListAntrian08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianPasien08 antrian = new AntrianPasien08();
        QueueTransaksi08 riwayat = new QueueTransaksi08(100);

        while (true) {
            System.out.println("\n=== SISTEM ANTRIAN KLINIK===");
            System.out.println("1. Tambah Pasien ke Antrian");
            System.out.println("2. Lihat Antrian");
            System.out.println("3. Layani Pasien");
            System.out.println("4. Cek Sisa Antrian Pasien");
            System.out.println("5. Lihat Riwayat Transaksi");
            System.out.println("6. Cari Pasien Berdasarkan Nama");
            System.out.println("7. Cari Pasien Berdasarkan Nomor Antrian");
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
                        Transaksi08 t = new Transaksi08(namaDilayani, idDokter, namaDokter, durasi, biaya);
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
                    System.out.print("Masukkan nama pasien yang dicari: "); 
                    String namaCari = sc.nextLine();
                    Pasien08 pasienDitemukan = antrian.cariPasienBerdasarkanNama(namaCari);
                    if (pasienDitemukan != null) {
                        System.out.println("Pasien ditemukan:");
                        System.out.println("Nama: " + pasienDitemukan.nama);
                        System.out.println("NIK: " + pasienDitemukan.nik);
                        System.out.println("Keluhan: " + pasienDitemukan.keluhan);
                        System.out.println("Umur: " + pasienDitemukan.umur);
                    } else {
                        System.out.println("Pasien dengan nama '" + namaCari + "' tidak ditemukan.");
                    }
                    break;
                case 7:
                    System.out.print("Masukkan nomor antrian yang dicari: ");
                    int nomorAntrian = sc.nextInt(); sc.nextLine();
                    Pasien08 pasienByNomor = antrian.cariPasienBerdasarkanNomorAntrian(nomorAntrian);
                    if (pasienByNomor != null) {
                        System.out.println("Pasien ditemukan:");
                        System.out.println("Nama: " + pasienByNomor.nama);
                        System.out.println("NIK: " + pasienByNomor.nik);
                        System.out.println("Keluhan: " + pasienByNomor.keluhan);
                        System.out.println("Umur: " + pasienByNomor.umur);
                    } else {
                        System.out.println("Pasien dengan nomor antrian '" + nomorAntrian + "' tidak ditemukan.");
                    }
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}