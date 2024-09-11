class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mppS = new HashMap<>(); 
         HashMap<Character, Character> mppT = new HashMap<>(); 
        if(s.length() != t.length()){
            return false; 
        }
        for(int i = 0; i<s.length(); i++){
            if(mppS.containsKey(s.charAt(i))){
                if(mppS.get(s.charAt(i)) != t.charAt(i)){
                    return false;        
            }
            }

            if( mppT.containsKey(t.charAt(i))){
                if( mppT.get(t.charAt(i)) != s.charAt(i)){
                    return false;
                }
            }

            
            
            mppS.put(s.charAt(i), t.charAt(i));
            mppT.put(t.charAt(i), s.charAt(i));
            
            
           
           
            
        }

        return true; 


    }
}