package algorithms.leetcode.arrays.vaildParetheless;

import java.util.Stack;

public class Solution {

    public static boolean isValid(String s) {
        if (s.length() == 0) return true;
        if (s.length()%2 != 0) return false;
        Stack<Character> stack = new Stack();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.empty()) {
                    return false;
                }
                char top = stack.peek();
                if (c == ')' && top == '(' ||
                        c == '}' && top == '{' ||
                        c == ']' && top == '[') {
                    stack.pop();
                }
            }
        }
        if (stack.empty()) {
            return true;
        }
        return false;
    }

    public static void main( String args[] ) {
//        String input_str1 = "{{}}()[()]";
//        String input_str2 = "(][)";
//        String input_str3 = ")";
        String input_str4 = "(()])}[}[}[]][}}[}{})][[(]({])])}}(])){)((){";
//        System.out.println(isValid(input_str1));
//        System.out.println(isValid(input_str2));
//        System.out.println(isValid(input_str3));
        System.out.println(isValid(input_str4));
        System.out.println(input_str4.length());
    }
}
