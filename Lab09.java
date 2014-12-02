/**
 * A robot moves along a row, collecting piles of beepers and placing them one square to
 * the right.
 * 
 * @author <...>
 * @version <...>
 *
 */

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;  
import javax.swing.JOptionPane;

public class Lab09 {
	 
	 public static void main(String[] args) {
		 String map = JOptionPane.showInputDialog("Which map?");
		 Display.openWorld("maps/"+map+".map");
		 Display.setSize(10, 10);
       Display.setSpeed(5);
		 Athlete alex = new Athlete(1, 1, Display.EAST, 0);
        
       alex.move();
       alex.move();
       alex.move();
       alex.move();
       alex.move();
       alex.move();
       
       for (int k = 1; k <= 7; k++) {
       int count = 0;
       while (alex.nextToABeeper()){
       alex.pickBeeper();
       count++;}
       alex.move();
       for (int g = 1; g <= count; count--){
       alex.putBeeper();}
       alex.turnAround();
       if (alex.frontIsClear()) {
       alex.move();}
       if (alex.frontIsClear()) {
       alex.move();}
       alex.turnAround();}
       alex.turnAround();   
  }
}