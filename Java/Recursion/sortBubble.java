package recursion;

import java.util.Arrays;

public class sortBubble {
    public static void main(String[] args) {
        int[] arr = {5,4,2,3,-1,1};
        int index = 0 ;
        int length = arr.length - 1  ;
        sort(arr ,index ,length );
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr , int index , int length){
        if( length == 0  ){
            return ;
        }
        if(index < length){
            if(arr[index] > arr[index + 1]){
                int temp = arr[index];
                arr[index] = arr[index + 1] ;
                arr[index + 1] = temp ;
                
            }
            sort(arr, index + 1, length);
        }
        sort(arr, 0, length - 1);    
    }
}
