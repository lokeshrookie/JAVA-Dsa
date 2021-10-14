package com.Lokesh;

public class Patterns {
    public static void main(String[] args) {
        int n = 5;
        char ch = 'A';
        for(int i = 1; i<=n; i ++){
                  for(int j =1; j<=i; j++){
                      System.out.print(ch); // print "j"
                      ch++;
                  }

                  System.out.println();
              }
    }
    /*
      Pattern1
               *
               * *
               * * *
               * * * *

               code:
               for(int i = 1; i<=n; i ++){
                  for(int j =1; j<=i; j++){
                      System.out.print("* ");
                  }
                  System.out.println();
              }

      pattern2

               * * * *
               * * *
               * *
               *

               code:

           for(int i = n; i>= 1; i --){
                  for(int j = i; j>=1; j--){
                      System.out.print("* ");
                  }
                  System.out.println();
              }


      Pattern3
           * * * *
           * * * *
           * * * *
           * * * *

           code:

           for(int i = 1; i<=n; i ++){
                  for(int j =1; j<=n; j++){
                      System.out.print("* ");
                  }
                  System.out.println();
              }


      pattern4
                   1111
                   2222
                   3333
                   4444

                   code:

           for(int i = 1; i<=n; i ++){
                  for(int j =1; j<=n; j++){
                      System.out.print(i); // print(i)
                  }
                  System.out.println();
              }

       pattern5
                   1234
                   1234
                   1234
                   1234

                   code:

       for(int i = 1; i<=n; i ++){
                  for(int j =1; j<=n; j++){
                      System.out.print(j); //print "j"
                  }
                  System.out.println();
              }


       PATTERN6        1
               12
               123
               1234

               code:

               for(int i = 1; i<=n; i ++){
                  for(int j =1; j<=i; j++){
                      System.out.print(j); // print "j"
                  }
                  System.out.println();
              }

        pattern7
               4
               33
               222
               1111

            code:

            for(int i = n; i>=1; i --){
                  for(int j =n; j>=i; j--){
                      System.out.print(i); // print  "i"
                  }
                  System.out.println();
              }

     pattern 8

           4
           43
           432
           4321

           code:

           for(int i = n; i>=1; i --){
                        for(int j =n; j>=i; j--){
                            System.out.print(j); // print  "j"
                        }
                        System.out.println();
                    }
     */
}
