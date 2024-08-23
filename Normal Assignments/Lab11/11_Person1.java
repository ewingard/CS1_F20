/* 
 * Person1Demo is a simple program to create and textually display Person 
 * objects. 
 */

 package people;

 public class Person1Demo {
 
     public static void main(String[] args) {
 
         //CREATE THE SIX PERSON OBJECTS
         Person bd = new Person("Bob Dylan", 5, 24, 1941);
         Person nr = new Person("Noomi Rapace", 12, 28, 1974);
         Person pr = new Person("Pharrell Williams", 3, 5, 1973);
         Person fs = new Person("Frank Sinatra", 12, 12, 1915);
         Person dk = new Person("Diana Krall",11, 16, 1964);
 
         //DISPLAY THE SIX PERSON OBJECTS TO THE STANDARD OUTPUT STREAM
         System.out.println(bd + " " + bd.initials() + " " + bd.isBoomer());
         System.out.println(nr + " " + nr.initials() + " " + nr.isBoomer());
         System.out.println(pr + " " + pr.initials() + " " + pr.isBoomer());
         System.out.println(fs + " " + fs.initials() + " " + fs.isBoomer());
         System.out.println(dk + " " + dk.initials() + " " + dk.isBoomer());
     }
 }
 