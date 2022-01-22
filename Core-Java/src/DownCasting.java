

class Parent {
    String name;

    public static void main(String[] args) {
        String l = "Lokesh & - +";
        System.out.println(l.codePointCount(0,l.length()));
        System.out.println(l.length());
        System.out.println(l.codePointAt(1));
        System.out.println(l.endsWith(" "));
        System.out.println('L' + 'M');
    }

    // A method which prints the data of the parent class
    void showMessage()
    {
        System.out.println("Parent method is called");
    }
}

// Child class
class Child extends Parent {
    int age;

    // Performing overriding
    @Override
    void showMessage()
    {
        System.out.println("Child method is called");
    }
}



public class DownCasting{

    public static void main(String[] args)
    {
        Parent p = new Child();
        p.name = "Shubham";

        // Performing Downcasting Implicitly
        //Child c = new Parent(); // it gives compile-time error

        // Performing Downcasting Explicitly
        Child c = (Child)p;

        c.age = 18;
        System.out.println(c.name);
        System.out.println(c.age);
        p.showMessage();
        c.showMessage();
    }
}
