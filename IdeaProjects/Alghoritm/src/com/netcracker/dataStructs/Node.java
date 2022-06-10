package com.netcracker.dataStructs;

class Node<T> {
    private T value;
    private Node<T> next;

    public Node(T value, Node<T> pNext) {
        this.value = value;
        this.next = pNext;
    }

    public Node(Node<T> node) {
        this.value = node.value;
        this.next = node.next;
    }

    public Node(T value) {
        this.value = value;
    }


    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
