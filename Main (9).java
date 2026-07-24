import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinarySearchTree {
    Node root;

    Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        return root;
    }

    void display(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " -> ");

        if (root.left != null) {
            System.out.print("Left : " + root.left.data + " ");
        } else {
            System.out.print("Left : null ");
        }

        if (root.right != null) {
            System.out.print("Right : " + root.right.data);
        } else {
            System.out.print("Right : null");
        }

        System.out.println();

        display(root.left);
        display(root.right);
    }
}

class Main {
    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        bst.root = bst.insert(bst.root, 50);
        bst.root = bst.insert(bst.root, 30);
        bst.root = bst.insert(bst.root, 20);
        bst.root = bst.insert(bst.root, 40);
        bst.root = bst.insert(bst.root, 70);
        bst.root = bst.insert(bst.root, 80);
        bst.root = bst.insert(bst.root, 60);
        bst.root = bst.insert(bst.root, 80); // Duplicate (ignored)

        bst.display(bst.root);
    }
}