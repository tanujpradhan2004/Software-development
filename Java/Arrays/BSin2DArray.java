package binarySearch;
import java.util.Arrays;
public class BSin2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {10,20,30,40},
            {12,22,32,42},
            {15,25,35,45},
            {18,28,38,48}
        };
        System.out.println(Arrays.toString(algo(arr, 28)));
        
    }

    static int[] algo(int[][] arr , int a){
        int r = 0;
        int c = arr.length -1;

        while(r < arr.length && c >= 0){
            if(arr[r][c] == a ){
                return new int[] {r,c};
            }
            if(a > arr[r][c] ){
                r++;
            }
            else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
