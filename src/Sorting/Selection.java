package Sorting;

public class Selection {
    public static void main(String[] args) {
        int[] data = { 25, 57, 48, 37, 12, 92, 80, 33};
        urutkan(data, data.length);

        System.out.println("Hasil Pengurutan Data: ");
        tampilanlarik(data, data.length);
    }

    public static void tampilanlarik(int[] data, int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", data[i]);
        }
        System.out.println();
    }

    public static void urutkan(int[] data, int n) {
        int posMin, j, tmp;
        for (int posAwal = 0; posAwal < n - 1; posAwal++) {
            posMin = posAwal;
            for (j = posAwal + 1; j < n; j++) {
                if (data[posMin] > data[j]) {
                    posMin = j;
                }
            }

            // Swap after finding minimum element position
            tmp = data[posAwal];
            data[posAwal] = data[posMin];
            data[posMin] = tmp;

            // Print sorted data after each posAwal iteration
            System.out.printf("Hasil Pos Awal %d: ", posAwal);
            tampilanlarik(data, n);
        }
    }
}
