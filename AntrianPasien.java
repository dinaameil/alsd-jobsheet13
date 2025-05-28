class AntrianPasien {
    Pasien head, tail;

    void tambahPasien(String nama, String nik, String keluhan) {
        Pasien baru = new Pasien(nama, nik, keluhan);
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
            System.out.println(no++ + ". " + temp.nama);
            System.out.println("   NIK: " + temp.nik);
            System.out.println("   Keluhan: " + temp.keluhan);
            temp = temp.next;
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
}