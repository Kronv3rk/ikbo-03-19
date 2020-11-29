package ru;

public class CircularLinkedList<E> {
    private Node<E> head;
    private int size;
    private class Node<E>
    {
        private E data;
        private Node next;
        private Node prev;
        public Node(E data, Node next, Node prev)
        {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
    public CircularLinkedList() {
    }
    public boolean add(E data) {
        if (this.head == null) {
            this.head = new Node<>(data, this.head, this.head);
            this.head.next = this.head;
            this.head.prev = this.head;
            size++;
        }
        else {
            Node<E> last = this.head.prev;
            Node<E> newNode = new Node<>(data, this.head, last);
            this.head.prev = newNode;
            last.next = newNode;
            size++;
        }
        return true;
    }

    public boolean remove(Object obj) {
        if (obj != null) {
            if (obj.equals(head.data)) {
                Node<E> next = head.next;
                Node<E> prev = head.prev;
                prev.next = next;
                head.prev = null;
                next.prev = prev;
                head.next = null;
                head = next;
                size--;
                return true;
            }
            else {
                for (Node<E> f = head.next; f != head; f = f.next) {
                    if (obj.equals(f.data)) {
                        Node<E> next = f.next;
                        Node<E> prev = f.prev;
                        prev.next = next;
                        head.prev = null;
                        next.prev = prev;
                        head.next = null;
                        f.data = null;
                        size--;
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public int getSize() {
        return size;
    }
    @SuppressWarnings("unchecked")
    public E[] toArray() {
        Item[] res = new Item[size];
        int i = 0;
        for (Node<E> x = head; i < size; x = x.next) {
            res[i] = (Item)x.data;
            i++;
        }
        return (E[]) res;
    }
}

