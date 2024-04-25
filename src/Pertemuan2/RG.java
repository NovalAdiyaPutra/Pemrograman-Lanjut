package Pertemuan2;

import java.util.Scanner;
import static Pertemuan2.RandomGenerator.generateRandomSequence;

public class RG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        System.out.print("Masukkan jumlah bilangan acak: ");
        int n = scanner.nextInt(); // Get the number of random numbers from the user

        System.out.print("Masukkan modulus (range): ");
        int m = scanner.nextInt(); // Get the modulus (range) from the user

        System.out.print("Masukkan nilai awal (seed): ");
        int seed = scanner.nextInt(); // Get the seed value from the user

        System.out.print("Masukkan pengali (multiplier): ");
        int a = scanner.nextInt(); // Get the multiplier from the user

        System.out.print("Masukkan inkrement (increment): ");
        int b = scanner.nextInt(); // Get the increment from the user

        int[] randomSequence = generateRandomSequence(n, m, seed, a, b);

        System.out.println("Urutan bilangan acak yang dihasilkan:");
        for (int num : randomSequence) {
            System.out.print(num + " ");
        }

        scanner.close(); // Close the Scanner object
    }

}
