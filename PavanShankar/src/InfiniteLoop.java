public class InfiniteLoop {
    public static void main(String[] args) {
        int i = 10;

        while(i >0){
            if(i == 4){
                continue;
            }
            System.out.println(i);
            i--;
        }
//        while(true){
//            System.out.println("hello");
//        }
//        for(; ;){
//            System.out.println("infinite loop");
//        }
    }
}
