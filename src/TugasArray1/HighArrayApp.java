package TugasArray1;

import java.util.ArrayList;

public class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 100; // ukuran array
        HighArray arr;
        arr = new HighArray(maxSize); // membuat array

        // Menambahkan 10 items
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        // Menampilkan items
        arr.display();

        // Mencari item
        int searchKey = 11;
        if (arr.find(searchKey)) {
            System.out.println("Ditemukan " + searchKey);
        } else {
            System.out.println("Tidak ditemukan " + searchKey);
        }

        // Menghapus elemen 0, 55, dan 99
        ArrayList<Double> deletedElements = new ArrayList<>();
        deletedElements.add(arr.delete(0));
        deletedElements.add(arr.delete(55));
        deletedElements.add(arr.delete(99));

        // Menampilkan elemen yang dihapus
        System.out.print("Delete: ");
        for (Double element : deletedElements) {
            System.out.print(element + " ");
        }
        System.out.println("");
        arr.display();
    }

}
