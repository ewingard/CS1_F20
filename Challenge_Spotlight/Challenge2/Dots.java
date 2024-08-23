/* 
 * Program to paint a blue dot in the context of a Nonrepresentational 
 * Painting World, NPW 
 */

 package npw;

 import painter.SPainter;
 import shapes.SCircle;
 import javax.swing.SwingUtilities;
 import java.awt.Color;
 
 public class Dots {
 
     // THE SOLUTION TO THE BLUE DOT PROBLEM
     private void paintTheImage() {
         SPainter klee = new SPainter("Dots", 600, 600);
         // AREA TO THE RIGHT OF THE Y AXIS
         SCircle dot3 = new SCircle(15);
         SCircle dot = new SCircle(25);
         SCircle dot2 = new SCircle(35);
         SCircle dot4 = new SCircle(45);
         klee.setColor(Color.BLUE);
         klee.mrt(150);
         klee.paint(dot3);
         klee.mrt(100);
         klee.setRandomGreenColor();
         klee.paint(dot2);
         klee.setColor(Color.BLUE);
         klee.mlt(100);
         klee.mfd(150);
         klee.paint(dot4);
         klee.mbk(300);
         klee.paint(dot);
 
         // AREA TO THE LEFT OF THE Y AXIS
         klee.setColor(Color.BLUE);
         klee.moveToCenter();
         klee.mlt(150);
         klee.paint(dot3);
         klee.mlt(100);
         klee.paint(dot2);
         klee.mrt(100);
         klee.mfd(150);
         klee.paint(dot4);
         klee.mbk(300);
         klee.setColor(Color.yellow);
         klee.paint(dot);
         klee.mlt(100);
         klee.setColor(Color.white);
         klee.paint(dot2);
     }
 
     // REQUIRED INFRASTRUCTURE
     public Dots() {
         paintTheImage();
     }
 
     public static void main(String[] args) {
         SwingUtilities.invokeLater(new Runnable() {
             @Override
             public void run() {
                 new Dots();
             }
         });
     }
 } 