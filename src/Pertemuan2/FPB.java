package Pertemuan2;

public class FPB { //euclid
        public static int gcd(int m, int n) {
            while (n != 0) {
                int r = m % n;
                m = n;
                n = r;
            }
            return m;
        }

        public static void main(String[] args) {
            // Contoh penggunaan
            int num1 = 24;
            int num2 = 8;
            int gcd = gcd(num1, num2);
            System.out.println("FPB dari " + num1 + " dan " + num2 + " adalah: " + gcd);
        }
    }
