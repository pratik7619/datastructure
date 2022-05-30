package ztm.binarytree;

public class BinaryTree<T extends Comparable<T>> {
    //?Pratik Sherdiwala (Codelytics)
    Node<T> root;

    BinaryTree() {
        this.root = null;
    }

    static class Node<T> {
        T data;
        Node<T> left;
        Node<T> right;

        Node(T data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    void insert(Node<T> newNode) {

        if (this.root == null) this.root = newNode;
        else {
            Node<T> currentNode = this.root;
            T item = newNode.data;
            while (true) {
                if (item.compareTo(currentNode.data) < 0) {
                    if (currentNode.left == null) {
                        currentNode.left = newNode;
                        return;
                    }
                    currentNode = currentNode.left;
                } else {
                    if (currentNode.right == null) {
                        currentNode.right = newNode;
                        return;
                    }
                    currentNode = currentNode.right;
                }
            }
        }
    }

    void printTree() {
        if(this.root == null) return;

        Node<T> currentNode = this.root;

        while (true) {
            if(currentNode.data != null) {
                System.out.println(currentNode.data);
                if (currentNode.left != null) {
                    System.out.println("/");
                    System.out.println(currentNode.left.data);
                }
                if (currentNode.right != null) {
                    System.out.println("'\'");
                    System.out.println(currentNode.right.data);
                }
            } else {
                return;
            }
        }
    }

    public static void main(String[] args) {

        BinaryTree<Integer> tree = new BinaryTree<>();
        tree.insert(new Node<>(40));
        tree.insert(new Node<>(60));
        tree.insert(new Node<>(10));
        tree.insert(new Node<>(5));
        tree.insert(new Node<>(90));
        tree.insert(new Node<>(64));

        tree.printTree();
    }
}
