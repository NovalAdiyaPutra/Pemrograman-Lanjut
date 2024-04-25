package Pertemuan2;
public class SortAnalisis {

    public static int hitungPerbandingan(int[] A) {
        int n = A.length;  // Dapatkan ukuran array
        int count = 0;      // Inisialisasi penghitung perbandingan

        for (int i = 1; i < n; i++) {
            int v = A[i];  // Simpan elemen ke-i untuk perbandingan
            int j = i - 1;  // Indeks elemen sebelumnya

            // Loop untuk menggeser elemen yang lebih besar
            while (j >= 0 && A[j] > v) {
                count++;  // Tambahkan hitungan perbandingan
                A[j + 1] = A[j];  // Geser elemen yang lebih besar ke kanan
                j--;             // Pindah ke elemen sebelumnya
            }

            A[j + 1] = v;  // Masukkan elemen ke-i pada posisi yang tepat
        }

        return count;  // Kembalikan jumlah perbandingan yang dilakukan
    }

    public static void main(String[] args) {
        int[] data = {5, 2, 8, 1, 3, 8};  // Contoh array
        int perbandingan = hitungPerbandingan(data);
        System.out.println("Jumlah perbandingan yang dilakukan: " + perbandingan);
    }
}
