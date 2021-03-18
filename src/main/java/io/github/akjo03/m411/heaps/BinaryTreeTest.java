package io.github.akjo03.m411.heaps;

import io.github.akjo03.m411.heaps.binaryTree.BinaryTree;
import io.github.akjo03.m411.heaps.binaryTree.Node;

public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTree testTree = new BinaryTree(new Node(16));
        testTree.addNode(testTree.getRoot(), new Node(14), false);
        testTree.addNode(testTree.getRoot(), new Node(18), true);

        System.out.println(testTree.toString());
    }
}