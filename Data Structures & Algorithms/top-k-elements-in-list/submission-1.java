class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i,0) + 1);
        }
        List<Integer>[] arr = new List[nums.length+1];
        for(int i=0;i<arr.length;i++){
            arr[i] = new ArrayList<>();
        }
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            arr[e.getValue()].add(e.getKey());
        }
        int p=0;
        int[] result = new int[k];
        for(int i = arr.length-1;i>=0 && p<k;i--){
            for(int n:arr[i]){
                if(p==k){
                    break;
                }
                result[p++] = n;
            }
        }

        return result;
    }
}
