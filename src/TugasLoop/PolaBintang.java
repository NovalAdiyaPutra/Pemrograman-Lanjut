package TugasLoop;

import java.util.Scanner;

public class PolaBintang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] A = new int[10];
        System.out.println("Masukkan elemen array : ");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
