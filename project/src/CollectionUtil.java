package com.toolkit.algorithm;

import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * Generic Stack and Queue utilities.
 */
public class CollectionUtil {

    // ===== GENERIC STACK =====
    public static class Stack<T> {
        private LinkedList<T> list = new LinkedList<>();

        public void push(T item) {
            list.addFirst(item);
        }

        public T pop() {
            if (list.isEmpty()) throw new NoSuchElementException("Stack underflow");
            return list.removeFirst();
        }

        public boolean isEmpty() {
            return list.isEmpty();
        }
    }

    // ===== GENERIC QUEUE =====
    public static class Queue<T> {
        private LinkedList<T> list = new LinkedList<>();

        public void enqueue(T item) {
            list.addLast(item);
        }

        public T dequeue() {
            if (list.isEmpty()) throw new NoSuchElementException("Queue underflow");
            return list.removeFirst();
        }

        public boolean isEmpty() {
            return list.isEmpty();
        }
    }
}
