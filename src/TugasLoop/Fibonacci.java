package TugasLoop;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.print("Inputkan jumlah deret fibonacci: ");
        int number = new Scanner(System.in).nextInt();

        System.out.println("Deret Fibonacci dengan jumlah " +number +" angka : ");
        for (int i = 1; i <= number; i++) {
            System.out.print(fibonacci2(i)+ " ");
        }
    }
    public static int fibonacci1(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }return fibonacci1(number - 1) + fibonacci1(number - 2);
    }

    public static int fibonacci2(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        int fibo1=1,fibo2=1,fibonacci=1;
        for (int i = 3; i <= number; i++) {
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
        }
        return fibonacci;
    }
}