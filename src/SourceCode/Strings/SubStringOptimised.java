package SourceCode.Strings;

public class SubStringOptimised {
    public static void main(String[] args) {
        String s = "loki";
        sub2(s);
    }

    static  void sub(String  s){
        for(int i = 0; i<s.length(); i++){
            for(int j = i+1; j<=s.length(); j++){
                System.out.println(s.substring(i,j)); // subString method do not include j.
            }
        }
    }


    static  void sub2(String s){
        for(int i = 0; i<s.length(); i++){
            for(int j = i+1; j<=s.length();j++){
                System.out.println(s.substring(i,j));
            }
        }
    }

}
