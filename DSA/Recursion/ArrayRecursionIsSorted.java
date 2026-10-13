package recursion;

public class ArrayRecursionIsSorted {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,6,5};
        System.out.println(isSorted(nums , 0));
        System.out.println(isSorted1(nums, 0));
    }
    static boolean isSorted(int[] nums , int n){
        if(n == nums.length - 1){
            return true ;
        }
        if(nums[n] < nums[n+1]){
            return isSorted(nums, n + 1);
        }
        return false ;
    }
    static boolean isSorted1(int[] nums , int n){
        if(n == nums.length - 1){
            return true ;
        }

        return nums[n] < nums[n+1] && isSorted1(nums, n+1);
    }
}
