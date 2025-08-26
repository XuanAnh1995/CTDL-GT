package com.luuviet.fullstack.linkedlist;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DefaultDoublyLinkedList();

        doublyLinkedList.add("Ahihi");
        doublyLinkedList.add("Ahuhu");
        System.out.println(doublyLinkedList.toString());

        doublyLinkedList.addFirst("first");
        doublyLinkedList.addLast("last");
        System.out.println(doublyLinkedList.toString());

        System.out.println(doublyLinkedList.contains("first"));
        System.out.println(doublyLinkedList.indexOf("last"));

        doublyLinkedList.removeAt(2);
        System.out.println(doublyLinkedList.toString());
    }
}
