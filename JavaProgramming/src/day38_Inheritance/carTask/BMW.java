package day38_Inheritance.carTask;

public class BMW extends Car {

    public BMW(String brand, String model, int year, double price, String color, double miles) {
        super(brand, model, year, price, color, miles);
    }

    public void breaksDown(){
        System.out.println();
    }

    public void racing(){
        System.out.println();
    }
}
