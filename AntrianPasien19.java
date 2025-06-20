class AntrianPasien19 {
    Pasien19 head, tail;

    void tambahPasien(String nama, String nik, String keluhan, int umur) {
        Pasien19 baru = new Pasien19(nama, nik, keluhan, umur);
        if (head == null) {
            head = tail = baru;
        } else {
            tail.next = baru;
            tail = baru;
        }
    }
    // Menambah field "lamaSakit" pada setiap pasien
    void tambahPasien(String nama, String nik, String keluhan, int umur, int lamaSakit) {
        Pasien19 baru = new Pasien19(nama, nik, keluhan, umur, lamaSakit);
        if (head == null) {
            head = tail = baru;
        } else {
            tail.next = baru;
            tail = baru;
        }
    }
    String layaniPasien() {
        if (head == null) return null;
        String nama = head.nama;
        head = head.next;
        if (head == null) tail = null;
        return nama;
    }

    void tampilkanAntrian() {
        if (head == null) {
            System.out.println("Antrian kosong.");
            return;
        }
        Pasien19 temp = head;
        int no = 1;
        while (temp != null) {
            String nomorAntrian = String.format("%02d", no);
            System.out.println("Nomor Antrian: " + nomorAntrian);
            System.out.println("Nama: " + temp.nama);
            System.out.println("   NIK: " + temp.nik);
            System.out.println("   Keluhan: " + temp.keluhan);
            System.out.println("   Umur: " + temp.umur);
            temp = temp.next;
            no++;
        }
    }

    int hitungAntrian() {
        int count = 0;
        Pasien19 temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    Pasien19 cariPasienBerdasarkanNama(String nama) {
        Pasien19 temp = head;
        while (temp != null) {
            if (temp.nama.equalsIgnoreCase(nama)) {
                return temp;
            }
            temp = temp.next;
        }
        return null; // Jika tidak ditemukan
    }
}
