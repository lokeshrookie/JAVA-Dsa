package SourceCode.OOP.Inheritance;

public class MultipleInterface{
    public static void main(String[] args) {
        System.out.println("Hello World ");
    }
}


 interface  A{
      int a = 5;
}
interface  B{
      int b = 6;
}
class  C implements A,B{
    public static void main(String[] args) {
        System.out.println(a + b);
    }
}