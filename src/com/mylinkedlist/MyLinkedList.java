package com.mylinkedlist;

import java.util.Iterator;
import java.util.NoSuchElementException;


public class MyLinkedList <E> implements ILinkedList<E> {

    private int size = 0;
    private Node<E> first;
    private Node<E> last;

    public int getSize() {
        return size;
    }

    //Inserts

    public  void insertFirst(E element) {
        Node<E> firstNode = first;
        Node<E> newNode = new Node<>(null, element, firstNode);
        if (firstNode == null)
            last = newNode;
        else
            firstNode.prev = newNode;
        size++;
    }

    public  void insertLast(E element) {
        Node<E> lastNode = last;
        Node<E> newNode = new Node<>(lastNode, element, null);
        last = newNode;
        if (lastNode == null)
            first = newNode;
        else {
            lastNode.next = newNode;
        }
        size++;
    }

    public void insertBefore(E element, Node<E> such) {
        Node<E> preSuch = such.prev;
        Node<E> newNode = new Node<>(preSuch, element, such);
        such.prev = newNode;
        if (preSuch == null)
            first = newNode;
        else
            preSuch.next = newNode;
        size++;
    }

    //unInserts

    private E unInsert(Node<E> lastNode) {
        E element = lastNode.item;
        Node<E> next = lastNode.next;
        Node<E> prev = lastNode.prev;

        if (prev == null)
            first = next;
        else {
            prev.next = next;
            lastNode.prev = null;
        }

        if (next == null)
            last = prev;
        else {
            next.prev = prev;
            lastNode.next = null;
        }
        lastNode.item = null;
        size--;
        return element;
    }

    private E unInsertFirst(Node<E> firstNode) {
        E element = firstNode.item;
        Node<E> next = firstNode.next;
        firstNode.item = null;
        firstNode.next = null;
        first = next;
        if (next == null)
            last = null;
        else
            next.prev = null;
        size--;
        return element;
    }

    private E unInsertLast (Node<E> lastNode) {
        E element = lastNode.item;
        Node<E> prev = lastNode.prev;
        lastNode.item = null;
        lastNode.prev = null;
        last = prev;
        if (prev == null)
            first = null;
        else
            prev.next = null;
        size--;
        return element;
    }

    //adds

    @Override
    public void add(E element) {
        insertLast(element);
    }

    @Override
    public void add(int index, E element) {
        checkIndex(index);
        if(index == size){
            insertLast(element);
        }
        else
            insertBefore(element, node(index));
    }

    //removes

    @Override
    public E remove(int index) {
        checkIndex(index);
        return unInsert(node(index));
    }

    public E removeFirst(int index) {
        checkIndex(index);
        return unInsertFirst(node(index));
    }

    public E removeLast(int index) {
        checkIndex(index);
        return unInsertLast(node(index));
    }

    //assistive operations

    @Override
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    @Override
    public void clear() {
        for (Node i = first; i != null;) {
            Node next = i.next;
            i.item = null;
            i.prev = null;
            i.next = null;
            i = next;
        }
        first = last = null;
        size = 0;

    }

    @Override
    public int indexOf(E element) {
        int index = 0;
        if (element == null) {
            for (Node<E> firstNode = first;firstNode != null;firstNode = firstNode.next){
                if (firstNode == null) {
                    return index;
                }
            index++;
            }
        }
        else {
            for (Node<E> firstNode = first; firstNode != null; firstNode = firstNode.next) {
                if (element.equals(firstNode.item)) {
                    return index;
                }
                index++;
            }
        }
        return -1;
    }

    //getters

    @Override
    public E get(int index) {
        checkIndex(index);
        return node(index).item;
    }

    public E getFirst(int index) {
        Node<E> firstNode = first;
        if (firstNode == null)
            throw new NoSuchElementException();
        return firstNode.item;
    }

    public E getLast(int index) {
        Node<E> lastNode = last;
        if (lastNode == null)
            throw new NoSuchElementException();
        return lastNode.item;
    }

    //setters

    @Override
    public E set(int index, E element) {
        checkIndex(index);
        Node<E> nodeIndex = node(index);
        //E OldValue = nodeIndex.item;
        nodeIndex.item = element;
        return element;
    }

    public E setFirst(E element) {
        Node<E> firstNode = first;
        if (firstNode == null)
            throw new NoSuchElementException();
        firstNode.item = element;
        return element;
    }

    public E setLast(E element) {
        Node<E> lastNode = last;
        if (lastNode == null)
            throw new NoSuchElementException();
        lastNode.item = element;
        return element;
    }



    public  E[] toArray() {
        int i = 0;
        E[] result;
        result = (E[]) java.lang.reflect.Array.newInstance(first.item.getClass(), size);
        for (Node<E> x = first; x != null; x = x.next)
            result[i++] = x.item;

        if (result.length > size)
            result[size] = null;

        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    public  E[] toArray(E[] array) {
        if (array.length < size)
            array = (E[])java.lang.reflect.Array.newInstance(
                    array.getClass().getComponentType(), size);
        int i = 0;
        Object[] result = array;
        for (Node<E> x = first; x != null; x = x.next)
            result[i++] = x.item;

        if (array.length > size)
            array[size] = null;

        return array;
    }



    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public E next() {
                return get(index++);
            }
        };
    }



    //Helpers: nested classes and methods

    public static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node (Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this. prev = prev;
            this.next = next;
        }
        public void displayLink(){
            System.out.println(item);
        }
    }

    public void displayList() {
        System.out.println("List (first-->last): ");
        Node current = first;
        while(current !=null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }

    private boolean checkIndex(int index) {
        if(!(index >= 0 && index < size)) {
            throw new ArrayIndexOutOfBoundsException();
        }
        else
        return true;
    }

    Node<E> node(int index) {

        if(index < (size >> 1)) {
            Node<E> indexFirstHalf = first;
            for (int i = 0; i < index; i++) {
                indexFirstHalf = indexFirstHalf.next;
            }
            return indexFirstHalf;
        }
        else {
            Node<E> indexLastHalf = last;
            for (int i = size - 1; i > index ; i--) {
                indexLastHalf = indexLastHalf.prev;
            }
            return indexLastHalf;
        }
    }

    @Override
    public String toString() {
        String type = "";
        for (Node<E> firstNode = first; firstNode != last.next; firstNode = firstNode.next) {
            type += firstNode.item + "\n";
        }
        return "MyLinkedList{" + "size=" + size + "}\n" + "Content:" + type;
    }
}
