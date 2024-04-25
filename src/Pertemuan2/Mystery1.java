package Pertemuan2;
import java.util.Scanner;

    public class Mystery1 {

        public static int hitungJumlahKuadrat(int n) {
            int sum = 0;
            //int constant = 6; // Pre-komputasi konstanta 6
            for (int i = 1; i <= n; i += 2) {
                sum += i * i; // Hitung i^2
                if (i + 1 <= n) {
                    sum += (i + 1) * (i + 1); // Hitung (i+1)^2
                }
                if (i == n) { // Terminasi dini untuk n genap
                    break;
                }
            }
            return sum; //* constant; // Kalikan dengan konstanta di akhir
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan nilai n: ");
            int n = scanner.nextInt();

            int jumlahKuadrat = hitungJumlahKuadrat(n);
            System.out.println("Jumlah kuadrat dari " + n + " bilangan bulat positif pertama: " + jumlahKuadrat);

            scanner.close(); // Tutup Scanner untuk menghindari kebocoran sumber daya
        }
    }


