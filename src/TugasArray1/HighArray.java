package TugasArray1;

public class HighArray {
    private double[] a;
    private int nElems;

    // Constructor
    public HighArray(int max) {
        a = new double[max]; // create the array
        nElems = 0; // no items yet
    }

    // Mencari item
    public boolean find(double searchKey) {
        int j;
        for (j = 0; j < nElems; j++) // untuk setiap elemen
            if (a[j] == searchKey) // item ditemukan?
                break; // keluar dari loop sebelum end
        if (j == nElems)
            return false; // yes, tidak ditemukan
        else
            return true; // no, ditemukan
    }

    // Menambahkan elemen
    public void insert(double value) {
        a[nElems] = value;
        nElems++;
    }

    // Menghapus elemen
    public double delete(double value) {
        int index = findIndex(value);
        if (index != -1) {
            double deletedElement = a[index];
            for (int i = index; i < nElems - 1; i++) {
                a[i] = a[i + 1];
            }
            nElems--;
            return deletedElement;
        }
        return -1;
    }

    // Mencari indeks elemen
    private int findIndex(double value) {
        int j;
        for (j = 0; j < nElems; j++) // untuk setiap elemen
            if (a[j] == value) // item ditemukan?
                break; // keluar dari loop sebelum end
        if (j == nElems)
            return -1; // tidak ditemukan
        else
            return j; // ditemukan
    }

    // Menampilkan items
    public void display() {
        for (int j = 0; j < nElems; j++)
            System.out.print(a[j] + " ");
        System.out.println("");
    }
}
