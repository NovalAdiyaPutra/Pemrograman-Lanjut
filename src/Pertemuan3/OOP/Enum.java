package Pertemuan3.OOP;

public class Enum {
    enum Level
    {
        LOW,
        MEDIUM,
        HIGH
    }
    public static void main(String[] args)
    {
        Level myVar = Level.MEDIUM;
        System.out.println(myVar);
    }
}