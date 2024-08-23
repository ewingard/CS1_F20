/* 
    * Program to paint a blue dot in the context of a Nonrepresentational 
    * Painting World, NPW 
*/

package npw;

import painter.SPainter;
import shapes.SCircle;
import javax.swing.SwingUtilities;
import java.awt.Color;

public class BlueDot {
    private void paintTheImage() {
        SPainter klee = new SPainter("Blue Dot", 600, 600);
        SCircle dot = new SCircle(200);
        klee.setColor(Color.BLUE);
        klee.paint(dot);
    }

    public BlueDot() {
        paintTheImage();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BlueDot();
            }
        });
    }
}