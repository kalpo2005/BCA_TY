/**
* (6) Create a java package Games, which have 2 classes Indoor and Outdoor. Use a 
function display() to generate the list of players for the specific games.   
*/

import java.util.Scanner;
import Game.Indoor;
import Game.Outdoor;

class Assign6{
	
	public static void main(String[] args){
		Indoor kal = new Indoor();
		Outdoor bav = new Outdoor();
	
		kal.display();
		bav.display();
	}
}