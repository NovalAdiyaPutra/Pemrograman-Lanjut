package Pertemuan3.OOP;

public class This {
    int x;
    // Constructor dengan parameter
    public This(int x)
    {
        this.x = x;
    }
    // Memanggil constructor
    public static void main(String[] args)
    {
        This myObj = new This(5);
        System.out.println("Nilai x =" + myObj.x);
    }
}
