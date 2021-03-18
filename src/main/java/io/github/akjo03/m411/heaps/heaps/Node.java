package io.github.akjo03.m411.heaps.heaps;

import java.util.ArrayList;

public class Node {
    private int value;
    private int index;
    private ArrayList<Node> children;

    public Node(int value){
        this.value = value;
        this.index = -1;
    }

    public void addChild(Node child){
        children.add(child);
    }

    public int getValue() {
        return value;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index){
        this.index = index;
    }

    public ArrayList<Node> getChildren() {
        return children;
    }
}
