package recursion;

import java.util.ArrayList;
// import java.util.Arrays;

public class ArrayRecursionSearching {
    public static void main(String[] args) {
        int[] nums = {1,3,2,4,4,5,6,5,7,8,9,5};
        int target = 4  ;
        int index = -1 ;
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println( search(nums, target , 0));
        System.out.println( search1stIndex(nums, target , 0));
        System.out.println( searchLastIndex(nums, target , 0 , index ));
        System.out.println( searchAllIndex(nums, target , 0 ,  arr ));
        System.out.println( searchAllIndex2(nums, target , 0  ));
    }

    static boolean search(int[] nums , int target , int n){
        if(n == nums.length ){
            return false ;
        }
        return target == nums[n] || search(nums, target, n + 1);
    }

    static int search1stIndex(int[] nums , int target , int n){
        if(n == nums.length ){
            return -1 ;
        }
        if(target == nums[n]){
            return n;
        }
        return search1stIndex(nums, target, n + 1);
    }

    static int searchLastIndex(int[] nums , int target , int n , int index){
        if(n == nums.length ){
            return index ;
        }
        if(target == nums[n]){
            index = n ;
            // return searchLastIndex(nums, target, n + 1 , index);
        }
        return searchLastIndex(nums, target, n + 1, index);
    }

    static ArrayList<Integer> searchAllIndex(int[] nums , int target , int n , ArrayList<Integer> arr){
        
        if(n == nums.length ){
            return arr ;
        }
        if(target == nums[n]){
            arr.add(n);
           
        }
        return searchAllIndex(nums, target, n + 1, arr) ;
    }
    static ArrayList<Integer> searchAllIndex2(int[] nums , int target , int n){
        ArrayList<Integer> arr = new ArrayList<>();
        if(n == nums.length ){
            return arr ;
        }
        if(target == nums[n]){
            arr.add(n);
           
        }
        ArrayList<Integer> arr2 = searchAllIndex2(nums , target , n + 1) ;
    

        arr.addAll(arr2); // addAll means add elements but not empty list
     
        return arr ;
    }
}
