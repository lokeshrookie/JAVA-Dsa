package MindtreeInternship.JavaFoundation;

import java.util.Random;
import java.util.Scanner;

/** Password Generator **/
public class A3P3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int length = s.nextInt();
        String Upper = "ABCDEFGHIJKLMNOPQRLSUVWXYZ";
        String Lower = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "1234567890";
        String SpecialChars = "!@#$%^&*(){}_+:;][-=?>/.<,~`";
        String AllCombinations = Upper + Lower + numbers + SpecialChars;
        Random random = new Random();


        StringBuilder password = new StringBuilder();
        for(int i = 0; i<length; i++){
            int k = (int) random.nextInt((AllCombinations.length()-1));
            password.append(AllCombinations.charAt(k));
        }
        System.out.println("Password: " + password);
    }
}

class RandomPassword {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of customer:");
        String name=sc.nextLine();
        System.out.println("Enter age of customer:");
        String age=sc.nextLine();
        System.out.println("Enter id of customer:");
        String id=sc.nextLine();
        System.out.println(generatePassword(name,age,id));
        sc.close();
    }

    private static char[] generatePassword(String name,String age, String id) {

        name = name.replaceAll(" ", "");
        String combinedChars = name + age + id ;
        Random random = new Random();
        char[] password = new char[8];

        password[1] = age.charAt(random.nextInt(age.length()));
        password[0] = name.charAt(random.nextInt(name.length()));
        password[2] = id.charAt(random.nextInt(id.length()));


        for (int i = 3; i < 8; i++) {
            password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
        }
        return password;
    }
}


