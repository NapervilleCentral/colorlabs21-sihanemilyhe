
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
         //Picture apic = new Picture("images\\picofme.jpg");
         //change with selfie picture
         Picture me = new Picture("images/picofme.jpeg");
         Picture me2 = new Picture("images/picofme.jpeg");
         Picture me3 = new Picture("images/picofme.jpeg");
         Picture me4 = new Picture("images/picofme.jpeg");
         Picture me5 = new Picture("images/picofme.jpeg");
         Pixel[] pixels;
         Pixel[] pixels2;
         Pixel[] pixels3;
         Pixel[] pixels4;
         Pixel[] pixels5;
         pixels = me.getPixels();
         pixels2 = me2.getPixels();
         pixels3 = me3.getPixels();
         pixels4 = me4.getPixels();
         pixels5 = me5.getPixels();
         int red,green,blue,avg;
         me.explore();
         
         /**
          * method 1 change
          * 
          * 
          */
        int i = 0;
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
             spot.setColor(new Color(41, 70, 91));
            }
         if (red<=126&&red>63&&blue<=126&&blue>63&&green<=126&&green>63) {
             spot.setColor(new Color(100, 50, 50));
            }
         if (red<=189&&red>126&&blue<=189&&blue>126&&green<=189&&green>126) {
             spot.setColor(new Color (183, 201, 226));
            }
         if (red<=255&&red>189&&blue<=255&&blue>189&&green<=255&&green>189) {
             spot.setColor(new Color (250, 249, 246));
            }
        }
        me.explore();
        me.write("images/method1.jpg");
        int min = pixels[i].getRed();
        int max=min;
        for (Pixel spot:pixels){
         
         if (pixels[i].getRed()>=max){
             max=pixels[i].getRed();
         }
         if (pixels[i].getRed()<=min){
             min=pixels[i].getRed();
         }
         i++;
        }
        int split=(max-min)/4;
         for (Pixel spot:pixels3){
         blue = spot.getBlue();
         green = spot.getGreen();
         red = spot.getRed();
         if (red<=split&&red>=0&&blue<=split&&blue>=0&&green<=split&&green>=0) {
             spot.setColor(new Color(41, 70, 91));
            }
         if (red<=split*2&&red>split&&blue<=split*2&&blue>split&&green<=split*2&&green>split) {
             spot.setColor(new Color(100, 50, 50));
            }
         if (red<=split*3&&red>split*2&&blue<=split*3&&blue>split*2&&green<=split*3&&green>split*2) {
             spot.setColor(new Color (183, 201, 226));
            }
         if (red<=split*4&&red>split*3&&blue<=split*4&&blue>split*3&&green<=split*4&&green>split*3) {
             spot.setColor(new Color (250, 249, 246));
            }
        }
        me.explore();
        me.write("images/method2.jpg");
         for (Pixel spot:pixels2){
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
             spot.setColor(new Color(102, 28, 28));
            }
         if (red<=126&&red>63&&blue<=126&&blue>63&&green<=126&&green>63) {
             spot.setColor(new Color(174, 78, 78));
            }
         if (red<=189&&red>126&&blue<=189&&blue>126&&green<=189&&green>126) {
             spot.setColor(new Color (229, 178, 178));
            }
         if (red<=255&&red>189&&blue<=255&&blue>189&&green<=255&&green>189) {
             spot.setColor(new Color (242,211,211));
            }
        }
        me2.explore();
        me2.write("images/SFtry1.jpg");
        
        for (Pixel spot:pixels3){
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
             spot.setColor(new Color(106,127,175));
            }
         if (red<=126&&red>63&&blue<=126&&blue>63&&green<=126&&green>63) {
             spot.setColor(new Color(199,182,255));
            }
         if (red<=189&&red>126&&blue<=189&&blue>126&&green<=189&&green>126) {
             spot.setColor(new Color     (245,211,232));
            }
         if (red<=255&&red>189&&blue<=255&&blue>189&&green<=255&&green>189) {
             spot.setColor(new Color (248,247,255));
            }
        }
        me3.explore();
        me3.write("images/SFtry2.jpg");
        
        for (Pixel spot:pixels4){
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
             spot.setColor(new Color(26,34,64));
            }
         if (red<=126&&red>63&&blue<=126&&blue>63&&green<=126&&green>63) {
             spot.setColor(new Color    (174,224,215));
            }
         if (red<=189&&red>126&&blue<=189&&blue>126&&green<=189&&green>126) {
             spot.setColor(new Color     (86,59,127));
            }
         if (red<=255&&red>189&&blue<=255&&blue>189&&green<=255&&green>189) {
             spot.setColor(new Color (248,226,154));
            }
        }
        me4.explore();
        me4.write("images/SFtry3.jpg");
        /**/
        for (Pixel spot:pixels5){
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
             spot.setColor(new Color(26,34,64));
            }
         if (red<=126&&red>63&&blue<=126&&blue>63&&green<=126&&green>63) {
             spot.setColor(new Color(86,59,127));
            }
         if (red<=189&&red>126&&blue<=189&&blue>126&&green<=189&&green>126) {
             spot.setColor(new Color (174,224,215));
            }
         if (red<=255&&red>189&&blue<=255&&blue>189&&green<=255&&green>189) {
             spot.setColor(new Color (248,226,154));
            }
        }
        me5.explore();
        me5.write("images/SFmyFinal.jpg");
         /**
          * method 2 change
          * 
          */
         
         /**
          * custom color palette
          */

         
    }//main       
}//class
