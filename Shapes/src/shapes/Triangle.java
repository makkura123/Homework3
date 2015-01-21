/**
 * Triangle class with override for getArea and getPerimeter
 * @author Neele
 */
package shapes;

public class Triangle extends Shape{
    private int s1, s2, s3;
    private double Area;
    
    /**
     * Constructor
     * @param s1
     * @param s2
     * @param s3 
     */
    public Triangle(int s1, int s2, int s3){
    this.s1 = s1;
    this.s2 = s2;
    this.s3 = s3;
    }
    
    /**
     * Computing area using Heron's formula
     * @return Area
     */
    @Override
    public double getArea(){
        double s = (s1+s2+s3)/2.0;
        Area = Math.sqrt(s *(s - s1) * (s - s2) * (s - s3)); 
        return Area;
    }
    
   /**
     * Computing perimeter
     * @return Perimeter
     */
    @Override
    public double getPerimeter(){
        return s1 + s2 + s3;
    }
}
