import java.util.Scanner;
public class TriangleDemo
{
   public static void main(String[] args)
   {
      //create a Scanner object
      Scanner scan = new Scanner (System.in);

      // Create a Triangle object.
      Triangle tri = new Triangle();

      // Prompt user to input value for height and base                 
      System.out.print ("Enter the triangle's height : ");
      double height = scan.nextDouble();
      System.out.print ("Enter the triangle's base : ");
      double base = scan.nextDouble();
      
      //Set the height and base (use mutator) 
      tri.set(height,base);
      
      // Display the height, base and area (use accessor)
      System.out.println("The pyramid's height is " + tri.getHeight());
                        
      System.out.println("The pyramid's base is " + tri.getBase());
      
      System.out.println("The pyramid's area is " + tri.getArea());   
   }
   
public class Triangle
{
     private double height;
     private double base;

     // The setHeight method accepts an argument which is    
     //stored in the height field.

     public void setHeight(double len)
     {
          height = len;
     }

     // The setBase method accepts an argument which is 
     //stored in the base field. 
    
     public void setBase(double b)
     {
          base = b;
     }

     //The set method accepts two arguments which are 
     //stored in the height and base fields.
  
     public void set(double len, double b)
     {
          height = len;
          base = b;
     }

    // The getHeight method returns the value stored in the 
    //  height field.

     public double getHeight()
     {
          return height;
     }

     // The getBase method returns the value stored in the   
     //base field

     public double getBase()
     {
          return base;
     }

     // The getArea method returns the value of area
    // with formula : 0.5 * height * base

     public double getArea()
     {
          return 0.5 * height * base;
     }

}
}