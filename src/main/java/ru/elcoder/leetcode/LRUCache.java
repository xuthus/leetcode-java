package ru.elcoder.leetcode;

public class LRUCache {

    private static class Node {
        int key;

        int val;

        Node prev;

        Node next;

        Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    private Node head;

    private Node tail;

    private final Node[] map;

    private final int capacity;

    private int size = 0;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new Node[3001];
    }

    public int get(int key) {
        Node node = find(key);
        if (node == null)
            return -1;
        remove(node);
        addFirst(node);
        return node.val;
    }

    public void put(int key, int value) {
        Node node = find(key);
        if (node == null)
            node = new Node(key, value);
        else {
            node.val = value;
            remove(node);
        }
        addFirst(node);
        map[key] = node;
        size++;
        if (size > capacity) {
            removeLast();
        }
    }

    private Node find(int key) {
        return map[key];
    }

    private void remove(Node node) {
        if (node.prev == null) {
            this.head = node.next;
        } else {
            node.prev.next = node.next;
            if (node.next != null)
                node.next.prev = node.prev;
        }
        if (node == tail) {
            tail = node.prev;
        }
    }

    private void addFirst(Node node) {
        node.next = this.head;
        node.prev = null;
        if (this.head != null)
            head.prev = node;
        if (this.tail == null)
            this.tail = node;
        this.head = node;
    }

    private void removeLast() {
        if (this.tail == null)
            return;
        if (size == 1) {
            map[tail.key] = null;
            this.tail = null;
            this.head = null;
        } else {
            map[tail.key] = null;
            tail.prev.next = null;
            tail = tail.prev;
        }
        size--;
    }

    public static void main(String[] args) {
        final LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));
        cache.put(3, 3);
        System.out.println(cache.get(2));
        cache.put(4, 4);
        System.out.println(cache.get(3));
        cache.put(5, 5);
        System.out.println(cache.get(4));
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */