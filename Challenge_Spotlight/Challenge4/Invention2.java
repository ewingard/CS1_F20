package npw;

import painter.SPainter;
import shapes.SRectangle;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Invention2 {
    private void interpreter() {
        //CREATE OBJECTS TO THINK WITH
        SPainter miro = new SPainter("Dot Thing", 400, 400);
        paintRotation(miro);
    }

    private static void paintRotation(SPainter miro){
        int i = 0;
        miro.mlt(150);
        SRectangle rect = new SRectangle(300, 100);
        miro.paint(rect);

        while (i < 10) {
            miro.mrt(50);
            Random rgen = new Random();
            int r = rgen.nextInt(256);
            int g = rgen.nextInt(256);
            int b = rgen.nextInt(256);
            miro.setColor(new Color(r, g, b));
            if (i == 6) {
                miro.setColor(Color.BLACK);
                miro.paint(rect);
            }
            miro.paint(rect);
            i = i + 1;
        }
    }

    //INFRASTRUCTURE FOR SOME SIMPLE PAINTING

    public Invention2() {
        interpreter();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run () {
                new Invention2();
            }
        });
    }
}
