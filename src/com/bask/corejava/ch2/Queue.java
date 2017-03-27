package com.bask.corejava.ch2;

/**
 * 16. Implement a class Queue, an unbounded queue of strings.
 * Provide methods add, adding at the tail, and remove, removing at the head of
 * the queue. Store elements as a linked list of nodes.
 * Make Node a nested class. Should it be static or not?
 * 
 * Answer: No, Node should not be a static class.
 * 
 * Because every node is associated with a particular queue, it has to know
 * which queue it belongs to.
 * 
 * @author baskoroi
 * @param <T> type of items to store in the Queue instance
 */
public class Queue<T> {
    
    /**
     * Node that represents an individual item in the queue,
     * since the queue is in the form of a linked list.
     */
    private class Node {
        private T value;
        private Node next;

        /**
         * Instantiates a new Node object.
         * @param value the object's value
         */
        public Node(T value) {
            this.value = value;
            this.next = null;
        }

        /**
         * Gets the value of the Node object
         * @return value of the node
         */
        public T value() {
            return value;
        }

        /**
         * Sets the value of the Node object
         * @param value 
         */
        public void value(T value) {
            this.value = value;
        }

        /**
         * Gets the next node of the current Node object
         * @return the next node
         */
        public Node next() {
            return next;
        }

        /**
         * Sets the next pointer of the current Node object
         * to the determined node.
         * @param next the next node to point to
         */
        public void next(Node next) {
            this.next = next;
        }
    }
    
    private Node head = null;
    private Node tail = null;

    /**
     * 17. Provide an iterator -- an object that yields the elements of the
     * queue in turn -- for the queue of the preceding class. 
     * Make Iterator a nested class with methods next and hasNext. 
     * Provide a method iterator() of the Queue class that yields a 
     * Queue.Iterator. Should Iterator be static or not?
     * 
     * Answer: No, Iterator should not be a static class. Because it has to know
     * to which queue it belongs.
     */
    public class Iterator {
        
        private Node current;
        
        /**
         * Instantiates a new iterator for the queue which should point to
         * the determined Node object.
         * @param node the node to point to, after instantiation
         */
        public Iterator(Node node) {
            this.current = node;
        }  
                
        /**
         * Determines whether there is another node to iterate to in the queue.
         * @return whether the current node exists
         */
        public boolean hasNext() {
            return this.current != null;
        }
        
        /**
         * Stores the current node's value, moves the cursor to the next node,
         * and returns the previously stored value.
         * @return value of the current node
         */
        public T next() {
            T item = (T) this.current.value();
            this.current = this.current.next();
            return item;
        }
    }
    
    private Iterator iterator;
    
    /**
     * Adds a new item/node at the end of the queue. (FIFO)
     * @param val The value for the new node
     */
    public void add(T val) {
        if (head == null) {
            head = new Node(val);
            head.next(tail);
        } else {
            Node node = new Node(val);
            if (head.next() == null) {
                tail = node;
                head.next(tail);
            } else {
                tail.next(node);
                tail = tail.next();
            }
        }
    }
    
    /**
     * Removes the first node of the queue. (FIFO)
     * @return value of the first node from the queue
     */
    public T remove() {
        if (head == null) return null;
        
        T val = head.value();
        head = head.next();
        return val;
    }
    
    /**
     * Gets the iterator of the queue, used to visit each element within.
     * @return iterator of the queue
     */
    public Iterator iterator() {
        this.iterator = new Iterator(head);
        return this.iterator;
    }
    
}
