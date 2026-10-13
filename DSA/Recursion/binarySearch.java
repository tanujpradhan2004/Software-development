package recursion;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,11};
        int target = 1;
        int s = search(arr, target, 0, arr.length -1 );
        System.out.println(s);
    }
    static int search(int[] arr , int t , int s , int e){
        if(s > e){
            return -1;
        }
        int m = s + (e - s) / 2;
        if(t == arr[m]){
            return m;
        }
        if(t > m){
            return search(arr, t, m + 1, e);
        }
        
        return search(arr, t, s, m - 1);

    }
}
