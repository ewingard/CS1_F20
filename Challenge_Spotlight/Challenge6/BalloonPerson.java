package balloonpeople;

import painter.SPainter;
import shapes.SCircle;

import java.awt.*;
import java.util.Random;

public class BalloonPerson {
    private String name;
    private int age;
    private int height;
    private Color color;

    public BalloonPerson(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
        Random rgen = new Random();
        color = new Color(rgen.nextInt(255), rgen.nextInt(255), rgen.nextInt(255));
    }

    public String toString() {
        return name + ", age: " + age + " years old, height in inches: " + height;
    }

    public void paint(SPainter miro) {
        SCircle balloon = new SCircle(height * 2);
        SCircle face = new SCircle(height);
        miro.setColor(color);
        miro.paint(balloon);

        //this is the mouth part
        miro.mbk(balloon.radius() * 0.6);
        face.shrink(height / 2);
        miro.setColor(color.BLACK);
        miro.paint(face);
        miro.mfd(balloon.radius() * 0.6);

        //white parts of eyes

        face.expand(height / 2);
        miro.mlt(balloon.radius() / 2.5);
        miro.mfd(balloon.radius() / 6);
        miro.setColor(color.WHITE);
        miro.paint(face); //right eye
        miro.mrt(balloon.radius() / 1.25);
        miro.paint(face); //left eye
        miro.mlt(balloon.radius() / 1.25);
        miro.mbk(balloon.radius() / 6);

        //black parts of eyes
        miro.setColor(color.BLACK);
        face.shrink(height / 2);
        miro.mfd(balloon.radius() / 6);
        miro.paint(face);
        miro.mrt(balloon.radius() / 1.25);
        miro.paint(face);
        miro.mbk(balloon.radius() / 6);
        miro.mlt(balloon.radius() / 1.25);
    }

    public int getHeight() {
        return height;
    }
}
