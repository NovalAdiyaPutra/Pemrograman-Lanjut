package Pertemuan2;

public class EleminasiGauss {

    public static void eliminasiGauss(double[][] A) {
        int n = A.length; // Dapatkan ukuran matriks (jumlah baris)

        for (int i = 0; i < n - 2; i++) {
            if (Math.abs(A[i][i]) < 1E-6) {  // Periksa elemen pivot (A[i][i]) untuk menghindari pembagian dengan nol
                // Penanganan elemen pivot nol (misalnya, pivoting baris)
                System.out.println("Elemen pivot nol ditemukan pada baris " + i);
                return;  // Keluar dari fungsi jika elemen pivot nol
            }

            for (int j = i + 1; j < n; j++) {
                double faktor = A[j][i] / A[i][i]; // Hitung faktor eliminasi sekali
                for (int k = i + 1; k < n; k++) { // Iterasi dari i + 1 ke n (tidak termasuk i)
                    A[j][k] = A[j][k] - A[i][k] * faktor;
                }
            }
        }

        // Matriks sekarang dalam bentuk segitiga atas
        System.out.println("Matriks setelah eliminasi Gauss:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + 1; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Contoh matriks (Anda dapat mengganti ini dengan matriks Anda sendiri)
        double[][] A = {{1, 2, 3, 4}, {2, 4, 1, -2}, {3, 1, 5, 1}};

        eliminasiGauss(A);
    }
}

