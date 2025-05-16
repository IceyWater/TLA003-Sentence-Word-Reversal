
package com.mycompany.stackactivity;

import java.util.*;

public class StackActivity {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter sentence to reverse: ");
        String sentence = scanner.nextLine();

        
        Stack<String> stack = new Stack<>();
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (c != ' ') {
                word.append(c);
            } else {
                if (word.length() > 0) {
                    stack.push(word.toString());
                    word.setLength(0);
                }
            }
        }
        
        if (word.length() > 0) {
            stack.push(word.toString());
        }

        System.out.println("Reversed Sentence: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

    }

}
