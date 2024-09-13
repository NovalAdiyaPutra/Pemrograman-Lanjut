package Pertemuan2;

public class GraphComplete {
    public static boolean isLengkap(int[][] A) {
        int n = A.length;

        // Kasus basis: graf dengan 1 vertex adalah lengkap
        if (n == 1) {
            return true;
        }

        // Periksa apakah sub-graf lengkap
        if (!isLengkap(java.util.Arrays.copyOfRange(A, 0, n - 1), 0, n - 1)) {
            return false;
        }

        // Periksa sisi (edge) dari vertex terakhir (n-1)
        for (int j = 0; j < n - 1; j++) {
            if (A[n - 1][j] == 0) {
                return false;
            }
        }

        return true;
    }

    // Metode bantu untuk pemeriksaan sub-graf (mengurangi duplikasi kode)
    private static boolean isLengkap(int[][] A, int barisAwal, int barisAkhir) {
        for (int i = barisAwal; i < barisAkhir; i++) {
            for (int j = barisAwal; j < barisAkhir; j++) {
                if (A[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] graf = {
                {3, 4, 5},
                {8, 0, 2},
                {9, 2, 6}
        }; // Contoh: Tidak lengkap (tidak ada sisi antara vertex 1 dan 2)

        if (isLengkap(graf)) {
            System.out.println("Graf tersebut lengkap.");
        } else {
            System.out.println("Graf tersebut tidak lengkap.");
        }
    }
}
