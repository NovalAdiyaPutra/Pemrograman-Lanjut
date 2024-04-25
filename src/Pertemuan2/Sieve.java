package Pertemuan2;

public class Sieve {

    public static int[] saringan(int n) {
        // Buat array boolean dengan ukuran n+1 untuk menyimpan status prima
        boolean[] isPrima = new boolean[n + 1];

        // Awalnya semua angka dianggap prima
        for (int i = 2; i <= n; i++) {
            isPrima[i] = true;
        }

        // Saring bilangan yang bukan prima
        for (int i = 2; i * i <= n; i++) {
            if (isPrima[i]) {
                // Tandai kelipatan i sebagai bukan prima
                for (int j = i * i; j <= n; j += i) {
                    isPrima[j] = false;
                }
            }
        }

        // Hitung jumlah bilangan prima
        int jumlahPrima = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrima[i]) {
                jumlahPrima++;
            }
        }

        // Buat array baru untuk menyimpan bilangan prima
        int[] prima = new int[jumlahPrima];

        // Tambahkan bilangan prima ke array prima
        int index = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrima[i]) {
                prima[index++] = i;
            }
        }

        return prima;
    }

    public static void main(String[] args) {
        int n = 100; // Batas pencarian bilangan prima
        int[] bilanganPrima = saringan(n);

        System.out.println("Bilangan prima sampai dengan " + n + ":");
        for (int bilPrima : bilanganPrima) {
            System.out.print(bilPrima + " ");
        }
    }
}
