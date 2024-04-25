package Pertemuan2;
public class RandomGenerator {

    public static int[] generateRandomSequence(int n, int m, int seed, int a, int b) {
        int[] sequence = new int[n]; // Array to store the random sequence

        sequence[0] = seed; // Initialize the first element with the seed

        for (int i = 1; i < n; i++) {
            sequence[i] = (a * sequence[i - 1] + b) % m;
        }

        return sequence;
    }

    public static void main(String[] args) {
        int n = 10; // Number of random numbers to generate
        int m = 100; // Modulus (range of generated numbers: 0 to m-1)
        int seed = 1234; // Initial seed value
        int a = 5; // Multiplier
        int b = 3; // Increment

        int[] randomSequence = generateRandomSequence(n, m, seed, a, b);

        System.out.println("Generated random sequence:");
        for (int num : randomSequence) {
            System.out.print(num + " ");
        }
    }
}
