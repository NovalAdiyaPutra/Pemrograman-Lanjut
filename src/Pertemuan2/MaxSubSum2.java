public static int MaxSubSum2 (int [] A){
    int maxSum = 0;
    for (int i = 0; i < A.length; i++){
        int thisSum = 0;
        for (int j = i; j < A.length; j++){
            thisSum += A[j];
            if (thisSum > maxSum){
                maxSum = thisSum;
            }
        }
    }
    return maxSum;
}

public void main() {
}
