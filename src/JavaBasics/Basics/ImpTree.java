package JavaBasics.Basics;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left;
    Node right;
    public Node (int data){
        this.data = data;
        left=right=null;
    }
}

public class ImpTree {
//    Node node;


    public static void main(String[] args) {
        // Creating the tree
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);


        System.out.print("In-order DFS: ");
        inOrderDFS(root);
        System.out.print("\nPre-order DFS: ");
        preOrderDFS(root);
        System.out.print("\nPost-order DFS: ");
        postOrderDFS(root);
        System.out.print("\nLevel order: ");
        BFS(root);
    }

    // In-order DFS: Left, Root, Right
    static void inOrderDFS(Node node) {
        if (node == null) return;
        inOrderDFS(node.left);
        System.out.print(node.data + " ");
        inOrderDFS(node.right);
    }

    // Pre-order DFS: Root, Left, Right
    static void preOrderDFS(Node node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preOrderDFS(node.left);
        preOrderDFS(node.right);
    }

    // Post-order DFS: Left, Right, Root
    static void postOrderDFS(Node node) {
        if (node == null) return;
        postOrderDFS(node.left);
        postOrderDFS(node.right);
        System.out.print(node.data + " ");
    }

    // BFS: Level order traversal
    static void BFS(Node root) {
        if (root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.print(node.data + " ");
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
    }
}
