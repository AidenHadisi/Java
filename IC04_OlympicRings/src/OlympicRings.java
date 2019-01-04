import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JApplet;

/*
 * Hadisi, Aiden
 * CS A170
 * February 10, 2017
 * IC #04 Olympic Rings
 */
   public class OlympicRings extends JApplet{

    public void init()
    //init = initialize the size of your Apllet 
    
    { 
        setSize(300,150);
        // width, height
    }
    
    public void paint(Graphics canvas)
    // Import Graphics
    // Draw our first Olympic circle
    // Everything will go on the canvas. Draw everything on the canvas.
    
    {
        // Change the color first to blue: 
        // to cahnge the thickness of the line
        Graphics2D canvas2D = (Graphics2D) canvas;
        canvas2D.setStroke(new BasicStroke(6));
        canvas.setColor(Color.BLUE);
        // You need to change the color before you draw the shape.
        // x value, Y value, width, height
        // x and y are the top left corner of the circle.
        canvas.drawOval(20, 20, 75, 75);
        canvas.setColor(Color.BLACK);
        canvas.drawOval(110, 20, 75, 75);
        canvas.setColor(Color.RED);
        canvas.drawOval(200, 20, 75, 75);
        canvas.setColor(Color.YELLOW);
        canvas.drawOval(65, 60, 75, 75);
        canvas.setColor(Color.GREEN);
        canvas.drawOval(155, 60, 75, 75);
        
       
       
    }
    

}
