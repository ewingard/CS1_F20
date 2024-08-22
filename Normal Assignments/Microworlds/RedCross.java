/* 
    * This is my attempt at creating the RedCross program 
    * for the 1st Programming Challenge 
*/

    package npw;

    import painter.SPainter;
    import shapes.SRectangle;

    import javax.swing.SwingUtilities;
    import java.awt.Color;

    public class RedCross {

// THE SOLUTION TO THE RED CROSS PROBLEM
    private void paintTheImage() {
        SPainter klee = new SPainter("Red Cross", 600, 600);
        SRectangle cross = new SRectangle(500, 100);
        klee.setColor(Color.RED);
        klee.paint(cross);
        klee.tr(90);
        klee.paint(cross);
} 
// REQUIRED INFRASTRUCTURE

    public RedCross() {
        paintTheImage();
    }
    public static void main(String[] args) {
               SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                new RedCross();
        }
        });
    }
}