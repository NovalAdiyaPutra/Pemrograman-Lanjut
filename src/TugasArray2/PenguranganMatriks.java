package TugasArray2;
public class PenguranganMatriks {
    public static void main(String[] args) {
        // Matriks pertama
        int[][] matrix1 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

        // Matriks kedua
        int[][] matrix2 = { {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1} };

        // Menambahkan matriks
        int[][] resultMatrix = addMatrices(matrix1, matrix2);

        // Menampilkan hasil penjumlahan
        System.out.println("Hasil Pengurangan Matriks:");
        printMatrix(resultMatrix);
    }

    // Metode untuk menambahkan dua matriks
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        return result;
    }

    // Metode untuk mencetak matriks
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

