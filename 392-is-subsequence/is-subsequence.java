class Solution {
    public boolean isSubsequence(String s, String t) {
        // put the s string in hashmap
        // match frequency when iterating t 
        if(s.isEmpty()){
            return true;
        }


        int spoint = 0; 
       
        for(int i = 0; i<t.length(); i++){
            if(t.charAt(i) == s.charAt(spoint)){
                   spoint++; 
                   if(spoint == s.length()){
                    return true;
                   }
            }

        }
        return false;
    }
}