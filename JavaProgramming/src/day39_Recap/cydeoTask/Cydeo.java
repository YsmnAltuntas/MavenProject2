package day39_Recap.cydeoTask;

public class Cydeo {

    public static void main(String[] args) {


        Tester tester = new Tester("Olga",27,'F',2,"SDET",110000);

        Developer developer = new Developer("Korkmaz",29,'M',1,"Java Developer",125000);

        Teacher teacher = new Teacher("Daniel",32,'M',3,"Math Teacher",100000);

        Student student = new Student("Suhaib",30,'M',8,"SDET");

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(student);

        System.out.println("--------------------------------------------");

        developer.setAge(39);
        System.out.println(developer.getAge());// sadece age 'in yeni durumunu görmek istiyoruz.
        System.out.println(developer);

        developer.work();
        tester.work();
        teacher.work();

        System.out.println("-------------------------------------------");

        developer.eat();
        developer.drink();
        developer.sleep();

        developer.fixingBugs();
        System.out.println("------------------------------------------------");

        tester.eat();
        teacher.drink();
        teacher.sleep();

        tester.createTicket();

        System.out.println("---------------------------------------------------");

        student.eat();
        student.drink();
        student.sleep();


    }

}
/*
7. Create a class named Cydeo:

create objects of Tester, Developer,Teacher, Student

test all the functions of each objects

Analyze the relationships between the classes

 */
