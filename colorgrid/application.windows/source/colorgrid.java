import processing.core.*; 
import processing.xml.*; 

import java.applet.*; 
import java.awt.Dimension; 
import java.awt.Frame; 
import java.awt.event.MouseEvent; 
import java.awt.event.KeyEvent; 
import java.awt.event.FocusEvent; 
import java.awt.Image; 
import java.io.*; 
import java.net.*; 
import java.text.*; 
import java.util.*; 
import java.util.zip.*; 
import java.util.regex.*; 

public class colorgrid extends PApplet {

float x=0;
float y=0;

public void setup()
{
  size(500,500);
  background(255);
  smooth();
  noStroke();
  frameRate(3);
}
public void draw()
{
  for(x = 0; x < width; x+=10){
    for (y = 0; y < height; y+=10){
      float r= random(255);
      float b= random(255);
      float g= random(255);
      fill(r,b,g);
      rect(x,y,10,10);
    }
  }
}
  static public void main(String args[]) {
    PApplet.main(new String[] { "--bgcolor=#F0F0F0", "colorgrid" });
  }
}
