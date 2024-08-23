package balloonpeople;

import painter.SPainter;

import javax.swing.*;

public class BalloonPersonTester {

    public BalloonPersonTester(){
        BalloonPerson egg = new BalloonPerson("egg", 166, 20);
        SPainter miro = new SPainter("Balloon Person: Egg", 300, 300 );
        egg.paint(miro);
        System.out.println(egg);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new BalloonPersonTester();
            }
        });
    }
}
