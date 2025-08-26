package com.luuviet;

import java.util.Stack;

import static com.luuviet.StringReversal.reverse_Generic;

public class Main {

    public static void main(String[] args) {
//        playWithIntegerStack();
//        playWithStringStack();
//        playWithStringStack_02();
        playWithStringStack_Generic();
    }

    public static void playWithIntegerStack() {
        ArrayStack<Integer> integerStack = new ArrayStack<>();
        integerStack.push(15);
        integerStack.push(10);
        integerStack.push(5);
        // 15 10 5

        // 15 10
        int x = integerStack.pop();
        System.out.println("x = " + x);     // 5

        // 15 10
        int y = integerStack.peek();
        System.out.println("y = " + y);     // 10

        // 15
        int z = integerStack.pop();
        System.out.println("z = " + z);     // 10

        System.out.println("Size = " + integerStack.size());
    }

    public static void playWithStringStack() {
        String inputString = "LE NHAT TUNG";
        String reversedString = StringReversal.reverse(inputString);
        System.out.println("Original : " + inputString);
        System.out.println("Reversed : " + reversedString);
    }

    public static void playWithStringStack_02() {
        String inputString = "LUU VIET XUAN ANH";
        String reversedString = StringReversal.reverse_02(inputString);
        System.out.println("Original : " + inputString);
        System.out.println("Reversed : " + reversedString);
    }

    public static void playWithStringStack_Generic() {
        // Dùng Stack của Java
        System.out.println(reverse_Generic("Lưu Việt Xuân Ánh", new Stack<>()));

        // Dùng ArrayStack do bạn viết
        System.out.println(reverse_Generic("Luu Viet Xuan Anh", new ArrayStack<>()));

    }
}