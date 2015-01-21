/**
 * Rectangle class with override for getArea and get getPerimeter
 * @author Neele
 */
package shapes;


public class Rectangle extends Shape {
    private int width, height, Area;
    
    /**
     * Constructor
     * @param width
     * @param height 
     */
    public Rectangle(int width, int height){
    this.width = width;
    this.height = height;
    }
    
   /**
    * getArea function 
    * @return Area
    */
    @Override
    public double getArea(){
        Area = width * height;
        return Area;
    }
    
   /**
    * getPerimeter function
    * @return Perimeter
    */
    @Override
    public double getPerimeter(){
        return 2* (Area);
    }
    
}
