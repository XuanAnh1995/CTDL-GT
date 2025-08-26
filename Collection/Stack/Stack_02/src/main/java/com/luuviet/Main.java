package com.luuviet;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        reversedBinary(25);
    }

    public static void reversedBinary(int n){
        Stack<Integer> stack = new Stack<Integer>();

        // Chuyển đổi số thập phân sang  nhi phân
        while (n > 0) {
            int remainder = n % 2;
            stack.push(remainder);
            n = n / 2;
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop() + " ");
        }

        System.out.println(result.toString());
    }
}