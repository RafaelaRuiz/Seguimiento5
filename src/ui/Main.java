package ui;
import java.util.*;
public class Main{
    public static void main(String[] args) {
        BST tree = new BST();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca todo los nombres ordenados");
        String names = scanner.nextLine();
        String[] array = names.split(" ");
        tree.addNode(array);
        System.out.println("-----Orden inverso-----");
        tree.inOrder();
    }
} 
