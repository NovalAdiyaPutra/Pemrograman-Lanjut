package Pertemuan3.OOP;

public class Static {

    // Static method
    static void myStaticMethod()
    {
        System.out.println("Static methods dapat dipanggil tanpa membuat objek");
    }
    // Public method
    public void myPublicMethod()
    {
        System.out.println("Public methods harus dipanggil dengan membuat objek");
    }
    // Main method
    public static void main(String[] args)
    {
        myStaticMethod(); // Call the static method
        Static myObj = new Static(); // Create an object of MyClass
        myObj.myPublicMethod(); // Call the public method
    }
}
