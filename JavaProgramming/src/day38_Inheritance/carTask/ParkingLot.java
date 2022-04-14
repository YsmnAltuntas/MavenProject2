package day38_Inheritance.carTask;

public class ParkingLot {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Toyota","Cemry",2020,20000,"Grey",123456);

        Tesla tesla = new Tesla("Tesla","Model S",2022,94990,"Red",0);

        BMW bmw = new BMW("BMW","X5",2020,67350,"Black",12000);


        toyota.start();
        tesla.start();
        bmw.start();


    }
}
