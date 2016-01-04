/**
 * Write a description of GreyScaleConverter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import edu.duke.* ;
import java.io.File ;

public class GreyScaleConverter {

    public ImageResource makeGray(ImageResource inImage){
        //New blank image same size as input impage
        ImageResource outImage = new ImageResource(inImage.getWidth(), inImage.getHeight());
        for (Pixel pixel : outImage.pixels()){
            Pixel inPixel  = inImage.getPixel(pixel.getX(), pixel.getY());
            int pixAve = (inPixel.getRed() + inPixel.getBlue() + inPixel.getGreen()) / 3;
            pixel.setRed(pixAve);
            pixel.setBlue(pixAve);
            pixel.setGreen(pixAve);
        }
        return outImage;
    }
    
    public void selectAndConvert(){
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()){
            ImageResource inImage = new ImageResource(f);
            ImageResource grey = makeGray(inImage);
            grey.draw();
        }
    }
}
