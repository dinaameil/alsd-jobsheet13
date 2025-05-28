class QueueTransaksi {
    Transaksi[] data;
    int front, rear, size, capacity;

    QueueTransaksi(int kapasitas) {
        capacity = kapasitas;
        data = new Transaksi[capacity];
        front = rear = size = 0;
    }

    boolean isFull() { return size == capacity; }
    boolean isEmpty() { return size == 0; }

    void enqueue(Transaksi t) {
        if (isFull()) {
            System.out.println("Riwayat transaksi penuh!");
            return;
        }
        data[rear] = t;
        rear = (rear + 1) % capacity;
        size++;
    }

    void tampilkanTransaksi() {
        if (isEmpty()) {
            System.out.println("Belum ada transaksi.");
            return;
        }
        int idx = front;
        for (int i = 0; i < size; i++) {
            Transaksi t = data[idx];
            System.out.println((i+1) + ". Pasien: " + t.namaPasien +  " ( " + t.durasi + " jam ) : Rp " + t.biaya);
            idx = (idx + 1) % capacity;
        }
    }
}
