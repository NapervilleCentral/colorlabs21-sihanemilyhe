
/**
 * Write a description of class SheparFaireyLab here.
 * 
 * @Emily
 * @version (a version number or a date)
 */
import java.awt.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

public class SheparFaireyLab
{
    /**
     * main method, to test the picture
     *  
     */
    public static void main(String[] args)
    {
        
         //opens selfie picture 
          /**/
         //String fileName = FileChooser.pickAFile();
         //Picture pictObj = new Picture(fileName);
         //pictObj.explore();
         
         //relative path
         Picture apic = new Picture("images\\beach.jpg");
         //change with selfie picture
         Picture me = new Picture("images/beach.jpg");
         Picture me2 = new Picture("images/beach.jpg");
         Picture me3 = new Picture("images/beach.jpg");
         Pixel[] pixels;
         Pixel[] pixels2;
         Pixel[] pixels3;
         pixels = me.getPixels();
         pixels2 = me2.getPixels();
         pixels3 = me3.getPixels();
         int red,green,blue,avg;
         
         /**
          * method 1 change
          * 
          * 
          */
         for (Pixel spot:pixels){
         blue = spot.getBlue();
         green = spot.getGreen();
         red = spot.getRed();
         avg = (blue+red+green)/3;
         blue = (avg);
         spot.setBlue(blue);
         green = (avg);
         spot.setGreen(green);
         red = (avg);
         spot.setRed(red);
         if (red<=63&&red>=0&&blue<=63&&blue>=0&&green<=63&&green>=0) {
             green=70;
             blue=91;
             red=41;
             
            
            }
        }
        me.explore();
          //(41, 70, 91)
         /**
          * method 2 change
          * 
          */
         
         /**
          * custom color palette
          */

         
    }//main       
}//class
