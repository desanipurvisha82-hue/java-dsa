import java.util.*;

public class Binary_Tree_Concepts {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    static void postorder(Node root) {
        if (root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    static void levelOrder(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            System.out.print(current.data + " ");

            if (current.left != null) {
                queue.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }

    static void preorderIterative(Node root) {
        if (root == null) {
            return;
        }

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node current = stack.pop();

            System.out.print(current.data + " ");

            if (current.right != null) {
                stack.push(current.right);
            }

            if (current.left != null) {
                stack.push(current.left);
            }
        }
    }

    static Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (value < root.data) {
            root.left = insert(root.left, value);
        } else if (value > root.data) {
            root.right = insert(root.right, value);
        }

        return root;
    }

    static boolean search(Node root, int value) {
        if (root == null) {
            return false;
        }

        if (root.data == value) {
            return true;
        }

        if (value < root.data) {
            return search(root.left, value);
        }

        return search(root.right, value);
    }

    public static void main(String[] args) {

        System.out.println("BINARY TREE");
        System.out.println();

        Node tree = new Node(1);

        tree.left = new Node(2);
        tree.right = new Node(3);

        tree.left.left = new Node(4);
        tree.left.right = new Node(5);

        System.out.println("Preorder:");
        preorder(tree);

        System.out.println("\nInorder:");
        inorder(tree);

        System.out.println("\nPostorder:");
        postorder(tree);

        System.out.println("\nLevel Order:");
        levelOrder(tree);

        System.out.println("\nIterative DFS - Preorder:");
        preorderIterative(tree);

        System.out.println("\n");

        System.out.println("BINARY SEARCH TREE");
        System.out.println();

        Node bst = null;

        bst = insert(bst, 8);
        bst = insert(bst, 3);
        bst = insert(bst, 10);
        bst = insert(bst, 1);
        bst = insert(bst, 6);
        bst = insert(bst, 14);
        bst = insert(bst, 4);
        bst = insert(bst, 7);

        System.out.println("BST Preorder:");
        preorder(bst);

        System.out.println("\nBST Inorder:");
        inorder(bst);

        System.out.println("\nBST Postorder:");
        postorder(bst);

        System.out.println("\nBST Level Order:");
        levelOrder(bst);

        System.out.println("\n");

        System.out.println("Search 6:");
        System.out.println(search(bst, 6));

        System.out.println("Search 20:");
        System.out.println(search(bst, 20));
    }
}