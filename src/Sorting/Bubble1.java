package Sorting;

public class Bubble1 {
    public static void main(String[] args) {
        int[] data = {25, 57, 48, 36, 12, 92, 80, 33};
        urutkan(data, data.length);

        System.out.println("Hasil Pengurutan Data: ");
        tampilanlarik(data, data.length);
    }

    public static void tampilanlarik(int[] data, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println(); // Print newline at the end
    }

    public static void urutkan(int[] data, int n) {
        int tahap, j, tmp;
        for (tahap = 1; tahap < n; tahap++) {
            for (j = 0; j < n - tahap; j++) {
                if (data[j] > data[j + 1]) {
                    // Swap elements
                    tmp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = tmp;
                }
            }
            // Optional: Comment out if visualization is not needed
            System.out.printf("Hasil tahap %d: ", tahap);
            tampilanlarik(data, n);
        }
    }
}
