package com.luuviet;

import java.util.Stack;

public class StringReversal {

    public static String reverse(String input) {
        ArrayStack<Character> stack = new ArrayStack<>();

        // Đưa từng kí tự vào stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Lấy từng kí tự stack  và ghép lại để tạo thành chuỗi đảo ngược
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

//        // Lấy từng kí tự stack  và ghép lại để tạo thành chuỗi đảo ngược
//        String reversed1 = "";
//        while (!stack.isEmpty()) {
//            reversed1 += stack.pop();
//        }
//        return reversed1;

        return reversed.toString();
    }

    public static String reverse_02(String input) {
        Stack<Character> stack = new Stack<>();

        // Đưa từng kí tự vào stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Lấy từng kí tự stack  và ghép lại để tạo thành chuỗi đảo ngược
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    // Phiên bản gợi ý cải tiến + áp dụng cho cả ArrayStack<Character> (stack mình tự định nghĩa) và  java.util.Stack<Character> (stack có sẵn trong Java).
    public static String reverse_Generic(String input, StackADT<Character> stack) {

        for(char c : input.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    public static String reverse_Generic(String input, Stack  stack) {

        for(char c : input.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }


}
