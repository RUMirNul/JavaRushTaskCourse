package com.javarush.task.pro.task13.task1313;

public class StringsLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        Node temp = new Node();
        temp.value = value;
        if (first.next == null && last.prev == null) {
            first.next = temp;
            temp.prev = first;
        } else {
            last.prev.next = temp;
            temp.prev = last.prev;
        }
        last.prev = temp;
        temp.next = last;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
