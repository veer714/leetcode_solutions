class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            


            if(ch == '(' || ch == '[' || ch == '{' ){
                stack.push(ch);
            }

            if(stack.empty() && ( ch == ']' || ch == '}' || ch == ')')){
                return false;
            } 

            if(ch == ')' && stack.peek() == '('){
                stack.pop();
            }else if(ch == ')' && (stack.peek() == '{' || stack.peek() == '[')){
                return false;
            }

            if(ch == ']' && stack.peek() == '['){
                stack.pop();
            }else if(ch == ']' && (stack.peek() == '{' || stack.peek() == '(')){
                return false;
            }

            if(ch == '}' && stack.peek() == '{'){
                stack.pop();
            }else if(ch == '}' && (stack.peek() == '(' || stack.peek() == '[')){
                return false;
            } 

            
        }
        if(stack.empty()){
            return true;
        }else{
            return false;
        }
    }
}