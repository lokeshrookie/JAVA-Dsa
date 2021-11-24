package TESTER;

public class Pattern {
    public static void main(String[] args) {
        /**
         * 1
         * 2 3
         * 4 5 6
         * 7 8 9 10
         */
        int n = 5;
        pattern17(n);

    }

    static  void  pattern4(int n){
        for(int row = 1; row<=n; row++){
            for(int col = 1; col <=row ; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static  void pattern5(int n){
        for(int row = 1; row<=n; row++){
            for(int col = 1; col <=row ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int row = 1; row<=n; row++){
            for(int col = n-1; col>=row ; col--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }


    static  void pattern6(int n){
        for(int row = 1; row<=n; row++){
            for(int col = 1; col <=n ; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }


    static  void pattern17(int n){
        for(int row = 1; row <=n; row++){
            for(int col = 1; col < row; col++){
                System.out.print(col);
            }
            for(int col = row; col>=1; col--){
                System.out.print(col);
            }
            System.out.println();

            for(int col = 1; col < row; col++){
                System.out.print(col);
            }
            for(int col = row; col>=1; col--){
                System.out.print(col);
            }
            System.out.println();
        }

    }

    static void pattern28(int n){
        for(int row = 1; row<=n; row++){
            for(int spaces = 0; spaces <=n-row; spaces++){
                System.out.print("  ");
            }
            for(int col = row; col >=1; col--){

                System.out.print(col + " ");
            }
            for(int col = 2; col <=row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}






