package methods;

public class addition {
    public static void main(String[] args) {
        System.out.println(sum(54,98));
//        System.out.println(name("paw"));
        name("pavan sankar");
        name("lokesh");

    }
    static int sum(int a, int b){
        return a+b;
    }
    static void name(String name){
        System.out.println("My name is " + name);
    }
}
