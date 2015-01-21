/**
 * Ellipse class with override for getArea and getPerimeter
 * @author Neele
 */
package shapes;


public class Ellipse extends Shape {
    
    private int r1, r2;
    
    /**
     * Constructor
     * @param r1
     * @param r2 
     */
    public Ellipse(int r1, int r2){
    this.r1 = r1;
    this.r2 = r2;
    }
    
  /**
   * getArea function using PI
   * @return Area
   */
    @Override
    public double getArea(){
        return Math.PI * r1 * r2;
    }
    
   /**
    * getPerimeter function using PI
    * @return Perimeter
    */
    @Override
    public double getPerimeter(){
        return (Math.PI * (3*(r1 + r2) - Math.sqrt((3 * r1 + r2) * (r1 + 3 * r2))));
    }
}
