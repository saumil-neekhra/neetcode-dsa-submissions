class Solution {
    public int maxArea(int[] nums) {
        int answer = 0;
        int l = 0, r = nums.length - 1;
        while(l<r){
            if(nums[l]<=nums[r]){
                answer = Math.max(answer,(r-l)*Math.min(nums[r],nums[l]));
                l++;
            }else{
                answer = Math.max(answer,(r-l)*Math.min(nums[l],nums[r]));
                r--;
            }
        }
        return answer;
    }
}
