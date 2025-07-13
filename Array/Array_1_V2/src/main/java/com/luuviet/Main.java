package com.luuviet;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int inputN(){
        System.out.print("Nhập số lượng phần tử của mảng: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("N = " + n);
        return n;
    }

    // Viết phương thức trả về mảng số thực n phần tử
    public static float[] getA(int n) {
        Random r = new Random();
        float[] temp = new float[n];

        for (int i = 0; i < n; i++) {
            temp[i] = r.nextFloat();
        }

        return temp;
    }

    // Nhập thủ công từng phần tử
    public static float[] getB(int n) {
        Scanner sc = new Scanner(System.in);
        float[] temp = new float[n];

        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "]: ");
            temp[i] = sc.nextFloat();
        }

        return temp;
    }

    // Thêm 1 phần tử vào cuối mảng
    public static float[] addElement(float[] A, float x){
        float[] temp = new float[A.length + 1];

        for (int i = 0; i < A.length; i++) {
            temp[i] = A[i];
        }

        temp[temp.length - 1] = x;

        return temp;
    }

    public static void printArray(float[] A){
        for (int i = 0; i < A.length; i++) {
            System.out.println("A" + "[" + i + "]" + " = " + A[i]);
        }
    }

    public static void main(String[] args) {
        int n = inputN();

        float[] A = getB(n);

        // In mảng
        System.out.println("Mảng A ban đầu:");
        printArray(A);

        A = addElement(A, 10);
        System.out.println("Mảng A sau khi thêm phần tử 10: ");
        printArray(A);

    }
}