package recursion;
import java.util.Arrays;
public class sortSelection {
    public static void main(String[] args) {
        int[] arr = {5,4,2,3,-1,1};
        int index = 0 ;
        int length = arr.length -1 ;
        int value = 0 ;
        sort(arr, index, length, value );
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr , int index , int length, int max){
        if(length == 0){
            return ;
        }
        if(index <= length){
            if(arr[max] < arr[index]){
               sort(arr, index + 1, length, index);    
            }    
            else{
                sort(arr, index + 1, length, max);
            }
        }
        else{
            int temp = arr[length ];
            arr[length ] = arr[max];
            arr[max] = temp ; 

        sort(arr, 0, length - 1, 0 );

        }
        
    }
}
