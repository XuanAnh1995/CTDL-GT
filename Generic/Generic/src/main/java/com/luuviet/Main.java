package com.luuviet;

import java.util.ArrayList;
import java.util.List;

public class Main {

    // Generic : là 1 tính năng mạnh mẽ của java cho phép chúng ta tạo ra các lớp, phương thức và interfaces mà có thể làm việc với bất kỳ kiểu dữ liệu nào
    // Cú pháp Generic: Định nghĩa bằng cách sử dụng cặp dấu ngoặc lớn <T>, trong đó T là 1 biến kiều dữ liệu

    // Ví dụ:
    // Trong 1 class:
    // public class MyClass<T> {
    //      code here
    // }

    // Không xác định kiểu
    // Sử dụng ký tự ? để chỉ ra 1 kiểu dữ liệu ko xác định trong Generic
    // public void myMethod(List<?> myList){
    //      // Code here
    // }

    // Sử dụng Generic trong Collection
    //    List<String> myList = new ArrayList<String>();
    //    myList.add("Hello");
    //    String str = myList.get(0);     // Ko cần ép kiểu (type casting)

    // Tính kế thừa và Generic
    public class MyClass<T> {
        // Code here
    }
    public class MySubClass<T> extends MyClass<T> {
        // Code here
    }

    // giới hạn Generic
    public static  <T extends Number>   void myMethod(T argument) {
        // Code here
    }


//    public static <T> double tinhTBC(T[] mang){
//        double tong = 0;
//
//        for(int i = 0; i < mang.length; i++){
//            double value = Double.valueOf(mang[i].toString());
//            tong += value;
//        }
//
//        return tong/(mang.length);
//    }

    public static <T extends Number> double tinhTBC(T[] mang){
        double tong = 0;

        for(int i = 0; i < mang.length; i++){
            double value = Double.valueOf(mang[i].toString());
            tong += value;
        }

        return tong/(mang.length);
    }

    public static void main(String[] args) {
        Integer[] mangInt = {5, 10, 15};
        System.out.println("TBC-int = " + tinhTBC(mangInt));

        Float[] mangFloat = {1.5f, 4.5f};
        System.out.println("TBC-float = " + tinhTBC(mangFloat));

        Double[] mangDouble = {1.5, 4.5, 6.0};
        System.out.println("TBC-double = " + tinhTBC(mangDouble));

//        String[] s = {"1.5", "4.5", "6.0"};
//        System.out.println("TBC-string = " + tinhTBC(s));

    }
}