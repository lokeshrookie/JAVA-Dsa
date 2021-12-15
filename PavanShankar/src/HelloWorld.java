import java.util.Scanner;

public class HelloWorld  extends B{
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        for(int i = 0; i<256; i++){
            System.out.println((char)(i));
        }
    }

}

class B{
    public void g(){
        System.out.println("hlelo");
    }
   static int a;
   int size = 6;
   String str;
    int b;
    B(){
        this.a = 5;
    }
    B(int size){
        this.a = 5;
        this.size = size;
    }
    B(String name){
        this.str = name;
    }
    public void geta(){
        System.out.println(a);
    }

}