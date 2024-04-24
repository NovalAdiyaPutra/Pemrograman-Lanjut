package TugasArray2;
import java.util.Scanner;

public class OperasiMatriks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input ukuran matriks
        System.out.print("Masukkan jumlah baris matriks: ");
        int rows = scanner.nextInt();
        System.out.print("Masukkan jumlah kolom matriks: ");
        int columns = scanner.nextInt();

        // Input matriks pertama
        int[][] matrix1 = inputMatrix(scanner, rows, columns, "Masukkan elemen matriks pertama:");

        // Input matriks kedua
        int[][] matrix2 = inputMatrix(scanner, rows, columns, "Masukkan elemen matriks kedua:");

        // Penjumlahan matriks
        int[][] sumMatrix = addMatrices(matrix1, matrix2);

        // Pengurangan matriks
        int[][] differenceMatrix = subtractMatrices(matrix1, matrix2);

        // Menampilkan hasil penjumlahan
        System.out.println("Hasil Penjumlahan Matriks:");
        printMatrix(sumMatrix);

        // Menampilkan hasil pengurangan
        System.out.println("\nHasil Pengurangan Matriks:");
        printMatrix(differenceMatrix);

        scanner.close();
    }

    // Metode untuk menginput matriks
    public static int[][] inputMatrix(Scanner scanner, int rows, int columns, String prompt) {
        System.out.println(prompt);
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("Elemen [%d][%d]: ", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    // Metode untuk menambahkan dua matriks
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    // Metode untuk mengurangkan dua matriks
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
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
