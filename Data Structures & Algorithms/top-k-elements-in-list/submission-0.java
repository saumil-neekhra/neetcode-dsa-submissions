class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i,0) + 1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> heap = new PriorityQueue<>((e1,e2) ->
        Integer.compare(e2.getValue(),e1.getValue()));

        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            heap.add(e);
        }
        int[] result = new int[k];
        for(int p = 0; p < k; p++){
            result[p] = heap.poll().getKey();
        }
        return result;
    }
}
