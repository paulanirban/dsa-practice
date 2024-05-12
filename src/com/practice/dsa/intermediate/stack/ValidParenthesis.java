package com.practice.dsa.intermediate.stack;

import java.util.Stack;

public class ValidParenthesis {
   public static void main(String[] args) {
      String str = "{([)]}"; //(){}[]<>";

      Stack<Character> characterStackStack = new Stack<>();

      for(char ch : str.toCharArray()) {
         if(ch == '(' || ch == '{' || ch == '[' || ch == '<') {
            characterStackStack.push(ch);
         } else {
            if(characterStackStack.isEmpty()) {
               System.out.println("Invalid");
               break;
            }

            char top = characterStackStack.pop();

            if((top == '(' && ch != ')') || (top == '{' && ch != '}') || (top == '[' && ch != ']') || (top == '<' && ch != '>')) {
               System.out.println("Invalid");
               break;
            }
         }
      }

      if(characterStackStack.isEmpty()) {
         System.out.println("Valid");
      }
   }
}
