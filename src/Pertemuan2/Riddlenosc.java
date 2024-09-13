package Pertemuan2;

public class Riddlenosc {

    public static double findMinRiddle(double[] A) {
        if (A.length == 1) {
            return A[0]; // Base case: return single element
        }

        double temp = findMinRiddle(java.util.Arrays.copyOfRange(A, 0, A.length - 1)); // Recursive call for sub-array
        return Math.min(temp, A[A.length - 1]); // Return minimum of sub-array and last element
    }

    public static void main(String[] args) {
        double[] A = {5.2, 3.1, 4.7, 2.8, 1.6}; // Pre-defined array
        double smallestElement = findMinRiddle(A);
        System.out.println("The smallest element is: " + smallestElement);
    }
}

