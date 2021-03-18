package io.github.akjo03.m411.heaps.binaryTree;

public class BinaryTree implements NodeContainer {
    private Node root;
    private int maxIndex;

    public BinaryTree(Node root){
        this.root = root;
        this.maxIndex = 1;
        this.root.setIndex(getMaxIndex());
    }

    //Methods
    public void addNode(Node parent, Node child, boolean right) {
        //Check if Parent in Tree
        child.setIndex(getMaxIndex());
        if (right) {
            parent.setRight(child);
        } else {
            parent.setLeft(child);
        }
    }

    public void addNode(int parentIndex, Node child, boolean right) {
        //Check if Parent in Tree
        child.setIndex(getMaxIndex());
        if (right) {
            findNode(parentIndex).setRight(child);
        } else {
            findNode(parentIndex).setLeft(child);
        }
    }

    public Node findNode(int index) {
        return root.findNode(index);
    }

    @Override
    public String toString() {
        String result = "";
        result += "Root: " + root.toString() + "\n";
        result += "Max Index: " + maxIndex + "\n";
        for (int i = 0; i < maxIndex; i++) {
            System.out.println(i);
            Node currentNode = findNode(i);
            if (currentNode != null) {
                result += "    Node " + i + ": " + currentNode.toString() + "\n";
            }
        }
        return result;
    }

    //Getters and Setters
    public Node getRoot() {
        return this.root;
    }


    private int getMaxIndex() {
        int currentIndex = maxIndex;
        maxIndex++;
        return currentIndex;
    }
}
