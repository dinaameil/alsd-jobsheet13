class AntrianPasien {
    Pasien head, tail;

    void tambahPasien(String nama, String nik, String keluhan, int umur) {
        Pasien baru = new Pasien(nama, nik, keluhan, umur);
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
        Pasien temp = head;
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
        Pasien temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Tambahan: Cari pasien berdasarkan nama
    Pasien cariPasienBerdasarkanNama(String nama) {
        Pasien temp = head;
        while (temp != null) {
            if (temp.nama.equalsIgnoreCase(nama)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    // Tambahan: Cari pasien berdasarkan nomor antrian
    Pasien cariPasienBerdasarkanNomorAntrian(int nomorAntrian) {
        Pasien temp = head;
        int no = 1;
        while (temp != null) {
            if (no == nomorAntrian) {
                return temp;
            }
            temp = temp.next;
            no++;
        }
        return null;
    }
}
