package recursion;

import java.util.ArrayList;
public class subSequence {
    public static void main(String[] args) {
        String s = "abc";
        // subSeq("", s);
        System.out.println(subSeq2("", s));
    }

    static ArrayList<String> subSeq2(String e , String s){
        ArrayList<String> list = new ArrayList<>();
        if(s.isEmpty()){
            list.add(e);
            return list ;
        }
        char ch = s.charAt(0);

        ArrayList<String> left = subSeq2(e + ch, s.substring(1));
        ArrayList<String> right = subSeq2(e, s.substring(1));
        // ArrayList<String> num = subSeq2(e + 0, s.substring(1));

        left.addAll(right);
        // left.addAll(num);

        return  left ;
    }


    static void subSeq(String a, String s){
        if(s.isEmpty()){
            System.out.println(a);
            return ;
        }
        char ch = s.charAt(0);

        subSeq( a + ch , s.substring(1) );
        subSeq(a, s.substring(1));
    }
}
