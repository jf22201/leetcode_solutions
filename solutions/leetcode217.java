import java.util.Arrays;
public class leetcode217{
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        for(int i=0;i<length-1;i++){
            int curr = nums[i];
            int next = nums[i+1];
            if(curr == next){
                return true;
            }
            else{

            }
        }
        return false;
    }
}
}