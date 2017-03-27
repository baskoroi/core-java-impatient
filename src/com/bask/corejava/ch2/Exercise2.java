package com.bask.corejava.ch2;

/**
 * 2. Consider the nextInt method of the Scanner class. Is it an accessor or 
 * mutator? Why? What about the nextInt method of the Random class?
 * 
 * @author baskoroi
 */
public class Exercise2 {
    /**
     * ANSWER: Both are accessors.
     * 
     * An accessor method doesn't change the state of the object on which
     * it is invoked, while a mutator method does.
     * 
     * Therefore,
     * <code>Scanner.this.nextInt()</code> is an accessor.
     * <code>Random.this.nextInt()</code> is an accessor.
     */
}
