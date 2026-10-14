class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int n = nums[i];
            if(map.containsKey(target-n) && map.get(target - n)<i+1){
                return new int[]{map.get(target -n), i+1};
            }else{
                map.put(n,i+1);
            }
        }
        return new int[2];
    }
}
