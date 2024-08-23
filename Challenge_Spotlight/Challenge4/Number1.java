/* 
 * Program to paint a rectangle, centered in the canvas, made up of randomly 
 * colored, black framed squares. 
 */

 package npw;

 import painter.SPainter;
 import shapes.SSquare;
 
 import javax.swing.*;
 import java.awt.*;
 import java.util.Random;
 import java.util.Scanner;
 
 public class Number1 {
     // The solution to the graphical problem.
    private void paintTheImage() {
         // Get the input information fron the user.
         int nrOfRows = getNumber("rows");
         int nrOfColumns = getNumber("columns");
         int sizeOfSquare = getNumber("square side length");
         // Establish the painter.
         int height = nrOfRows * sizeOfSquare;
         int width = nrOfColumns * sizeOfSquare;
         SPainter miro = new SPainter("Number 1", width + 50, height + 50);
         miro.setBrushWidth(4);
         SSquare square = new SSquare(sizeOfSquare);
         // Paint the rectangles.
         paintRectangle(miro, square, nrOfRows, nrOfColumns);
     }
 
    private static int getNumber(String prompt) {
         String nss = JOptionPane.showInputDialog(null, prompt + "?");
         Scanner scanner = new Scanner(nss);
         return scanner.nextInt();
     }
 
    private static void paintRectangle(SPainter miro, SSquare square,
                                        int nrOfRows, int nrOfColumns) {
         // Position the painter to paint the rectangle of squares.
        miro.mlt(((nrOfColumns - 1) / 2.0) * square.side());
        miro.mbk(((nrOfRows - 1) / 2.0) * square.side());
        // Paint the rectangle of squares.
        int i = 1;
        while ( i <= nrOfRows) {
            paintOneRow(miro,nrOfColumns,square);
            miro.mfd(square.side());
            i = i + 1;
        }
         // Make the method invariant with respect to painter position.
         miro.mrt(((nrOfColumns-1)/2.0) * square.side());
         miro.mfd(((nrOfRows-1)/2.0) * square.side());
        }

    private static void paintOneRow(SPainter miro, int nrOfColumns, SSquare square) {
        int i = 1;
        while ( i <= nrOfColumns ) {
            paintOneSquare(miro,square);
            miro.mrt(square.side());
            i = i + 1;
        }
        miro.mlt(nrOfColumns*square.side());
    }
        
    private static void paintOneSquare(SPainter miro, SSquare square) {
        miro.setColor(randomColor());
        miro.paint(square);
        miro.setColor(Color.BLACK);
        miro.draw(square);
    }
    
    private static Color randomColor() {
        Random rgen = new Random();
        int r = rgen.nextInt(256);
        int g = rgen.nextInt(256);
        int b = rgen.nextInt(256);
        return new Color(r,b,g);
    }
    
    public Number1(){
        paintTheImage();
    }
    
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Number1();
            }
        });
    }
}