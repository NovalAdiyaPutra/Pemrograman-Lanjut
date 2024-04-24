public static int findDifference(int[] A) {
    int minval = A[0];
    int maxval = A[0]; // Initialize maxval as well

    for (int i = 1; i < A.length; i++) {
        if (A[i] < minval) {
            minval = A[i];
        }
        if (A[i] > maxval) {
            maxval = A[i];
        }
    }

    return maxval - minval;
}

public void main() {
    int[] A = {5, 2, 4, 1, 3};
    int difference = findDifference(A);
    System.out.println("Perbedaan nilai maksimum dan minimum: " + difference);
}

