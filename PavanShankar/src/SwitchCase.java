import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Text t = new Text(n);
        t.method();
    }
}

class Text{
    int num;
    Text(){
        this.num = 0;
    }
    Text(int num){
        this.num = num;
    }
    public void method(){
        switch (num) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            default -> System.out.println("invalid value");

        }
    }

}
