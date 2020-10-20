package ru;
import java.util.*;

class MyArrayQueue<E> extends MyAbstractQueue<E> {
    public MyArrayQueue() {
        this.queue = new ArrayList<>();
    }

    @Override
    public E poll() {
        if (queue == null)
            return null;
        E element = queue.get(0);
        queue.remove(0);
        return element;
    }

    @Override
    public E peek() {
        if (queue != null)
            return queue.get(0);
        return null;
    }

    @Override
    public boolean add(E element) {
        return queue.add(element);
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}