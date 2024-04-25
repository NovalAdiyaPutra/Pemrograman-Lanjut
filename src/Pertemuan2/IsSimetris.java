public static boolean IsSimetris(double[][] A) {
    int n = A.length; // Dapatkan ukuran matriks

    for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) {
            if (Math.abs(A[i][j] - A[j][i]) > 1E-6) {  // Check for equality with tolerance for floating-point errors
                return false;
            }
            break; // Exit the inner loop after checking one pair
        }

    }
    return true;
}

// Contoh penggunaan
public static void main(String[] args) {
    double[][] matriks1 = {{1, 2, 3}, {2, 1, 4}, {3, 4, 1}};  // Matriks simetris
    double[][] matriks2 = {{1, 7, 3}, {2, 4, 5}, {3, 5, 1}};  // Matriks tidak simetris

    System.out.println("Matriks 1 simetris: " + IsSimetris(matriks1));
    System.out.println("Matriks 2 simetris: " + IsSimetris(matriks2));
}
