package Pertemuan7;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 1;
        System.out.println("Inputkan Bilangan Positif Integer : ");
        int nilai = input.nextInt();

        while (nilai>1){
            count++;
            nilai=nilai/2;
        }
        System.out.println("digit : " +count);
    }
}
