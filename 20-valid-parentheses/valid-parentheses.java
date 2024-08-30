class Solution {
    public boolean isValid(String s) {
        // open close 
        Stack<Character> brackets = new Stack<>(); 
        Map<Character, Character> mpp = new HashMap<>(3); 
        mpp.put(')' , '(');
        mpp.put(']' , '[');
        mpp.put('}' , '{');

        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(mpp.containsKey(c)){
                if(!brackets.isEmpty() && mpp.get(c).equals(brackets.peek())){
                    brackets.pop(); 
                    
                }
                else{
                    return false;
                }
            }else{
                brackets.push(c); 
            }


        }
        return brackets.isEmpty(); 


        
        
            }
}