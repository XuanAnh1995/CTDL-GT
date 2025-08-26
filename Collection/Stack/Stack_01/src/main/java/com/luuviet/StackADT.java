package com.luuviet;

public interface StackADT<T>{

    // Thêm 1 element vào đỉnh của stack
    public void push(T element);

    // Trả về và loại bỏ element ở đỉnh stack
    public T pop();

    // Trả về nhưng ko loại bỏ element ở đỉnh stack
    public T peek();

    // Kiểm tra stack có rỗng
    public boolean isEmpty();

    // Số lượng element của stack
    public int size();

    // In ra stack, lấy ra chuỗi các phần tử của stack
    public String toString();

}
