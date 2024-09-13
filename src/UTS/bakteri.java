package UTS;

import java.util.Scanner;

public class bakteri {
    public static int countBacteria(int t) {
        if (t == 0) {
            return 5;
        } else {
            return countBacteria(t - 1) * 2; 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan waktu dalam jam: ");
        int waktu = scanner.nextInt();

        scanner.close();

        int jumlahBakteri = countBacteria(waktu);
        System.out.println("Jumlah bakteri setelah " + waktu + " jam: " + jumlahBakteri);
    }
}
