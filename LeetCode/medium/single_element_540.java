public class single_element_540 {
    public static void main(String[] args) {
        int[] nums = {1,1,3,3,4,4,5,8,8};
        System.out.println(singleNonDuplicate(nums));
    }
    static int singleNonDuplicate(int[] nums) {
        // int res = -1 ;
        int s = 0 ;
        int e = nums.length -1 ;
        while(s < e){
            int m = s + (e - s) / 2 ;
            if(m % 2 == 1){
                m -- ;
            }
            if(nums[m] == nums[m + 1]){
                s = m + 2 ;
            }
            else{
                e = m;
            }
                
        }

        return nums[s] ;
    }
}
