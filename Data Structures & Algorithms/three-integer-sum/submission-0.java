class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int i=0;
        Arrays.sort(nums);
        while(i<nums.length){
            if (i > 0 && nums[i] == nums[i - 1]) {
                i++;
                continue;
            }
            int target = -nums[i];
            int j = i+1;
            int k = nums.length -1;
            while(j<k){
                int sum = nums[j] + nums[k];
                if(sum>target){
                    k--;
                }else if(sum<target){
                    j++;
                }else{
                    list.add(new ArrayList<>(List.of(nums[i],nums[j],nums[k])));
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;
                }
            }
            i++;
        }
        return list;
    }
}
