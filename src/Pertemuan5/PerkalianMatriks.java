package Pertemuan5;

import java.util.Scanner;

public class PerkalianMatriks {
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        int A[][]=new int[100][100];
        int B[][]=new int[100][100];
        int C[][]=new int[100][100];
        int m,n,p,q,i,j,k,hasil=0;
        System.out.print("Jumlah baris matriks A :");
        m=input.nextInt();
        System.out.print("Jumlah kolom matriks A :");
        n=input.nextInt();
        System.out.print("Jumlah baris matriks B :");
        p=input.nextInt();
        System.out.print("Jumlah kolom matriks B :");
        q=input.nextInt();
        if(n!=p) {
            System.out.println("Matriks tidak dapat dikalikan\n");
        }
        else {
            System.out.println("Masukkan elemen matriks A :");
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    A[i][j] = input.nextInt();
                }
            }
            System.out.println("Masukkan elemen matriks B :");
            for (i = 0; i < p; i++) {
                for (j = 0; j < q; j++) {
                    B[i][j] = input.nextInt();
                }
            }
            for (i = 0; i < m; i++) {
                for (j = 0; j < q; j++) {
                    for (k = 0; k < p; k++) {
                        hasil = hasil + A[i][k] * B[k][j];
                    }
                    C[i][j] = hasil;
                    hasil = 0;
                }
            }
            System.out.println("Hasil perkalian matriks: ");
            for (i = 0; i < m; i++) {
                for (j = 0; j < q; j++) {
                    System.out.print(C[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
}

