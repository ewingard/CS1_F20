/* 
 * Program that paints 100 red, yellow, and orange balloons in a blue sky. 
 * It will feature commands. 
 */

 package npw;

 import painter.SPainter;
 import shapes.SCircle;
 import shapes.SSquare;
 import javax.swing.*;
 import java.awt.*;
 import java.util.Random;
 
 public class Balloons {
 
     //REQUIRED INFRASTRUCTURE
 
     public Balloons() {
         paintTheImage();
     }
 
     public static void main(String[] args) {
         SwingUtilities.invokeLater(new Runnable() {
             @Override
             public void run() {
                 new Balloons();
             }
         });
     }
     // THE PAINTER DOING ITS THING
     private void paintTheImage() {
         SPainter painter = new SPainter("Balloons", 6000, 600);
         paintSky(painter);
         int nrOfBalloons = 100;
         paintBalloons(painter, nrOfBalloons);
     }
 
     private void paintBalloons(SPainter painter, int nrOfBalloons) {
         int i = 1;
         while (i <= nrOfBalloons) {
             paintOneBalloon(painter);
             i = i + 1;
         }
     }
 
     private void paintOneBalloon(SPainter painter) {
         Random rgen = new Random();
         int rn = rgen.nextInt(3);
         if (rn == 0) {
             painter.setColor(Color.RED);
         } else if (rn == 1) {
             painter.setColor(Color.ORANGE);
         } else {
             painter.setColor(Color.YELLOW);
         }
         painter.move();
         int balloonRadius = 20;
         SCircle balloon = new SCircle(balloonRadius);
         painter.paint(balloon);
         painter.setColor(Color.BLACK);
         painter.draw(balloon);
     }
 
     private void paintSky(SPainter painter) {
         painter.setColor(Color.BLUE);
         SSquare sky = new SSquare(2000);
         painter.paint(sky);
     }
 } 