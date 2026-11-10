package recursion;

public class countZeroes {
    public static void main(String[] args) {
        int n = 3002130;
        int c = 0;
        System.out.println(countZ(n , c));
    }
    static int countZ(int n , int c){
       if(n%10 == n){
        return c ;
       }
       if(n%10 == 0){
        return countZ(n/10, c+1);
       }
       return countZ(n/10, c);
    }
}
