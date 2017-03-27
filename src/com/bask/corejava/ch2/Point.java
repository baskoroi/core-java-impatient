package com.bask.corejava.ch2;

/**
 * 5. Implement an immutable class Point that describes a point in the plane. 
 * Provide a constructor to set it to a specific point, a no-arg constructor 
 * to set it to the origin, and methods getX, getY, translate, and scale. 
 * The translate method moves the point by a given amount in x- and y-direction.
 * The scale method scales both coordinates by a given factor. Implement these 
 * methods so that they return new points with the results. 
 * 
 * For example,
 *  
 * <code>Point p = new Point(3, 4).translate(1, 3).scale(0.5);</code>
 * 
 * should set p to a point with coordinates (2, 3.5).
 * 
 * 6. Repeat the preceding exercise, but now make translate and scale into 
 * mutators. Done.
 * 
 * 7. Add javadoc comments to both versions of the Point class from the 
 * preceding exercises. This comment is.
 * 
 * 8. In the preceding exercises, providing the constructors and getter methods
 * of the Point class was rather repetitive. Most IDEs provide shortcuts for 
 * writing the boilerplate code. What does your IDE offer?
 * 
 * Answer: Alt+Insert > Constructor or Getter (NetBeans)
 * 
 * @author baskoroi
 */
public class Point {
    
    private double x;
    private double y;

    /**
     * Sets the Point object at origin.
     */
    public Point() {
        this.x = 0;
        this.y = 0;
    }
    
    /**
     * Sets the Point object at the determined coordinates.
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Gets the X-coordinate of the Point object.
     * @return X-coordinate of the point
     */
    public double getX() {
        return x;
    }

    /**
     * Gets the Y-coordinate of the Point object.
     * @return Y-coordinate of the point
     */
    public double getY() {
        return y;
    }
    
    /**
     * Translates the Point object in an immutable way.
     * (Immutable: the inner values of the object do not change)
     * 
     * @param dx X-coordinate distance
     * @param dy Y-coordinate distance
     * @return a new, translated Point object
     */
    public Point translate(double dx, double dy) {
        return new Point(this.x + dx, this.y + dy);
    }
    
    /**
     * Scales the Point object in an immutable way.
     * (Immutable: the inner values of the object do not change)
     * 
     * @param s scale factor
     * @return a new, scaled Point object
     */
    public Point scale(double s) {
        return new Point(this.x * s, this.y * s);
    }
    
    /**
     * Translates the Point object in a mutable way.
     * @param dx X-coordinate distance
     * @param dy Y-coordinate distance
     */
    public void translateMutably(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }
    
    /**
     * Scales the Point object in a mutable way.
     * @param s scale factor
     */
    public void scaleMutably(double s) {
        this.x *= s;
        this.y *= s;
    }
        
}
