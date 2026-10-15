class Solution {
    public int maxArea(int[] nums) {
        int answer = 0;
        int l = 0, r = nums.length - 1;
        int leftMax = nums[0], rightMax = nums[nums.length -1];
        while(l<r){
            if(leftMax<=rightMax){
                answer = Math.max(answer,(r-l)*Math.min(rightMax,nums[l]));
                l++;
                leftMax = nums[l];
            }else{
                answer = Math.max(answer,(r-l)*Math.min(leftMax,nums[r]));
                r--;
                rightMax = nums[r];
            }
        }
        return answer;
    }
}
