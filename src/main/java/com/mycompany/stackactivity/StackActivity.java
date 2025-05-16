/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.stackactivity;

import java.util.*;

public class StackActivity {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stack = new Stack<>();

        System.out.println("Enter sentence to reverse: ");
        String sentence = scanner.nextLine();
        String[] arr = sentence.split(" ");

        for (String word : arr) {
            stack.push(word);
        }
        
        System.out.println("Reversed Sentence: ");

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

    }

}
