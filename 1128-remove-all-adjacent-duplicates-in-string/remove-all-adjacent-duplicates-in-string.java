class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> charStack = new Stack<>(); 
        String res = ""; 
       

        int n = s.length(); 
        for(int i = 0; i < n; i++){ 
            if( !charStack.isEmpty() && s.charAt(i)  == charStack.peek()){ 
                charStack.pop(); 
                continue; 
            }
             
            charStack.push(s.charAt(i)); 
        }

        StringBuilder sb = new StringBuilder(); 
        for(char a : charStack){
            sb.append(a);
        }
        return sb.toString(); 
    }
}