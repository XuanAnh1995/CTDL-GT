package com.luuviet;


public class LinkStack<T> implements StackADT<T> {

    private int count;

    private LinkedNode<T> top;

    public LinkStack() {
        count = 0;
        top = null;
    }


    @Override
    public void push(T element) {
//        // Bước 1: Tạo ra 1 cái Node mới
//        LinkedNode<T> temp = new LinkedNode<>(element, null);
//
//        // Bước 2: gắn next element cho temp
//        temp.setNext(top);
        LinkedNode<T> temp = new LinkedNode<T>(element, top);
        top = temp;
        count++;
    }

    @Override
    public T pop() {
        return null;
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return this.count == 0 ;
    }

    @Override
    public int size() {
        return this.count;
    }
}
