
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
     Picture pic6 = new Picture("images\\newpic.jpg");
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
     shrink(pic6,pic6,1275,715);

     pic6.explore();
     acanvas.explore();
    

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



/**
 * copy one pic to another pic/canvas
 * add two ints to params place you want pic on the target
 */
public static void copytoCanvas(Picture source, Picture target, int num1, int num2){
    Pixel sourcePix = null;
    Pixel targetPix = null;
    
    //loop thru jcolumns (targetX is the starting point on the Canvas) sourceX+=2 - smaller copy every other pixel
                    //                                                  sourceX +=.5 - larger, copy every pixel twice cast as int in the getPixel & setColor
    for (int sourceX = 0,targetX = num1; sourceX < source.getWidth()/2;sourceX++,targetX++){
        //loop thru the rows                                sourceY+=2 - smaller
        //                                                  sourceX +=.5 - larger, copy every pixel twice 
        for (int sourceY = 0,targetY = num2; sourceY < source.getHeight()/2;sourceY++,targetY++){
            sourcePix = source.getPixel(sourceX, sourceY);
            targetPix = target.getPixel(targetX, targetY);
            targetPix.setColor(sourcePix.getColor());
        }
    }
}

public static void shrink(Picture source, Picture target, int num1, int num2){
    Pixel sourcePix = null;
    Pixel targetPix = null;

    //loop thru jcolumns (targetX is the starting point on the Canvas) sourceX+=2 - smaller copy every other pixel
                    //                                                  sourceX +=.5 - larger, copy every pixel twice cast as int in the getPixel & setColor
    if (source.getWidth()>100&&source.getHeight()>100){
    for (double sourceX = 0,targetX = num1; sourceX < source.getWidth();sourceX+=2,targetX++){
        //loop thru the rows                                sourceY+=2 - smaller
        //                                                  sourceX +=.5 - larger, copy every pixel twice 
        for (double sourceY = 0,targetY = num2; sourceY < source.getHeight();sourceY+=2,targetY++){
            System.out.println(sourceX + " " + targetX);
            System.out.println(sourceY + " " + targetY);
            sourcePix = source.getPixel((int)sourceX, (int)sourceY);
            targetPix = target.getPixel((int)targetX, (int)targetY);
            targetPix.setColor(sourcePix.getColor());
        
        }
    }
    shrink(source, target, (int)source.getWidth()/2, (int)source.getHeight()/2);
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
}










//class
