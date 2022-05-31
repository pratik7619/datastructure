package ztm.linkedlist;

public class ReverseLinkedList {
    //?Pratik Sherdiwala (Codelytics)

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    //a b c d
    //b a c d

    Node previousNode() {
        Node currentNode = head;
        Node previousNode = null;

        /*
        * currentNode | a
        * previousNode | a
        * tempNode | b
        * */

        while (true) {
            Node tempNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;

            if(tempNode == null) {
                break;
            }
            currentNode = tempNode;
            System.out.println(currentNode.data);
        }
        return currentNode;
    }

    /*
    * a - b
    *
    * */

    void print(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {

        ReverseLinkedList list = new ReverseLinkedList();
        list.head = new Node(70);
        list.head.next = new Node(80);
        list.head.next.next = new Node(90);
        list.head.next.next.next = new Node(100);

        list.print(list.head);
        list.head = list.previousNode();
        System.out.println();
        list.print(list.head);
    }
}
