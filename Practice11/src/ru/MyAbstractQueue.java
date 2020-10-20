package ru;
import java.util.*;

abstract class MyAbstractQueue<E> implements MyQueue<E> {
    protected List<E> queue;

    @Override
    public E element() {
        E element = peek();
        if (element != null)
            return element;
        throw new NoSuchElementException();
    }

    public boolean add(E element) {
        if (add(element))
            return true;
        throw new IllegalStateException("Queue full");
    }

    public E remove() {
        E element = poll();
        if (element != null)
            return element;
        throw new NoSuchElementException();
    }

    public boolean addAll(Collection<? extends E> collection) {
        if (collection == null)
            throw new NullPointerException();
        boolean modified = false;
        for (E element : collection) {
            if (add(element))
                modified = true;
        }
        return modified;
    }

    public abstract int size();

    @Override
    public String toString() {
        return queue.toString();
    }
}