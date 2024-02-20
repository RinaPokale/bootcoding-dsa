package string;

import java.util.Stack;

//20. Valid Parentheses
public class ValidParenthesis { //TC:- O(n) && SC:- O(n)
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            if(curr == '(' || curr == '[' || curr == '{')
                st.push(curr);
            else {
                if (st.isEmpty())
                    return false;
                else if (!isMatching(st.peek(), curr)) {
                    return false;
                }
                else
                    st.pop(); // pop if closing brackets encounter

            }
        }
        return st.isEmpty();
    }

    public static boolean isMatching(char c1, char c2){
        return c1 == '(' && c2 == ')' || c1 == '[' && c2 == ']' || c1 == '{' && c2 == '}';
    }

    public static void main(String[] args) {
//        String s = "()[]{}";
//        String s = "(]" ;
        String s = "(" ;

        System.out.println(isValid(s));
    }

}
