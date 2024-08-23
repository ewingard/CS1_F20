package expressions;

import shapes.SRectangle;

import javax.swing.*;
import java.util.Scanner;

public class ShippingContainer {
    private void paintTheImage() {
        //STOP! SCANNER TIME
        Scanner scanner = new Scanner(System.in);
        //PROMPT FOR SCANNER
        System.out.println("Please enter height...");
        int height = scanner.nextInt();
        System.out.println("Please enter width...");
        int width = scanner.nextInt();
        System.out.println("Please enter length...");
        int length = scanner.nextInt();

        //fuck idk at this point
        SRectangle face = new SRectangle(height, width);
        System.out.println(face);
        double diagonalOfFace = face.diagonal();
        SRectangle key = new SRectangle(diagonalOfFace, length);
        double diagonalOfKey = key.diagonal();
        System.out.println("Key distance = " + diagonalOfKey);
    }

    public ShippingContainer() {
        paintTheImage();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ShippingContainer();
            }
        });
    }
}
