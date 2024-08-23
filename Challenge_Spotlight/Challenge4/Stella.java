package npw;

import painter.SPainter;
import shapes.SSquare;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Stella {
    public static void main(String[] args) {
        String nss = JOptionPane.showInputDialog(null,  "Number of squares?");
        Scanner scanner = new Scanner(nss);
        double number = scanner.nextInt();
        SPainter miro = new SPainter("Stella squares", 800, 800);
        Color random1 = randomColor();
        Color random2 = randomColor();
        SSquare square = new SSquare(700);
        double shrinkFactor = 700/(number+1);
        int i = 1;
        while (i <= number) {
            if (i % 2 == 0) {
                miro.setColor(random2);
            } else {
                miro.setColor(random1);
            }
            miro.paint(new SSquare(700-(shrinkFactor * i)));
            i = i + 1;
        }
    }

    private static Color randomColor() {
        Random rgen = new Random();
        int r = rgen.nextInt(256);
        int g = rgen.nextInt(256);
        int b = rgen.nextInt(256);
        return new Color(r, b, g);
    }

    private static void paintOneSquare(SPainter miro, SSquare square) {
        miro.setColor(Color.RED);
        miro.paint(square);
        // squared.shrink(70);
        SSquare squared2 = new SSquare(630);
        miro.setColor(Color.BLUE);
        miro.paint(squared2);
    }
}
