package SourceCode.capegemini;

import java.util.*;

public class Source {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[5];
        for (int i = 0; i < 5; i++) {

            arr[i] = sc.nextLine();
        }
        Arrays.sort(arr);

        for (int j = 4; j >= 0; j--) {
            System.out.println(arr[j]);
        }

    }
}