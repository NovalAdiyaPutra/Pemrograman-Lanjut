package Pertemuan3.OOP;

class Animall {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}
class Coww extends Animal {
    public void animalSound() {
        System.out.println("The cow says: moo moo");
    }
}
class Cat extends Animal {
    public void animalSound() {
        System.out.println("The cat says: miaw miaw");
    }
}
class Polymorphisme {
    public static void main(String[] args) {
        Animall myAnimal = new Animall();
        Animal myCow = new Cow();
        Animal myCat = new Cat();
        myAnimal.animalSound();
        myCow.animalSound();
        myCat.animalSound();
    }
}
