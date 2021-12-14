package ru.elcoder.stepik.algorithms.heaps;

import java.util.Optional;
import java.util.Scanner;

public class MaxHeap {
    int[] nodes = new int[100002];

    int n = 0;

    public static void main(String[] args) {
        final MaxHeap heap = new MaxHeap();

        Scanner scanner = new Scanner(System.in);
        final int k = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < k; i++) {
            String line = scanner.nextLine();
            heap.executeCommand(line).ifPresent(System.out::println);
        }

    }

    public void insert(int x) {
        nodes[n++] = x;
        siftUp(n - 1);
    }

    public int extractMax() {
        int res = nodes[0];
        nodes[0] = nodes[--n];
        siftDown(0);
        return res;
    }

    private void siftUp(int i) {
        if (i <= 0) {
            return;
        }
        int parent = i >> 1;
        if (nodes[parent] < nodes[i]) {
            swap(parent, i);
            siftUp(parent);
        }
    }

    private void swap(int i1, int i2) {
        int tmp = nodes[i1];
        nodes[i1] = nodes[i2];
        nodes[i2] = tmp;
    }

    public int size() {
        return n;
    }

    private void siftDown(int i) {
        int childIndex = i << 1;
        if (childIndex >= n) {
            return;
        }
        int maxChild = childIndex;
        if ((childIndex + 1) < n && nodes[childIndex + 1] > nodes[childIndex]) {
            maxChild++;
        }
        if (nodes[i] < nodes[maxChild]) {
            swap(i, maxChild);
            siftDown(maxChild);
        }
    }

    public Optional<Integer> executeCommand(String command) {
        final String[] parts = command.trim().split(" ");
        if ("insert".equalsIgnoreCase(parts[0])) {
            insert(Integer.parseInt(parts[1]));
            return Optional.empty();
        }
        if ("extractMax".equalsIgnoreCase(parts[0])) {
            return Optional.of(extractMax());
        }
        throw new IllegalArgumentException(command);
    }
}
