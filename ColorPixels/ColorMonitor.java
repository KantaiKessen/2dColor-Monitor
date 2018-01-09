import java.util.*;

public class ColorMonitor 
{
   private Pixel[][] monitor;

  /**
   * Constructor for objects of class ColorMonitor
   */
   public ColorMonitor(int r, int c)
   {
       monitor = new Pixel[r][c];
   }

   public int getNumRows() { return -1; }

   public int getNumCols() { return -1; }

   public void setPixel(int r, int c, Pixel p)
   {
       
   }

   public Pixel getPixel(int r, int c)
   {
       return new Pixel(0, 0, 0);  // you need to change this
   }

  /**
   * counts the number of mostly red Pixels
   */
   public int numMostlyRed()
   {
       return -1;    //  so it compiles
   }

  /**
   * darkens the monitor according to the following algorithm
   *      Increase blue by someValue.
   *      Increase green by half somevalue (Use integer division).
   *      Both blue and green should not be greater than 255.
   *         If either value is greater than 255, reset the value to 255.
   */
   public void darken(int someValue)
   {
//    add code here
   }

  /**
   *   determines if the specified location is a Bright spot.  A spot is
   *   considered bright if all three following conditions are true:
   *        1)  The red value of the pixel at the specified location is
   *            greater than (!=) all (8) surrounding pixels.
   *        2)  The blue value of the pixel at the specified location is 
   *            less than (!=) all (8) surrounding pixels.
   *        3)  The green value of the pixel at the specified location is
   *            greater than (!=) the average of all surrounding pixels.
   */
   public boolean isBrightSpot(int r, int c)
   {
//    add code here
       return Math.random() > 0.5;    // so it compliles
   }
}