package Pertemuan3.OOP;
interface Animalll {
    public void animalSound(); // interface method (does not have a body)
    public void sleep(); // interface method (does not have a body)
}
class Cowww implements Animalll {
    public void animalSound() {
        System.out.println("The cow says: moo moo");
    }
    public void sleep() {
        System.out.println("Zzz");
    }
}
public class Interface {
    public static void main(String[] args) {
        Cowww myCow = new Cowww();
        myCow.animalSound();
        myCow.sleep();
    }
}
