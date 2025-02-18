package com.dh.model;

public class Node {
    // keep these fields
    Node left, right;
    int value;

    Node find(int v) {
        Node current = this;
        while (current != null) {
            if (v < current.value) {
                if (current.left != null) {
                    current = current.left;
                    continue;
                }
            }

            if (v > current.value) {
                if (current.right != null) {
                    current = current.right;
                    continue;
                }
            }

            if (v != current.value) {
                current = null;
            }
            break;
        }
        return current;
    }
    public static void main(String [] args){

    }
}
