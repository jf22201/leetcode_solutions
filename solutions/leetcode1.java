public class leetcode1 {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            if(nums.length <= 2){
                int[] arr = {0,1};
                return arr;
            }else{
                int[] sortedNums = nums.clone();
                java.util.Arrays.sort(sortedNums);
                int frontIndex = 0;
                int backIndex = nums.length - 1;
                while(true){
                    int sum = sortedNums[frontIndex] + sortedNums[backIndex];
                    if(sum == target){
                        frontIndex = getIndex(sortedNums[frontIndex],nums);
                        if (nums[frontIndex] == sortedNums[backIndex]){
                            backIndex = getIndex(sortedNums[backIndex],frontIndex,nums);
                        }else{
                            backIndex = getIndex(sortedNums[backIndex],nums);
                        }
                        int[] arr = {frontIndex,backIndex};
                        return arr;
                    }
                    else{
                        if(sum > target){
                            backIndex--;
                        }else{
                            frontIndex++;
                        }
                    }
                }
            }
        }
        int getIndex(int value, int[] arr){
            for(int i=0;i<arr.length;i++){
                if(arr[i] == value){
                    return i;
                }
            }
            return 0;
        }
        int getIndex(int value,int index, int[] arr){
            for(int i=index+1;i<arr.length;i++){
                if(arr[i] == value){
                    return i;
                }
            }
            return 0;
        }
    }
}
