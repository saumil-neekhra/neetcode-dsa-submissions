class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder k = new StringBuilder();

        for(char ch : s.toCharArray()){
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
                k.append(Character.toLowerCase(ch)+"");
            }
            if(ch>='0' && ch<='9'){
                k.append(ch+"");
            }
        }
        String p = k.toString();
        int i = 0;
        int j = p.length()-1;
        while(i<j){
            if(p.charAt(i)!=p.charAt(j)){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
}
