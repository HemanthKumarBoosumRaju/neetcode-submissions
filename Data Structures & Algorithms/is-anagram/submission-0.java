class Solution {
    public boolean isAnagram(String s, String t) {
        char [] sarr= new char[s.length()];
        char [] tarr =new char[t.length()];
        if(s.length()!=t.length()) return false;
        else{
            for(int i=0;i<s.length();i++){
                sarr[i]=s.charAt(i);
                tarr[i]=t.charAt(i);
            }
            Arrays.sort(sarr);
            Arrays.sort(tarr);
            for(int i=0;i<s.length();i++){
                if(sarr[i]!=tarr[i]) return false;
            }
            return true;
            
            
        }
    }
}
