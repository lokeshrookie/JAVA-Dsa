package SourceCode.BasicPrograms;
import java.util.Scanner;
/*
    a - 97; z = 122;
    A - 65; Z = 90;
 */
public class Ascii {
    public static void main(String[] args) {
        // char a = 'Z';
        // int b = a;
        Scanner s= new Scanner(System.in);
        char ch = s.next().trim().charAt(0);
        s.close();
        if( (ch < 'z' && ch > 'a') || (ch > 'A' && ch < 'Z')) {
            if (ch > 'a' && ch < 'z') {
                System.out.println("lowerCase");
            }
            else if (ch > 'A' && ch < 'Z') {
                System.out.println("HigherCase");
            }
        }
        else{
            System.out.println("Invalid Character!");
        }
//        System.out.println(b);
    }
}
