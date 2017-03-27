package com.bask.corejava.ch2;

import org.omg.CORBA.IntHolder;

/**
 * 4. Why can’t you implement a Java method that swaps the contents of two 
 int variables? Instead, write a method that swaps the contents of two 
 IntHolder objects. (Look up this rather obscure class in the API 
 documentation.) Can you integerObjectSwap the contents of two Integer objects?
 * 
 * @author baskoroi
 */
public class Exercise4 {
    /**
     * Answer 1: Because Java is strictly pass-by-value.
     * 
     * Pass-by-value approach cannot directly change the parameter values where
     * the actual variables reside, i.e. <code>main()</code>, etc.
     * 
     * Therefore, we can't expect primitive values to be modified/swapped after
     * the scope of that <code>swap()</code> method.
     * 
     * Method parameters in Java methods are either primitive values or 
     * object references, and they are all passed by value.
     */
    
    /**
     * Answer 2: IntHolder swap? Successfully swapped.
     * 
     * Because in this swap method, we are directly mutating the IntHolder 
     * state by changing their values. This method is also pass-by-value, but
     * we are directly changing the internal value of all the IntHolder
     * objects here (using the <code>.value</code> property) -- hence the 
     * ability to 'swap' the values.
     */
    public static void intHolderSwap(IntHolder i1, IntHolder i2) {
        IntHolder tempHolder = new IntHolder();
        tempHolder.value = i1.value;
        i1.value = i2.value;
        i2.value = tempHolder.value;
    }
    
    /**
     * Answer 3: Swap two Integer objects? No way.
     * 
     * Again, because we are only passing the Integer objects by value. Any
     * changes done within this method will not affect the actual values (from
     * the method where this swap method is called, i.e. <code>main()</code>, 
     * etc.)
     * 
     * When this method is invoked w/ some Integer objects, 
     * 
     * Outside this function's scope: the Integer objects will not point 
     * to their opposite -- they will yet refer to the previous values.
     * 
     * Only inside the scope does the values get 'swapped', only in terms of
     * which the parameter variables point to. But in the other method where 
     * this method is called, the values do not change anyhow.
     */
    public static void integerObjectSwap(Integer i1, Integer i2) {
        Integer temp = i1;
        i1 = i2;
        i2 = temp;
        
        // when printed here, i1 will refer to i2's value. 
        // But in main() or other invoking method, i1 will not. 
        // Again, because it's pass-by-value.
        System.out.println(i1);
        System.out.println(i2);
    }
    
}
