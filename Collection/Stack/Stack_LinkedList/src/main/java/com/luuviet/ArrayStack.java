package com.luuviet;

import java.util.EmptyStackException;

public class ArrayStack<T> implements StackADT<T> {

    // Biết số lượng phần tử trong stack và vị trí tiếp theo
    private int top;

    // Mảng chứa các phần tử đưa vào stack
    private T[] stack;

    // Kích thước mặc định của mảng
    private final int DEFAULT_CAPACITY = 100;

    // Tạo 1 stack rỗng với kích thước mặc định
    public ArrayStack() {
        top = 0;
        stack = (T[]) (new Object[DEFAULT_CAPACITY]);
    }

    /// Tạo 1 stack rỗng với kích thước truyền vào
    public ArrayStack(int initialCapacity) {
        top = 0;
        stack = (T[]) (new Object[initialCapacity]);
    }

    private void expandCapacity() {
        // 1 2 3 4
        T[] newStack = (T[]) (new Object[stack.length * 2]);     // Tạo mảng newStack mới với length * 2 mảng cũ
        // _________________________________

        // Cách 1: Dùng For
        // Copy dữ liệu từ mảng stack cũ sang mảng newStack mới
        for (int i = 0; i < stack.length; i++) {
            newStack[i] = stack[i];
        }

        // Cách 2: thay thế for nếu muốn tối ưu
        // System.arraycopy(stack, 0, newStack, 0, stack.length);

        // 1 2 3 4 ________________
        stack = newStack;

    }

    @Override
    public void push(T element) {
        if (top == stack.length) {
            expandCapacity();   // Mở rộng kích thước của mảng stack
        }
        this.stack[top] = element;  // Đưa element vào đỉnh stack
        top++;  // Tăng chỉ số định của stack lên 1
    }

    @Override
    public T pop() {
        if (top == 0) {
            throw new EmptyStackException();
        } else {
            top--;
            T result = stack[top];
            stack[top] = null;
            return result;
        }
    }

    @Override
    public T peek() {
        if (top == 0) {
            throw new EmptyStackException();
        } else {
            return stack[top - 1];
        }
    }

    @Override
    public boolean isEmpty() {
        return this.top == 0;
    }

    @Override
    public int size() {
        return this.top;
    }
}
