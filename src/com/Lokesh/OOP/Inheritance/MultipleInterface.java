package com.Lokesh.OOP.Inheritance;

public class MultipleInterface{
    public static void main(String[] args) {
        System.out.println("Hello World ");

    }
}


 interface  A{
      int a = 5;
}
interface  B extends  A{
      int b = 6;

}
class  C implements B{
    public static void main(String[] args) {
        System.out.println(a + b);
    }
}