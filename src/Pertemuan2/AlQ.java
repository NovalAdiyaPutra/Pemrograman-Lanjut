package Pertemuan2;

public class AlQ { //REKUIRSIF

    public static int hitungNilaiQ(int n) {
        if (n == 1) {
            return 1; // Kondisi berhenti
        } else {
            return hitungNilaiQ(n - 1) + 2 * n - 1; // Pemanggilan rekursif
        }
    }

    public static void main(String[] args) {
        int n = 14; // Contoh input
        int nilaiQ = hitungNilaiQ(n);
        System.out.println("Nilai Q(" + n + ") = " + nilaiQ);
    }
}

