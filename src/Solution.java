public class Solution {
    import java.util.*;
    class Solution {
        public int findRepeatNumber(int[] nums) {
            if(nums==null || nums.length==0) return -1;
            for(i=0; i<nums.length; i++){
                while(i != nums[i]){
                    if(nums[i] != nums[nums[i]]){
                        temp = nums[i];
                        nums[i] = nums[nums[i]];
                        nums[nums[i]] = temp;
                    }else{
                        return nums[i];
                    }
                }
            }
            return -1;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner();

            for() {

            }
            Solution s = new Solution();
            if(s.findRepeatNumber() != -1) {
                System.out.print(s.findRepeatNumber());
            }
        }

    }
}
