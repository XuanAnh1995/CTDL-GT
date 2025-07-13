package com.luuviet;

public class Main {

    public static void main(String[] args) {
        Dictionary<String, String> d1 = new Dictionary<String, String>("Hello", "Xin chào");

        d1.showString();
        System.out.println(d1.toString());

        System.out.println("------------------------------------");

        Dictionary<String, String>[] tuDienAnhViet = new Dictionary[10];

        tuDienAnhViet[0] = new Dictionary<>("Hello", "Xin chào");
        tuDienAnhViet[1] = new Dictionary<>("Hi", "Xin chào");
        tuDienAnhViet[2] = new Dictionary<>("Me", "Tôi");
        tuDienAnhViet[3] = new Dictionary<>("Memory", "Bộ nhớ");

        for (int i = 0; i < 4; i++) {
            tuDienAnhViet[i].showString();
        }

        System.out.println("-------------------------------");

        // Ví dụ 2
        Dictionary<Integer, Character>[] bangMaAscii = new Dictionary[256];

        bangMaAscii[0] = new Dictionary<>(32, ' ');
        bangMaAscii[1] = new Dictionary<>(33, '!');

        // Ví dụ 3
        Dictionary<Character, Integer>[] bangMaAsciiAscii_2 = new Dictionary[256];

        bangMaAsciiAscii_2[0] = new Dictionary<>(' ', 32);
        bangMaAsciiAscii_2[1] = new Dictionary<>('!', 33);

//        Dictionary<Student, Transcript >[] bangDiemSinhVien = new Dictionary[300];
    }

}