package day40_FinalKeyword;

public class FinalVariable {

    final String birthday; // burdaki instance variable a constructors atamazsak, compile olur.
    static String name;

    static {
        name = "Batch 25";
    }

    public FinalVariable(String birthday) {
        this.birthday = birthday;
    }

    public static void main(String[] args) {

        final double pi = 3.14;
       // pi = 4.14; final variables can  not be reassigned
       // pi= 5.14;

        final String name;
        name = "Java";
        // name = "Wooden Spoon"; not allowed to reassigned

        System.out.println(name);
        System.out.println("------------------------------");

        FinalVariable obj = new FinalVariable("May/01");
        //obj.birthday = "June/01"; Final variables can not reassigned. Instance variable, we call it through the object
        System.out.println(obj.birthday);

        System.out.println("------------------------------");

        FinalVariable.name = "Pyhton"; // Static name'i degistirebiliriz ama final i asla degistiremeyiz.

        System.out.println(FinalVariable.name);// through the class name
    }
}
