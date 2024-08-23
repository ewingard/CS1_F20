/* 
 * Program to paint a rectangle, centered in the canvas, made up of randomly 
 * colored circles that are spaced evenly. 
 *//* 
 * Program to paint a rectangle, centered in the canvas, made up of randomly 
 * colored, black framed circles, but this time they are spaced evenly. 
 */

 package npw;

 import painter.SPainter;
 import shapes.SCircle;
 
 import javax.swing.*;
 import java.awt.*;
 import java.util.Random;
 import java.util.Scanner;
 
 public class Number3 {
     // The solution to the graphical problem.
     private void paintTheImage() {
         // Get the input information fron the user.
         int nrOfRows = getNumber("rows");
         int nrOfColumns = getNumber("columns");
         int sizeOfSquare = getNumber("circle radius length");
         // Establish the painter.
         int height = (nrOfRows * sizeOfSquare);
         int width = (nrOfColumns * sizeOfSquare);
         SPainter miro = new SPainter("Number 1", (width *2)+ 50, (height * 2) + 50);
         miro.setBrushWidth(4);
         SCircle circle = new SCircle(sizeOfSquare);
         // Paint the rectangles.
         paintRectangle(miro, circle, nrOfRows, nrOfColumns);
     }
 
     private static int getNumber(String prompt) {
         String nss = JOptionPane.showInputDialog(null, prompt + "?");
         Scanner scanner = new Scanner(nss);
         return scanner.nextInt();
     }
 
     private static void paintRectangle(SPainter miro, SCircle circle,
                                        int nrOfRows, int nrOfColumns) {
         // Position the painter to paint the rectangle of circles.
         miro.mlt(((nrOfColumns - 1) / 2.0) * circle.radius() * 2); //changed to diameter shifted left
         miro.mbk(((nrOfRows - 1) / 2.0) * circle.radius() * 2); //changed to diameter shifted it down
         // Paint the rectangle of circles.
         int i = 1;
         while (i <= nrOfRows) {
             paintOneRow(miro, nrOfColumns, circle);
             miro.mfd(circle.diameter());
             i = i + 1;
         }
         // Make the method invariant with respect to painter position.
         miro.mrt(((nrOfColumns - 1) / 2.0) * circle.radius());
         miro.mfd(((nrOfRows - 1) / 2.0) * circle.radius());
     }
 
     private static void paintOneRow(SPainter miro, int nrOfColumns, SCircle circle) {
         int i = 1;
         while (i <= nrOfColumns) {
             paintOneCircle(miro, circle);
             miro.mrt(circle.diameter()); //moved over too much when * 1.5
             i = i + 1;
         }
         miro.mlt(nrOfColumns * circle.diameter());
     }
 
     private static void paintOneCircle(SPainter miro, SCircle circle) {
         miro.setColor(randomColor());
         circle.shrink(circle.radius()/2);
         miro.paint(circle);
         circle.expand(circle.radius());
     }
 
     private static Color randomColor() {
         Random rgen = new Random();
         int r = rgen.nextInt(256);
         int g = rgen.nextInt(256);
         int b = rgen.nextInt(256);
         return new Color(r, b, g);
     }
 
     public Number3() {
         paintTheImage();
     }
 
     public static void main(String[] args) {
         SwingUtilities.invokeLater(new Runnable() {
             @Override
             public void run() {
                 new Number3();
             }
         });
     }
 }
 