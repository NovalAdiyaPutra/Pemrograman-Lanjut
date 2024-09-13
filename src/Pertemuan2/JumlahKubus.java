package Pertemuan2;
public class JumlahKubus {

    public static int jumlahKubus(int n) {
        if (n == 1) {
            return 1; // Basis: n = 1, kembalikan 1
        } else {
            return jumlahKubus(n - 1) + n * n * n; // Rekursi: hitung jumlah (n-1) + n^3
        }
    }

    public static void main(String[] args) {
        int jumlahBilangan = 5;
        int jumlahKubus = jumlahKubus(jumlahBilangan);
        System.out.println("Jumlah kubus dari " + jumlahBilangan + " bilangan bulat positif pertama adalah: " + jumlahKubus);
    }
}
