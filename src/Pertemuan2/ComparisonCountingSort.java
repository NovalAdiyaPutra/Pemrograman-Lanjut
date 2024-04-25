package Pertemuan2;

public class ComparisonCountingSort {

    public static int[] urutkan(int[] A) {
        int n = A.length;

        // Cari elemen terbesar di array
        int maksimum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (A[i] > maksimum) {
                maksimum = A[i];
            }
        }

        // Buat array 'Count' untuk menyimpan jumlah kemunculan tiap elemen
        int[] Hitung = new int[maksimum + 1];

        // Inisialisasi semua elemen Hitung menjadi 0
        for (int i = 0; i <= maksimum; i++) {
            Hitung[i] = 0;
        }

        // Hitung kemunculan tiap elemen di A
        for (int i = 0; i < n; i++) {
            Hitung[A[i]]++;
        }

        // Modifikasi array Hitung untuk menyimpan posisi elemen di S
        int[] S = new int[n];
        int k = 0;
        for (int i = 0; i <= maksimum; i++) {
            for (int j = 0; j < Hitung[i]; j++) {
                S[k++] = i;
            }
        }

        return S;
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 2, 1, 4, 5, 2};
        int[] terurut = urutkan(A);

        System.out.print("Array awal: ");
        for (int angka : A) {
            System.out.print(angka + " ");
        }
        System.out.println();

        System.out.print("Array terurut: ");
        for (int angka : terurut) {
            System.out.print(angka + " ");
        }
    }
}

