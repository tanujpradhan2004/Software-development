package binarySearch;

public class infiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,12,34,56,89,90,122,145}; // it will give error out of bound exception because its not a infinite array
        int target = 4;
        System.out.println( indexFinder(arr,target));
    }
    static int indexFinder(int[] arr, int a){
        int start = 0;
        int end = 1 ;
        while(a > arr[end]){
            start = end + 1;
            end = end + start + 2 ;
        }
        return targetFinder(arr,  a ,start , end);
    }

    static int targetFinder(int[] arr, int a, int start , int end){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(a == arr[mid]){
                return mid;
            }
            if(a < arr[mid]){
                end = mid -1 ;
            }
            else{
                start = mid + 1 ;
            }
        }
        return -1;
    }
}
