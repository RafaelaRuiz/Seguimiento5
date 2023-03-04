package ui;

public class Node {
    private String key;
    private Node right;
    private Node left;

    public Node(String key) {
        this.key = key;
        right= null;
        left= null;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }
}
