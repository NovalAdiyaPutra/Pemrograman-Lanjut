package Pertemuan2;
public class MinimumDistance {

    public static int jarakMinimum(int[] A) {
        int n = A.length; // Dapatkan panjang array
        int jarakMin = Integer.MAX_VALUE; // Inisialisasi jarak minimum dengan nilai maksimum

        for (int i = 0; i < n; i++) { // Perulangan luar untuk elemen pertama
            for (int j = 0; j < n; j++) { // Perulangan dalam untuk elemen kedua
                if (i != j) { // Hindari membandingkan elemen dengan dirinya sendiri
                    int selisih = Math.abs(A[i] - A[j]); // Hitung selisih absolut
                    if (selisih < jarakMin) { // Perbarui jarak minimum jika ditemukan nilai yang lebih kecil
                        jarakMin = selisih;
                    }
                }
            }
        }

        return jarakMin; // Kembalikan jarak minimum yang ditemukan
    }

    public static void main(String[] args) {
        int[] A = {1, 5, 3, 7, 4}; // Contoh array
        int jarakMin = jarakMinimum(A); // Hitung jarak minimum
        System.out.println("Jarak minimum antar elemen dalam A: " + jarakMin); // Cetak hasil
    }
}


