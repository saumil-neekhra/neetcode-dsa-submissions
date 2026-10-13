class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> map1 = new HashMap();
        Map<Character,Integer> map2 = new HashMap();
        for(char c : s.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        for(char c : t.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)-1);
        }
        for(Map.Entry<Character,Integer>k:map1.entrySet()){
            char key = k.getKey();
            int value = k.getValue();
            if(value!=0){
                return false;
            }
        }
        return true;
    }
}

