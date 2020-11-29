package ru;
import java.util.*;

class MyLinkedQueue<E> extends MyAbstractQueue<E> {
    public MyLinkedQueue() {
        this.queue = new LinkedList<>();
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
}
