class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = nums.length-1;
        while(i<j){
            while(nums[i]+nums[j]>target){
                j--;
            }
            while(nums[i]+nums[j]<target){
                i++;
            }
            if(nums[i]+nums[j]==target){
                break;
            }
        }
        return new int[]{i+1,j+1};

    }
}
