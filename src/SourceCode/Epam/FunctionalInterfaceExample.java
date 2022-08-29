package SourceCode.Epam;

@FunctionalInterface
interface Sayable{
    void say(String msg);
}

public class FunctionalInterfaceExample  implements  Sayable{
    public void say( String msg){

        System.out.println(msg);
    }

    public static void main(String[] args) {
        FunctionalInterfaceExample file = new FunctionalInterfaceExample();
        file.say("This is a message");
    }
}


