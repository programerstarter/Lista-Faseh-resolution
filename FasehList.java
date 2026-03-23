package br.edu.faseh.lista.structure;

import br.edu.faseh.lista.model.Node;

public class FasehList<T> {

    private Node<T> firstNode;
    private Node<T> lastNode;
    private int totalElements;

    public void insertAtEnd(T value) {
        Node<T> newNode = new Node<>(value);

        if (lastNode == null) {
            firstNode = newNode;
            lastNode = newNode;
        } else {
            lastNode.setNext(newNode);
            lastNode = newNode;
        }
        totalElements++;
    }
}
