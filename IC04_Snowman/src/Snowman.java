import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JApplet;

/*
 * Hadisi, Aiden
 * CS A170
 * February 19, 2017
 * IC #04 Snowman
 */
public class Snowman extends JApplet
{


	public void init()
    {
        setSize(300, 500);
         
    }
    
    public void paint(Graphics canvas)
    {
        Graphics2D canvas2D=(Graphics2D) canvas;
        canvas2D.setStroke(new BasicStroke(2));
        canvas.drawOval(75, 325, 150, 150);
        canvas.drawOval(100, 226, 100, 100);
        canvas.drawOval(110, 151, 75, 75);
        canvas.fillOval(130, 170, 14, 14);
        canvas.fillOval(150, 170, 14, 14);
        canvas.drawArc(133, 182, 30, 30, 200, 150);

       
    }
    

}
