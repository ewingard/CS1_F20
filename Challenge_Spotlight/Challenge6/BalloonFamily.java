package balloonpeople;

import painter.SPainter;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class BalloonFamily {
    private ArrayList<BalloonPerson> balloonFam;

    public BalloonFamily(int numOfBalloonPpl) {
        balloonFam = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numOfBalloonPpl; i++) {
            String command1 = JOptionPane.showInputDialog(null, "Name?");
            String command2 = JOptionPane.showInputDialog(null, "Age?");
            String command3 = JOptionPane.showInputDialog(null, "Height?");
            int y = Integer.parseInt(command2);
            int z = Integer.parseInt(command3);
            //String command1 = "egg";
            //int y = 68;
            //int z = 50;
            BalloonPerson balloonPerson = new BalloonPerson(command1, y, z);
            balloonFam.add(balloonPerson);
        }
    }
    public void paint(SPainter miro) {
        miro.moveToCenter();
        //miro.mlt(900/balloonFam.size()*1.875);
        //miro.mlt(450-(900/(balloonFam.size() + 1)));)
        BalloonPerson middle = balloonFam.get(balloonFam.size()/2);
        middle.paint(miro);
        BalloonPerson right = balloonFam.get(2);
        BalloonPerson left = balloonFam.get(0);
        //double number = 450-(middle.getHeight()*2);
        double number = (225+middle.getHeight());
        //double number2 = 450+(middle.getHeight()*2);
        double number2 = (225+middle.getHeight());
        miro.moveToCenter();
        miro.mrt(number);
        right.paint(miro);
        miro.moveToCenter();
        miro.mlt(number2);
        left.paint(miro);
        //for (int i = (balloonFam.size()/2)+ 1; i < balloonFam.size(); i ++) {
            //BalloonPerson temp = balloonFam.get(i);
            //miro.mrt(number+middle.getHeight());
            //temp.paint(miro);
            //miro.moveToCenter();
        // }
        //for (int i = (balloonFam.size()/2)-1; i < balloonFam.size(); i--) {
            //BalloonPerson temp = balloonFam.get(i);
            //miro.mlt(number2+middle.getHeight());
            //temp.paint(miro);
            //miro.moveToCenter();
        //}
    }

    public String toString() {
        for (int i = 0; i < balloonFam.size(); i++) {
            balloonFam.get(i).toString();
        }
        String temp = balloonFam.toString();
        return temp;
    }
}
