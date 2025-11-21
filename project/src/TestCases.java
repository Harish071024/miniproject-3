package com.toolkit.algorithm;

import java.util.Arrays;

public class TestCases {

    public static void main(String[] args) {

        int[] arr1 = {5, 3, 8, 1, 2};

        // Test Sorting
        int[] a = arr1.clone();
        SortingUtil.bubbleSort(a);
        System.out.println("Bubble Sort: " + Arrays.toString(a));

        int[] b = arr1.clone();
        SortingUtil.mergeSort(b);
        System.out.println("Merge Sort: " + Arrays.toString(b));

        // Test Searching
        System.out.println("Linear Search(8): " + SearchUtil.linearSearch(b, 8));
        System.out.println("Binary Search(3): " + SearchUtil.binarySearch(b, 3));

        // Test Stack
        CollectionUtil.Stack<Integer> stack = new CollectionUtil.Stack<>();
        stack.push(10);
        stack.push(20);
        System.out.println("Stack pop: " + stack.pop());

        // Test Queue
        CollectionUtil.Queue<String> queue = new CollectionUtil.Queue<>();
        queue.enqueue("A");
        queue.enqueue("B");
        System.out.println("Queue dequeue: " + queue.dequeue());

        // Test Timer
        long time = AnalysisUtil.measure(() -> SortingUtil.quickSort(arr1.clone()));
        System.out.println("QuickSort time: " + time + " ns");
    }
}
