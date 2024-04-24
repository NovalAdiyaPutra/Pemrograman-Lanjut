package Pertemuan6;
import java.util.*;

public class Factorial{
    static int f(int n) {
        if (n == 0) {
            return 1; //basis
        }
        return n * f(n - 1); //rekurens.
    }
    public static void main(String[] args){
        int nilai, hasil;
        Scanner input = new Scanner(System.in); System.out.print("Masukkan bilangan: ");
        nilai = input.nextInt();
        hasil = f(nilai);
        System.out.println(" ");
        System.out.println("Faktorial dari "+nilai+" adalah "+hasil);}
}