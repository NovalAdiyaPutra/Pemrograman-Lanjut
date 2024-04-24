public static int MaxElement(int[] A) {
    // Menentukan nilai elemen pertama sebagai nilai maksimum
    int maxval = A[0];

    // Melakukan perulangan dari elemen kedua hingga elemen terakhir
    for (int i = 1; i < A.length; i++) {
        // Jika nilai elemen saat ini lebih besar dari nilai maksimum
        if (A[i] > maxval) {
            // Menetapkan nilai elemen saat ini sebagai nilai maksimum
            maxval = A[i];
        }
    }

    // Mengembalikan nilai elemen terbesar
    return maxval;
}

public void main() {
    int[] A = {5, 2, 4, 1, 3};
    int MaxElement = MaxElement(A);
    System.out.println("Nilai elemen terbesar: " + MaxElement);
}

