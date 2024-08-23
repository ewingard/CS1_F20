package expressions;

import shapes.SCircle;
import shapes.SSquare;

public class GreySpace {
    public static void main(String[] args) {
        double tableclothLength = 750.0;
        SSquare tableClothLengthForArea = new SSquare(tableclothLength);
        double yellowDiameter = (750.0 - (2 * 60.0));
        SCircle inscribingYellowDiamond = new SCircle(yellowDiameter / 2.0);
        SSquare yellowSquare = inscribingYellowDiamond.inscribingSquare();
        double grayDiameter = (yellowSquare.side() - (2 * 45.0));
        SCircle inscribingGrayCircle = new SCircle(grayDiameter / 2.0);
        SSquare graySquare = inscribingGrayCircle.inscribingSquare();
        double totalGrayArea = ((tableClothLengthForArea.area() + graySquare.area()) - yellowSquare.area());
        System.out.println("Total Gray Area of the tablecloth = " + totalGrayArea);
    }
}
