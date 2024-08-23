package npw;

import painter.SPainter;
import shapes.SCircle;
import shapes.SSquare;

import javax.swing.*;
import java.awt.*;

/* 
 * Program to paint the Kanizsa Square for programming challenge 2 
 */

public class KanizsaSquare {

    // THE SOLUTION TO THE KANIZSA SQUARE PROBLEM
    private void paintTheImage() {
        SPainter klee = new SPainter("Kanizsa Square", 400, 400);
        SCircle dot = new SCircle(75);
        paintBlueCircle(klee, dot);
        paintRedCircle(klee, dot);
        paintGreenCircles(klee, dot);

        SSquare square = new SSquare(200);
        paintWhiteSquare(klee, square);
    }

    private void paintWhiteSquare(SPainter klee, SSquare square) {
        klee.setColor(Color.white);
        klee.moveToCenter();
        klee.paint(square);
    }

    private void paintRedCircle(SPainter klee, SCircle dot) {
        klee.setColor(Color.RED);
        klee.moveToCenter();
        klee.mbk(100);
        klee.mrt(100);
        klee.paint(dot);
    }

    private void paintGreenCircles(SPainter klee, SCircle dot) {
        klee.setColor(Color.GREEN);
        klee.moveToCenter();
        klee.mbk(100);
        klee.mlt(100);
        klee.paint(dot);
        klee.moveToCenter();
        klee.mfd(100);
        klee.mrt(100);
        klee.paint(dot);
    }

    private void paintBlueCircle(SPainter klee, SCircle dot) {
        klee.setColor(Color.BLUE);
        klee.moveToCenter();
        klee.mlt(100);
        klee.mfd(100);
        klee.paint(dot);
    }

    // REQUIRED INFRASTRUCTURE

    public KanizsaSquare() {
        paintTheImage();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new KanizsaSquare();
            }
        });
    }
}
