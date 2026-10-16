class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0, j=0;
        HashSet<Character> set = new HashSet<>();
        int len = 0;
        while(j<s.length()){
            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(s.charAt(j));
            len = Math.max(len, set.size());
            j++;
        }

        return len;
    }
}
