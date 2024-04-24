package Pertemuan3.OOP;

class Vehicle //test à final class
{
    protected String brand = "Ford"; //test à private String
    public void honk()
    {
        System.out.println("Tuut, tuut!");
    }
}
class Car extends Vehicle
{
    private String modelName = "Mustang";
    public static void main(String[] args)
    {
        Car myFastCar = new Car();
        myFastCar.honk();
        System.out.println(myFastCar.brand + " " + myFastCar.modelName);
    }
}