package io.github.akjo03.m411.heaps.heaps;

public class Heap {
    //Variables
    private Node root;
    private int maxIndex;

    //Constructor
    public Heap(Node max) {
        this.root = max;
        this.root.setIndex(getMaxIndex());
    }

    private int getMaxIndex() {
        int currentIndex = this.maxIndex;
        this.maxIndex++;
        return currentIndex;
    }

    public void addNode(int value, Node parent) {
        Node newNode = new Node(value);
        newNode.setIndex(getMaxIndex());
        parent.addChild(newNode);
    }

    public void addNode(int value, int parentIndex) {
        Node newNode = new Node(value);
        newNode.setIndex(getMaxIndex());
        findNode(parentIndex).addChild(newNode);
    }

    public void addNode(Node newNode, Node parent) {
        newNode.setIndex(getMaxIndex());
        parent.addChild(newNode);
    }

    public void addNode(Node newNode, int parentIndex) {
        newNode.setIndex(getMaxIndex());
        findNode(parentIndex).addChild(newNode);
    }

    public Node findNode(int index) {
        return null;
    }
}