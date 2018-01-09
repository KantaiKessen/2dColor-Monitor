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

    public int getRed() { return red; }
    public int getGreen() { return green; }
    public int getBlue() { return blue; }

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
        int numTrue = 0;
        if(red > green) {numTrue++;}
        if(red > blue) {numTrue++;}
        if(red >= 150) {numTrue++;}
        if(red > green + blue) {numTrue++;}
        return numTrue > 2;    // so it compliles
    }
}