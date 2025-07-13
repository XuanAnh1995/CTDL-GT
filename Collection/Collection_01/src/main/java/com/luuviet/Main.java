package com.luuviet;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("John", "Ba Lan");
        Person p2 = new Person("Nguyen Van A", "Ha Lan");
        Person p3 = new Person("Tran Duc B", "USA");
        Person p4 = new Person("Ngo Thu Huyen", "USA");
        Person p5 = new Person("David", "Ba Lan");

        p1.setNext(p2);
        p2.setNext(p3);
        p3.setNext(p4);
        p4.setNext(p5);

        Person cur = p1;
        while (true){
            System.out.println(cur);
            cur = cur.getNext();
            if (cur == null)
                break;
        }
    }

}