package day39_Recap.ShapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Square square = new Square(10);

        System.out.println(square);

        square.setSide(15);// setSide olmadan direkt yeni bir icerik atayamayiz, private oldugu icin.
        System.out.println(square);

        System.out.println("-----------------------------");

        Rectangle rectangle = new Rectangle(5,6);
        System.out.println(rectangle);

        rectangle.setLength(10);
        System.out.println(rectangle.getLength());
        System.out.println(rectangle);

        System.out.println("------------------------------");

        Circle circle = new Circle(10);
        circle.setRadius(15.5);
        System.out.println(circle.getRadius());
        System.out.println(circle);



    }


}
