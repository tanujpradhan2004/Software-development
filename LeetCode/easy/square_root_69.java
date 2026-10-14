public class square_root_69{
    public static void main(String[] args) {
        int x = 101 ;
        System.out.println(mySqrt(x));
    }
    static int mySqrt(int x) {
        int s = 0 ;
        int e = x; 
        int ans = 0 ;
        while(s <= e){
            int m = s + (e - s) / 2 ;
            if(m*m <= x && m != 0){
                ans = m;
                s = m + 1;
            }
            else{
                
                e = m - 1 ;
            }
            
        }
        return ans ;
    }
}