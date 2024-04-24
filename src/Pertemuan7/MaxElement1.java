package Pertemuan7;
import java.util.*;

public class MaxElement1 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int[] A = new int[5];
        int maxVal = A[0];

        System.out.println("Masukkan elemen array:");
        for (int i = 0; i < A.length; i++) {
            A[i] = input.nextInt();
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] > maxVal) {
                maxVal = A[i];
            }
        }
        System.out.println("Nilai maksimum adalah: " + maxVal);
    }
}