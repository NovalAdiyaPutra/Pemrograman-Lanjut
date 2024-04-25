package Pertemuan2;

import java.util.ArrayList;
import java.util.List;

public class ElemenUmum {

    public static int[] cariElemenUmum(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;
        int i = 0, j = 0;
        List<Integer> umum = new ArrayList<>();

        while (i < m && j < n) {
            if (A[i] == B[j]) {
                umum.add(A[i]); // atau B[j] - keduanya sama
                i++;
                j++;
            } else if (A[i] < B[j]) {
                i++;
            } else {
                j++;
            }
        }

        // Konversi List menjadi array int
        return umum.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] A = {2, 5, 5, 5};
        int[] B = {2, 2, 3, 5, 5, 7};
        int[] elemenUmum = cariElemenUmum(A, B);

        System.out.print("Elemen umum: ");
        for (int num : elemenUmum) {
            System.out.print(num + " ");
        }
    }
}
