package TugasArray2;
import java.util.Scanner;

public class DataMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah data mahasiswa
        System.out.print("Masukkan jumlah data mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        scanner.nextLine(); // Membuang karakter newline dari buffer

        // Deklarasi array untuk menyimpan data mahasiswa
        String[][] dataMahasiswa = new String[jumlahMahasiswa][4];

        // Input data mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan data untuk Mahasiswa ke-" + (i + 1) + ":");
            System.out.print("NIM: ");
            dataMahasiswa[i][0] = scanner.nextLine();
            System.out.print("Nama: ");
            dataMahasiswa[i][1] = scanner.nextLine();
            System.out.print("Jurusan: ");
            dataMahasiswa[i][2] = scanner.nextLine();
            System.out.print("IPK: ");
            dataMahasiswa[i][3] = scanner.nextLine();
        }

        // Menampilkan data mahasiswa dalam bentuk tabel
        System.out.println("\nData Mahasiswa:");
        System.out.println("----------------------------------------------------------");
        System.out.printf("| %-10s | %-20s | %-20s | %-4s |\n", "NIM", "Nama", "Jurusan", "IPK");
        System.out.println("----------------------------------------------------------");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.printf("| %-10s | %-20s | %-20s | %-4s |\n", dataMahasiswa[i][0], dataMahasiswa[i][1], dataMahasiswa[i][2], dataMahasiswa[i][3]);
        }
        System.out.println("----------------------------------------------------------");

        scanner.close();
    }
}

