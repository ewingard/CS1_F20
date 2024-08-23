package expressions;

import shapes.SCircle;
import shapes.SRectangle;
import shapes.SSquare;

public class WorkArea {
    public static void main(String[] args) {
        // Desk and desk items
        SRectangle books = new SRectangle(7, 10);
        SRectangle desk = new SRectangle(26, 60);
        SCircle cans = new SCircle(1.25);
        SCircle plates = new SCircle(5.5);
        SSquare coaster = cans.circumscribingSquare();
        // Areas below
        double collectiveDeskArea = ((books.area() * 2) + desk.area() + (plates.area() * 5) + (coaster.area() * 3));
        double deskAreaUnderMess = (desk.area() - ((books.area() * 2) + (plates.area() * 5) + (coaster.area() * 3)));
        //Outputs
        System.out.println("Collective desk area = " + collectiveDeskArea);
        System.out.println("Desk area under the mess = " + deskAreaUnderMess);
    }
}
