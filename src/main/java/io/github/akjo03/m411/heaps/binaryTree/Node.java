package io.github.akjo03.m411.heaps.binaryTree;

public class Node implements NodeContainer {
    private int value;
    private int index;
    private Node left;
    private Node right;

    //Constructor
    public Node(int value){
        this.value = value;
        this.index = -1;
    }

    public Node(int value, int index){
        this.value = value;
        this.index = index;
    }

    public Node findNode(int index) {
        Node result = null;

        if (this.index == index) return this;
        if (this.left == null && this.right == null) return null;

        if (this.right != null) result = this.right.findNode(index);

        if (result != null && result.index == index) return result;

        if (this.left != null) return this.left.findNode(index);
        
        return null;
    }

    @Override
    public String toString() {
        return "Node(Value: " + value + ", Index: " + index + ")";
    }

    //Getters and Setters
    public int getIndex() {
        return this.index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getValue() {
        return this.value;
    }

    public Node getLeft() {
        return this.left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return this.right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
