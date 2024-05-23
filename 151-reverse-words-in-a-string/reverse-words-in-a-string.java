class Solution {
    public String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        StringBuilder word = new StringBuilder();
        
        // Process each character in the string
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                if (word.length() > 0) {
                    stack.push(word.toString());
                    word.setLength(0);  // Reset the StringBuilder for the next word
                }
            } else {
                word.append(c);
            }
        }
        // Push the last word to the stack if there is any
        if (word.length() > 0) {
            stack.push(word.toString());
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
            if (!stack.isEmpty()) {
                result.append(' ');
            }
        }

        return result.toString();
    }
}