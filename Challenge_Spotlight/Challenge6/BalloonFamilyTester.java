package balloonpeople;

import painter.SPainter;

import javax.swing.*;

public class BalloonFamilyTester {

    public BalloonFamilyTester(){
        BalloonFamily person1 = new BalloonFamily(3);
        SPainter miro = new SPainter("Balloon Family", 900, 900 );
        person1.paint(miro);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new BalloonFamilyTester();
            }
        });
    }
}
