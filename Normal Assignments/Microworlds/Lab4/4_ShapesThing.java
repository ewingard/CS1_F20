/* 
 * This program will allow me to solve geometric problems by making and using shapes 
 */
package expressions;

import shapes.SCircle;
import shapes.SSquare;

public class ShapesThing {
    public static void main(String[]args) {
        SSquare square = new SSquare(400);
        System.out.println("square = " + square.toString());
        System.out.println("area of square = " + square.area());
        System.out.println("perimeter of square = " + square.perimeter());
        System.out.println("diagonal of square = " + square.diagonal());

        //Computations on a Circle
        SCircle disk = square.inscribingCircle();
        System.out.println("disk = " + disk.toString());
        System.out.println("area of disk = " + disk.area());
        System.out.println("perimeter of disk = " + disk.perimeter());

        //Another square
        SSquare diamond = disk.inscribingSquare();
        System.out.println("diamond = " + diamond.toString());
        System.out.println("diamond = " + diamond.area());
    }
}
