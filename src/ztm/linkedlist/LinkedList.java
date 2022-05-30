package ztm.linkedlist;

import java.util.ArrayList;

public class LinkedList<T> {
    //?Pratik Sherdiwala
    Node<T> head;
    Node<T> tail;
    private int length = 0;

    static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    LinkedList(Node<T> node) {
        this.head = node;
        this.tail = this.head;
        this.length = 1;
    }

    void append(Node<T> newNode) {
        this.tail.next = newNode;
        this.tail = newNode;
        this.length++;
    }

    void prepend(Node<T> newNode) {
        newNode.next = this.head;
        this.head = newNode;
        this.length++;
    }

    Node<T> createNewNode(T value) {
        return new Node<>(value);
    }

    ArrayList<T> print() {
        ArrayList<T> list = new ArrayList<>();
        Node<T> currentNode = this.head;
        while (currentNode != null) {
            list.add(currentNode.data);
            currentNode = currentNode.next;
        }
        return list;
    }

    int size() {
        return length;
    }

    void insert(int index, Node<T> newNode) {

        newNode.next = null;
        if (this.head == null) {
            this.head = newNode;
            length++;
            return;
        }

        if (index == 0) {
            prepend(newNode);
            length++;
            return;
        }

        Node<T> currentNode = this.head;
        Node<T> previous = null;

        int i = 0;
        while (i < index) {
            previous = currentNode;
            currentNode = currentNode.next;

            if (currentNode == null) break;

            i++;
        }
        newNode.next = currentNode;
        if (previous != null) {
            previous.next = newNode;
        }
        length++;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(new Node<>(40));
        list.append(list.createNewNode(70));
        list.append(list.createNewNode(90));
        list.append(list.createNewNode(80));
        list.append(list.createNewNode(10));
        list.prepend(list.createNewNode(100));
        list.insert(1, list.createNewNode(23));
        list.insert(3, list.createNewNode(33));
        list.insert(5000, list.createNewNode(500));
        list.insert(7, list.createNewNode(27));

        System.out.println(list.print());
        System.out.println(list.size());
    }
}
