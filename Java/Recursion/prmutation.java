package recursion;

public class prmutation {
    public static void main(String[] args) {
        String s = "abc";
        perm("", s);
    }
    static void perm(String a , String s){
       if(s.isEmpty()){
        System.out.println(a);
        return ;
       }
       char ch = s.charAt(0);
       for(int i = 0 ; i <= a.length() ; i++){
        String f = a.substring(0,i);
        String g = a.substring(i , a.length());
        perm(f + ch + g, s.substring(1));
       }
    }
}
