package com.luuviet;

public class LinkedList<T> {

    private Node head;

    public LinkedList() {
    }

    public LinkedList(Node head) {
        this.head = head;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    // Duyệt từng phần tử
    public void traverse() {
        Node<T> tmp = head;
        while (tmp != null) {
            System.out.print(tmp.getData() + " \n");
            tmp = tmp.getNext();
        }
    }

    // Thêm 1 node vào đầu danh sách
    public void addFirst(T item) {
        // Bước 1:
        // Node<T> newNode = new Node<>(item, this.head);
        Node<T> newNode = new Node<>();
        newNode.setData(item);
        newNode.setNext(this.head);

        // Bước 2:
        this.head = newNode;
    }

    // Thêm 1 node vào cuối danh sách
    public void addLast(T item) {

        if (this.head == null) {
            addFirst(item);
        } else {
            // Bước 1:
            Node<T> newNode = new Node<>(item, null);

            // Bước 2:
            Node<T> tmp = this.head;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            tmp.setNext(newNode);
        }
    }

    // Chèn 1 node sau 1 node
    public void insertAfter(T key, T toInsert) {

        // Bước 2: Tìm vị trí của key
        Node<T> tmp = this.head;
        while (tmp != null && !tmp.getData().equals(key)) {
            tmp = tmp.getNext();
        }

        // Tìm ra được node chứa key, hoặc là đi đến cuối linked list

        // Thêm vào khi tmp<> null
        if (tmp != null) {
//            // Bước 1
//            Node<T> newNode = new Node<>();
//            newNode.setData(toInsert);
//
//            // 2
//            newNode.setNext(tmp.getNext());

            // 1 + 2
            Node<T> newNode = new Node<>(toInsert, tmp.getNext());

            // 3
            tmp.setNext(newNode);
        }
    }

    // Xóa 1 node
    public boolean remove(T key) {
        if (this.head == null) {
            return false;
        }

        // Xóa nếu key ở vị trí đầu tiên
        if (this.head.getData().equals(key)) {
            this.head = this.head.getNext();
            return true;
        }

        // Tạo biến tạm
        Node<T> prev = null;
        Node<T> cur = head;

        while (cur != null && !cur.getData().equals(key)) {
            prev = cur;
            cur = cur.getNext();
        }

        if (cur == null) {
            return false;
        }

        // Xóa node
        prev.setNext(cur.getNext());
        return true;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public int size() {
        int count = 0;
        Node<T> tmp = this.head;
        while (tmp != null) {
            count++;
            tmp = tmp.getNext();
        }
        return count;
    }

    // Tìm kiếm node trong LinkedList
    public boolean findNode(T key) {
        Node<T> tmp = this.head;
        while (tmp != null) {
            if (tmp.getData().equals(key)) {
                return true;
            }
            tmp = tmp.getNext();
        }
        return false;
    }

    public boolean updateNode(T key, T toUpdate) {
        Node<T> tmp = this.head;
        while (tmp != null) {
            if (tmp.getData().equals(key)) {
                tmp.setData(toUpdate);
                return true;
            }
            tmp = tmp.getNext();
        }
        return false;
    }
}
