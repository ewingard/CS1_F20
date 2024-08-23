package npw;

import painter.SPainter;
import shapes.SCircle;
import shapes.SSquare;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Invention1 {
    private void interpreter() {
        //CREATE OBJECTS TO THINK WITH
        Color color = newColor();
        Color color2 = newColor();
        SPainter miro = new SPainter("Dot Thing", 400, 400);
        miro.setScreenLocation(0, 0);
        SCircle dot = new SCircle(90);
        SSquare square = new SSquare(180);
        paint(miro, dot, square, color, color2);
    }

    private static Color newColor() {
        String nss = JOptionPane.showInputDialog(null, "Color?");
        Scanner scanner = new Scanner(nss);
        // String command = JOptionPane.showInputDialog(null, "Color?");
        int i = 0;
        while (i <= 1) {
            System.out.println("Color time!");
            i = i + 1;
        }
        String command = scanner.nextLine();
        if (command == null) {
            command = "exit";
        } //user clicked on Cancel
        if (command.equalsIgnoreCase("blue")) {
            return (Color.BLUE);
        } else if (command.equalsIgnoreCase("red")) {
            return (Color.RED);
        } else if (command.equalsIgnoreCase("green")) {
            return (Color.GREEN);
        } else if (command.equalsIgnoreCase("yellow")) {
            return (Color.YELLOW);
        } else {
            return(Color.BLACK);
        }
    }


    private static void paint(SPainter miro, SCircle dot, SSquare square, Color color, Color color2) {
        miro.setColor(color);
        miro.paint(square);
        miro.setColor(color2);
        miro.paint(square.inscribingCircle());
        miro.setColor(color);
        dot.shrink(20);
        miro.paint(dot);
        miro.setColor(color2);
        dot.shrink(40);
        miro.paint(dot);

    }


    //INFRASTRUCTURE FOR SOME SIMPLE PAINTING

    public Invention1() {
        interpreter();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run () {
                new Invention1();
            }
        });
    }
}
