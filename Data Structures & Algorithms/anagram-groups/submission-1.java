class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap();

        for(int i=0;i<strs.length;i++){
            char[] s = strs[i].toCharArray();
            Arrays.sort(s);
            String sortedS = "";
            for(char ch : s){
                sortedS += ch;
            }
            if(map.containsKey(sortedS)){
                map.get(sortedS).add(strs[i]);
            }else{
                map.put(sortedS,new ArrayList<>());
                map.get(sortedS).add(strs[i]);
            }
        }

        return new ArrayList<>(map.values());
    }
}
