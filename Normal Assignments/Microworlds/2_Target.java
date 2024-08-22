/* 
 * Program to paint the Target symbol instead of the Blue Dot 
 * in the context of a Nonrepresentational Painting World, NPW 
 */

 package npw;

 import painter.SPainter;
 import shapes.SCircle;
 import javax.swing.SwingUtilities;
 import java.awt.Color;
 
 public class Target {
 
     // THE SOLUTION TO THE BLUE DOT PROBLEM
     private void paintTheImage() {
         SPainter klee = new SPainter("Target", 600, 600);
         SCircle target = new SCircle(200);
         SCircle white = new SCircle(150);
         SCircle middle = new SCircle(75);
         klee.setColor(Color.RED);
         klee.paint(target);
         klee.setColor(Color.white);
         klee.paint(white);
         klee.setColor(Color.RED);
         klee.paint(middle);
     }
     // REQUIRED INFRASTRUCTURE
 
     public Target() {
         paintTheImage();
     }
     public static void main(String[] args) {
         SwingUtilities.invokeLater(new Runnable() {
             @Override
             public void run() {
                 new Target();
             }
         });
     }
 }
 