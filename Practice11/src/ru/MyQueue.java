package ru;


interface MyQueue<E> {
    E element();
    E poll();
    E peek();
    boolean add(E element);
}
