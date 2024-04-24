package Pertemuan7;
import java.util.Scanner;

public class UniqueElements {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int A[] = new int[5];

        System.out.println("Masukkan elemen A: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print("A [" + i + "]=");
            A[i] = input.nextInt();
        }
        for (int i = 0; i < ((A.length) - 2); i++) {
            for (int j = (i + 1); j < ((A.length) - 1); j++) {
                if (A[i] == A[j]) {
                    System.out.println("tidak uniq");
                }
            }
        }
    }
}