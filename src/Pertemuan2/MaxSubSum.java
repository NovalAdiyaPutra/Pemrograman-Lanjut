public static int maxSubSum(int [ ]A) {

    int maxSum = 0;

    for (int ii = 0; ii < A.length; ii++) {
        for (int jj = ii; jj < A.length ; jj++){

            int thisSum = 0;
            for (int kk = ii; kk <= jj; kk++){
                thisSum += A[kk];
            if (thisSum > maxSum )
                maxSum = thisSum;
            }
        }
    }return maxSum;
}

public static void main(String[] args) {
    int[] A = {1, 2, 3, 4, -5};
    int maxSum = maxSubSum(A);
    System.out.println("Penjumlahan maksimum subarray: " + maxSum); // Output: 10
}