package com.luuviet;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.addFirst("Luu Viet Xuan Anh");
        list.addFirst("CTDL va Giai thuat Java");
        list.addFirst("XuanAnh1995");

        // list.traverse();

        list.addLast("Nguyen Van A");
//        list.traverse();

        list.insertAfter("XuanAnh1995", "PH47179");
        list.traverse();
        System.out.println("-----------------------------");

        System.out.println(list.remove("Nguyen Van A"));
        System.out.println(list.remove("Nguyen Van A"));
        System.out.println("-----------------------------");
        
        list.traverse();
        System.out.println("-----------------------------");

        System.out.println("Check empty: " + list.isEmpty());
        System.out.println("Size: " + list.size());
    }

}