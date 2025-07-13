package com.luuviet;

import java.util.Random;
import java.util.Scanner;

public class DocumentWithArray {
    // Khai báo mảng số nguyên
    float a[];

    // Số lượng phần tử
    int n;

    public DocumentWithArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vao số lượng phần tử của mảng: ");
        n = sc.nextInt();
        a = taoMangSoThuc(n);
        printArrayA();
    }

    // Viết phương thức in ra mảng
    public void printArrayA() {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    // Viết phương thức trả về mảng số thực n phần tử
    public float[] taoMangSoThuc(int n) {
        Random r = new Random();

        float[] temp = new float[n];
        for (int i = 0; i < n; i++) {
            temp[i] = r.nextFloat();
        }

        return temp;
    }

    // Thêm 1 phần tử x vào cuối mảng
    public void addX(float x) {
        // Tăng n lên
        n = n + 1;

        // Tạo mảng temp
        float[] temp = new float[n];

        // copy dữ liệu mảng cũ sang mảng mới
        for (int i = 0; i < a.length; i++) {
            temp[i] = a[i];
        }

        // Thêm x vào cuối mảng
        temp[n - 1] = x;

        // Gán lại cho mảng
        a = temp;
    }

    public float printSum2FirstElement() {
        float sum = 0;
//        if (a.length > 1) {
//            sum += a[0];
//        }
//
//        if (a.length >= 2) {
//            sum += a[1];
//        }

        for (int i = 0;i < 2 && i < a.length; i++) {
            sum += a[i];
        }

        return sum;
    }

    // Tìm giá trị nhỏ nhất trong mảng
    public float printMinElement() {
        float min = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }

        return min;
    }

    // In ra giá trị ngẫu nhiên
    public float printRandomElement() {
        Random r = new Random();

        int randomIndex = r.nextInt(a.length);

        return a[randomIndex];
    }

    public static void main(String[] args) {
        DocumentWithArray documentWithArray = new DocumentWithArray();

        documentWithArray.addX(1);
        System.out.println();
        documentWithArray.printArrayA();
        System.out.println();

        System.out.print("Tổng của 2 số đầu tiên là: ");
        System.out.println(documentWithArray.printSum2FirstElement());

        System.out.print("Gía trị nhỏ nhất của mảng là: ");
        System.out.println(documentWithArray.printMinElement());

        System.out.print("Gía trị ngẫu nhiên trong mảng: ");
        System.out.println(documentWithArray.printRandomElement());

        // Array Init
        float[] array = {3.5f, 5.5f, 4.52f, 5.6f};
    }


}