class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch: s.toCharArray()){
            if(stack.empty() || stack.peek() != ch){
              stack.push(ch);
            }else{
              stack.pop();
            }
        }
      
       String ans = "";
       while(!stack.empty()){
          ans += stack.pop();
       } 
       
       String rev = new StringBuilder(ans).reverse().toString();
       return rev;

    }
}