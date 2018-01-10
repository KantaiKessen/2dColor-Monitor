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

   public int getNumRows() { return monitor.length; }

   public int getNumCols() { return monitor[0].length; }

   public void setPixel(int r, int c, Pixel p)
   {
       monitor[r][c] = p;
   }

   public Pixel getPixel(int r, int c)
   {
       return monitor[r][c];  // you need to change this
   }

  /**
   * counts the number of mostly red Pixels
   */
   public int numMostlyRed(){
   int numMostRed = 0;
   {
       int numRed = 0;
       for(Pixel[] x : monitor)
       {
           for(Pixel i : x)
           {
               if(i.mostlyRed())
<<<<<<< HEAD
               {numRed++;}
            }
       }
       return numRed;
=======
               {
                   numMostRed++;
               }
           }
       }
       return numMostRed;
>>>>>>> 526e7712dd5a2680736a565f5d563ed9f3cf8f51
   }
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
<<<<<<< HEAD
        
=======
        for(Pixel[] x : monitor)
        {
            for(Pixel i : x)
            {
                i.setGreen(i.getGreen() + someValue/2);
                i.setBlue(i.getBlue() + someValue);
                if(i.getGreen() > 255){i.setGreen(255);}
                if(i.getBlue() > 255){i.setBlue(255);}
            }
        }
>>>>>>> 526e7712dd5a2680736a565f5d563ed9f3cf8f51
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
        if(r == 0 || c == 0 || r == monitor.length - 1 || c == monitor[0].length - 1)
        {
            return false;
        }
        return Math.random() > 0.5;    // so it compliles
   }
}