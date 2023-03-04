package ui;

import java.util.*;

public class BST {
    private Node root;
    private int max;

    // Métodos
    public void addNode(String[] names) {
        if (names.length == 0) {
            return;
        }
        root = organizeTree(names);
    }

    private Node organizeTree(String[] names) {
        if (names == null)
            return null;

        int half;
        Node node = null;
        if (names.length == 1) {
            node = new Node(names[names.length - 1]);
            return node;
        }
        if (names.length % 2 == 0) {
            half = (names.length / 2) - 1;
        } else {
            half = names.length / 2;
        }
        node = new Node(names[half]);
        node.setLeft(organizeTree(izquierdo(names, half, 0, null)));
        node.setRight(organizeTree(derecho(names, 0, half + 1, names.length, null)));

        return node;
    }

    private String[] izquierdo(String[] names, int half, int count, String[] izq) {
        if (count == half) {
            return izq;
        }
        if (izq == null) {
            izq = new String[half];
        }
        izq[count] = names[count];
        count++;
        izq = izquierdo(names, half, count, izq);
        return izq;
    }

    private String[] derecho(String[] names, int count, int half, int last, String[] der) {
        if (half == last) {
            return der;
        }
        if (der == null) {
            der = new String[last - half];
        }
        der[count] = names[half];
        count++;
        half++;
        der = derecho(names, count, half, last, der);
        return der;
    }

    public void inOrder() {
        inOrder(root, 0);
        System.out.println(" ");
        System.out.println("Profunidad máxima: " + max);
    }

    private void inOrder(Node node, int counter) {
        if (node == null) {
            return;
        }
        counter++;
        if(max < counter){
            max = counter;
        }
        inOrder(node.getRight(),counter);
        System.out.print(node.getKey() + " ");
        inOrder(node.getLeft(),counter);

    }
}
