package Pertemuan3.OOP;
abstract class Animal
{
    public abstract void animalSound();
    public void sleep()
    {
        System.out.println("Zzz");
    }
}
class Cow extends Animal
{
    public void animalSound()
    {
        System.out.println("The cow says: moo moo");
    }
}
public class Abstract {
    public static void main(String[] args)
    {
        Cow myCow = new Cow();
        myCow.animalSound();
        myCow.sleep();
    }
}
