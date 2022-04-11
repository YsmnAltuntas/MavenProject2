package day38_Inheritance.carTask;

import day38_Inheritance.carTask.Car;

public class Toyota extends Car {

    public Toyota(String brand, String model, int year, double price, String color, double miles) {
        super("Toyota", model, year, price, color, miles);
    }

    public void reliable(){
        System.out.println(brand+" "+model+" is reliable");
    }


}
/*
    Create a class called Car
        instance variables:
        brand, model, year, price, color, miles

        add a constructor to set all the fields

        instance methods:
        start(), drive(),toString()

        Create the following sub classes of Car:
        1. Toyota:
        extra methods:
        reliabile()
*/