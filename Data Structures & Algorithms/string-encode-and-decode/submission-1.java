class Solution {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for(String s: strs){
            res.append(s.length() + "#" + s);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        
        List<String> list = new ArrayList<>();

        int i=0;
        while(i<str.length()){
            int slash = str.indexOf('#', i);
            int len = Integer.parseInt(str.substring(i, slash));
            String k = str.substring(slash + 1, slash + 1 + len);
            list.add(k);
            i = slash + 1 + len;
        }
        return list;
    }
}
