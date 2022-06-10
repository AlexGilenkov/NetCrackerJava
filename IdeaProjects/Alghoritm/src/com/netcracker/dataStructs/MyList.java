package com.netcracker.dataStructs;

public class MyList<T> {
    private Node<T> first;
    private Node<T> last;
    private int size;

    public MyList() {
    }

    public void add(Node<T> node){
        if(size == 0){
            first = new Node<T>(node);
            last = new Node<T>(node);
            size++;
            return;
        }
        if(size==1){
            last = new Node<T>(node);
            first.setNext(last);
            size++;
            return;
        }
        Node<T> temp = new Node<T>(node);
        last.setNext(temp);
        last = temp;
        size++;
    }

    public void add(Node<T> elem, int idx){
        if(idx > size){
            //TODO: Throwable exeption
            return;
        }
        if(idx == 0) {
            if (size == 0) {
                add(elem);
                return;
            } else {
                Node<T> temp = new Node<T>(elem.getValue(), first.getNext());
                size++;
            }
            return;
        }
        if(idx == size){
            add(elem);
            return;
        }
        Node<T> iter = first;
        for(int i=0;i<idx;i++){
            iter = iter.getNext();
        }
        Node<T> temp = new Node<T>(elem);
        temp.setNext(iter.getNext());
        iter.setNext(temp);
        size++;
    }


    public int getSize() {
        return size;
    }

}
