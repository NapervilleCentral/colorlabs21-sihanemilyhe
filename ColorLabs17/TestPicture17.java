
/**
 * Kevin Hayes
 * Test Picture Classes
 *
 * @author (Kevin Hayes)
 * @version (10-19-2016)
 */
import java.awt.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List
public class TestPicture17
{
     //Picture pic = new Picture("images\\beach.jpg");
     //Picture acanvas = new Picture("images\\Canvas.jpg");
    /**
     * main method, to test the picture
     *
     */
  public static void main(String[] args)
  {
      //opens picture using a dialog box
      /**/
     //String fileName = FileChooser.pickAFile();
     //Picture pictObj = new Picture(fileName);
     //pictObj.explore();

     //opens a pictue using a path
     //Picture apic = new Picture("C:\\Users\\khayes\\Favorites\\Documents\APCS- Java\chap03\Curriclum 2013\Picture Color labs\images\\beach.jpg");
     //make a copy of pic and rename pic
     //relative path
     
     Picture pic = new Picture("images\\newpic.jpg");
     Picture pic2 = new Picture("images\\newpic.jpg");
     Picture pic3 = new Picture("images\\newpic.jpg");
     Picture pic4 = new Picture("images\\newpic.jpg");
     Picture pic5 = new Picture("images\\newpic.jpg");
     Picture acanvas = new Picture("images\\Canvas.jpg");
    int red,green,blue;
     //apic.explore();
     Pixel[] pixels3;
     pixels3 = pic.getPixels();
     for (Pixel spot:pic.getPixels()){
         blue = spot.getBlue();
         blue = (255-blue);
         spot.setBlue(blue);
         green = spot.getGreen();
         green = (255-green);
         spot.setGreen(green);
         red = spot.getRed();
         red = (255-red);
         spot.setRed(red);
         
    
     }
     copytoCanvas(pic,acanvas,0,0);
     mirrorVertical(pic2);
     copytoCanvas(pic2, acanvas,1280,0);
     flip(pic5);
     copytoCanvas(pic5, acanvas, 2560,0);
     
     //mirrorVertical2(temple);
     //temple.explore();
     Pixel[] pixels;
     pixels = pic3.getPixels();
     for (Pixel spot: pic3.getPixels()) {
         red = spot.getRed();
         red = (int)(red*0.5);
         spot.setRed(red);
        }
     copytoCanvas(pic3,acanvas,0,720);
     Pixel[] pixels2;
     pixels2 = pic4.getPixels();
    for (Pixel spot:pic4.getPixels()){
         blue = spot.getBlue();
         red = spot.getRed();
         green = spot.getGreen();
         if (red<=140&&red>=0) {
            if (blue<=70&&blue>=0) {
                if (green<=70&&green>=0) {
            spot.setBlue((int)(blue*2.5));
         }
         }
    }
    }
     big(pic4, acanvas,1280,720);
     acanvas.explore();
     
     /*
     //makes an array of pixels
     Pixel[] pixels;
     Pixel[] pixels2;
     Pixel[] pixels3;
     Pixel[] pixels4;
     Pixel[] pixels5;
     Pixel[] pixels6;
     //gets pixels from picture and assigns to pixels array
     pixels = pic.getPixels();
     pixels2 = pic2.getPixels();
     pixels3 = pic3.getPixels();
     pixels4 = pic4.getPixels();
     pixels5 = pic5.getPixels();
     pixels6 = pic6.getPixels();

     
     
     

     
     Pixel spot1 = pic.getPixel(100,100);
     Pixel spot2 = pic.getPixel(433,283);
     Pixel ferr17 = pixels[17];
     ferr17.setRed(240);
     ferr17.setGreen(160);
     ferr17.setBlue(200);
     //spot2.setColor(Color.blue);
     int red,green,blue;
     pic.explore();
     for (Pixel spot: pic3.getPixels()) {
         red = spot.getRed();
         red = (int)(red*0.5);
         spot.setRed(red);
        }
     pic3.explore();
     for (Pixel spot:pic.getPixels()){
         blue = spot.getBlue();
         blue = (255-blue);
         spot.setBlue(blue);
         green = spot.getGreen();
         green = (255-green);
         spot.setGreen(green);
         red = spot.getRed();
         red = (255-red);
         spot.setRed(red);
         
    
     }
     pic.explore();
    
     for (Pixel spot:pic2.getPixels()){
         blue = spot.getBlue();
         green = spot.getGreen();
         red = spot.getRed();
         int grey = (blue+red+green)/3;
         blue = (grey);
         spot.setBlue(blue);
         green = (grey);
         spot.setGreen(green);
         red = (grey);
         spot.setRed(red);
         }
     pic2.explore();
     
     for (Pixel spot:pic4.getPixels()){
         blue = spot.getBlue();
         blue = (blue-80);
         spot.setBlue(blue);
         green = spot.getGreen();
         green = (green-80);
         spot.setGreen(green);
         red = spot.getRed();
         red = (red-80);
         spot.setRed(red);
         
    
     }
     pic4.explore();
     
     for (Pixel spot:pic5.getPixels()){
         blue = spot.getBlue();
         blue = (blue+90);
         spot.setBlue(blue);
         green = spot.getGreen();
         green = (green+90);
         spot.setGreen(green);
         red = spot.getRed();
         red = (red+90);
         spot.setRed(red);
         
    
     }
     pic5.explore();
     
     for (Pixel spot:pic6.getPixels()){
         blue = spot.getBlue();
         red = spot.getRed();
         green = spot.getGreen();
         if (red<=140&&red>=0) {
            if (blue<=70&&blue>=0) {
                if (green<=70&&green>=0) {
            spot.setBlue((int)(blue*2.5));
         }
         }
         }
         
         
    
     }
     pic6.explore();
         
    }
    
     //how many pixels or how large array
    //System.out.println("This is a large array"+pixels.length  );


    /*
        //access each index
    System.out.println(pixels[17]);
    //access each pixel
    Pixel spot = ferris1.getPixel(100,100);
    
    System.out.println(pixels[17].getColor());
    System.out.println(spot);
/*
    pixels[17].setColor(Color.blue);
    spot.setColor(new Color(252,252,252));
    pixels[500034].setColor(Color.blue);

    ferris1.explore();
/*
   // loop to access indexes of array or collection

    //for each loop spot  is a ?
    for (Pixel spot : pixels)
    System.out.println( spot );


   
 /**/

 /**
  * Method to clear red from picture
  * @param none
  * @return none
  */
 /*
    for (Pixel pixelObj : pixels)
        {
            //set the red value of the current pixel to the new value
           

        }
    ferris1.explore();
    
/**/
 /**
  * Method to reduce red from picture by a factor of n
  * @param none
  * @return none
  */

/*
int value;
final double  FACTOR = .5;
    for (Pixel pixelObj : pixels)
    {

        //get the redvalue
        value = pixelObj.getRed();
        //System.out.println(value);

        //decrease the red value by 50%
        
        //set the red value of the current pixel to the new value
        

    }
    // use new picture when changing or it will make changes to 
    // pic you already changed
    ferris1.explore();
    ferris2.explore();

  /**/ 
  /**/
    //write/save a picture as a file
    //ferris1.write("images/ferris11.jpg");

    

}//main



/**
 * Method to mirror on a vertical line in the middle
 * of the picture based on the width
 */

public static void mirrorVertical(Picture source){
    int width = source.getWidth();
    int mirrorPoint = width/2;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    
    // loop thru all the rows
    for (int y = 0; y<source.getHeight(); y++){
        //loop from 0 to the middle(mirror Point)
        for (int x = 0; x<mirrorPoint; x++){
            leftPixel = source.getPixel(x,y);
            rightPixel = source.getPixel(width -1 -x,y);
            rightPixel.setColor(leftPixel.getColor());
        }
    }
    
    
    
}//mirrorVertical


public static void flip(Picture source){
    int height = source.getHeight();
    int mirrorPoint = height;
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    
    // loop thru all the rows
    for (int x = 0; x<source.getWidth(); x++){
        //loop from 0 to the middle(mirror Point)
        for (int y = 0; y<mirrorPoint; y++){
            topPixel = source.getPixel(x,y);
            bottomPixel = source.getPixel(x,height-1-y);
            topPixel.setColor(bottomPixel.getColor());
        }
    }
    
    
    
}

public static void big(Picture source, Picture target, int num1, int num2){
    Pixel sourcePix = null;
    Pixel targetPix = null;
    for (double sourceX = 0,targetX = num1; sourceX < source.getWidth()/2;sourceX+=0.5,targetX++){
        //loop thru the rows                                sourceY+=2 - smaller
        //                                                  sourceX +=.5 - larger, copy every pixel twice 
        for (double sourceY = 0,targetY = num2; sourceY < source.getHeight()/2;sourceY+=0.5,targetY++){
            sourcePix = source.getPixel((int)sourceX, (int)sourceY);
            targetPix = target.getPixel((int)targetX, (int)targetY);
            targetPix.setColor(sourcePix.getColor());
        }
    }
}

/**
 * copy one pic to another pic/canvas
 * add two ints to params place you want pic on the target
 */
public static void copytoCanvas(Picture source, Picture target, int num1, int num2){
    Pixel sourcePix = null;
    Pixel targetPix = null;
    
    //loop thru jcolumns (targetX is the starting point on the Canvas) sourceX+=2 - smaller copy every other pixel
                    //                                                  sourceX +=.5 - larger, copy every pixel twice cast as int in the getPixel & setColor
    for (int sourceX = 0,targetX = num1; sourceX < source.getWidth();sourceX++,targetX++){
        //loop thru the rows                                sourceY+=2 - smaller
        //                                                  sourceX +=.5 - larger, copy every pixel twice 
        for (int sourceY = 0,targetY = num2; sourceY < source.getHeight();sourceY++,targetY++){
            sourcePix = source.getPixel(sourceX, sourceY);
            targetPix = target.getPixel(targetX, targetY);
            targetPix.setColor(sourcePix.getColor());
        }
    }
}


public static void mirrorVertical2(Picture source){
    int width = source.getWidth();
    int mirrorPoint = width/2;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    
    // loop thru all the rows
    for (int y = 0; y<(source.getHeight()/4); y++){
        //loop from 0 to the middle(mirror Point)
        for (int x = 0; x<mirrorPoint; x++){
            leftPixel = source.getPixel(x,y);
            rightPixel = source.getPixel(width -1 -x,y);
            rightPixel.setColor(leftPixel.getColor());
        }
    }
    
    
    
}











//class
}