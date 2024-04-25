package Pertemuan2;
public class Mystery {

    public static int hitungJumlahKuadrat(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 5;
        int jumlahKuadrat = hitungJumlahKuadrat(n);
        System.out.println("Jumlah kuadrat dari " + n + " bilangan bulat positif pertama: " + jumlahKuadrat);
    }
}
