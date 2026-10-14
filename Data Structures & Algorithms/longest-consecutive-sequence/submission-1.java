class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : nums){
            pq.add(i);
        }
        int t = pq.poll();
        int maxCount = 1;
        int count = 1;
        while(!pq.isEmpty()){
            if(pq.peek()==t){
                pq.poll();
                continue;
            }else if(pq.peek() == t+1){
                count+=1;
                maxCount = Math.max(count,maxCount);
                t+=1;
                pq.poll();
            }else{
                count = 1;
                t = pq.poll();
            }
        }
        return maxCount;
    }
}
