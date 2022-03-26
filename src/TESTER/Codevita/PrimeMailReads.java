package TESTER.Codevita;

import java.util.*;

public class PrimeMailReads {
    static ArrayList<Integer> mails = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long noOfMails = sc.nextLong();

        for(int i = 0; i < noOfMails; i++){
            mails.add(i+1);
        }
        int c = 1;
        int i = 1;
        while (i > 0) {
            primeremoval();
            one_removal();
            c++;
            if(mails.size() == 1)
                break;
            i++;
        }
        System.out.println(c);
    }

    public static void primeremoval(){
        mails.add(0,-2);
        for(int i = 1; i < mails.size(); i++) {
            if (isprime(i) == 2 ) {
                mails.set(i, -1);
            }
        }
        mails.remove(0);
    }

    public static int isprime(int n){
        int c = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0)
                c++;
        }
        return c;
    }


    public static void  one_removal(){
        Collections.sort(mails);
        for(int i = 0; i < mails.size(); ) {
            if(mails.get((i+1)) != -1) {
                break;
            }
            else
                mails.remove(i);
        }
        mails.remove(0);
    }
}