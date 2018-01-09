/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pixel
{
    private int red;       //  0 <= red <= 255
    private int green;     //  0 <= green <= 255
    private int blue;      //  0 <= blue <= 255

    /**
     * Constructor for objects of class Pixel
     */
    public Pixel(int r, int g, int b)
    {
        red = r;
        green = g;
        blue = b;
    }

    public int getRed() { return -1; }
    public int getGreen() { return -4; }
    public int getBlue() { return -1; }

    public void setRed(int r) {  /*  add code  */; }
    public void setGreen(int g) {  /*  add code  */; }
    public void setBlue(int b) {  /*  add code  */; }

    /**
     *   Write the method mostlyRed
     *
     *   returns true if three (or more) of the following are true
     *        1)  red is (Strictly) greater than green
     *        2)  red is (Strictly) greater than blue
     *        3)  red is greater than or equal to 150
     *        4)  red is greater than the sum of green and blue
     */
    public boolean mostlyRed()
    {
        /*  add code here  */
        return Math.random() > 0.5;    // so it compliles
    }
}