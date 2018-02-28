package rishman;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;

public class ImageReader
{

  public ImageReader()
  {
      Scanner sc = new Scanner(System.in);
	   System.out.println("Enter Server File Path :-");
	   String serverFile=sc.nextLine();
    try
    {
      // the line that reads the image file
      BufferedImage image = ImageIO.read(new File(serverFile));
      image.hashCode();

      // work with the image here ...
    } 
    catch (IOException e)
    {
      // log the exception
      // re-throw if desired
    }
  }


}