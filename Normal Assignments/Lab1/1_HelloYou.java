/* 
*Traditional starter program. 
*/  

package greetings;

import javax.swing.JOptionPane; 

public class HelloYou {
  public static void main(String[] args) {
    String name = JOptionPane.showInputDialog(null, "Who are you?");
    System.out.println("Hello, " + name + "!" );
  }

} 
