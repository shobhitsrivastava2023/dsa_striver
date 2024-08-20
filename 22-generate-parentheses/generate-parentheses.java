class Solution {
    private void backtracking(int  n,int openN, int closedN, List<String> res, Stack<Character> stack ){
        // recursive tree  
        if(openN == closedN && openN  == n){ 
            StringBuilder sb = new StringBuilder(); 
            // iterate through each character in stack 
            for(char c:stack){ 
                sb.append(c); 

            }
            res.add(sb.toString()); 
            return ; 
        }
        if(openN  < n ){
            stack.push('('); 
            backtracking(n,openN +1, closedN, res,stack );
            stack.pop(); 

        }
        if(closedN< openN){
            stack.push(')'); 
            backtracking(n,openN, closedN+1,res, stack );
            stack.pop(); 
            
        }
        
    }
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        Stack<Character> stack = new Stack<>();
      
         backtracking(n,0,0,res, stack); 
         return res; 

        


    }
}