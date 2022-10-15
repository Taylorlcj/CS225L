// *************************************
// Class: SnakesAndLaddersController
// Author: Taylor Jensen
// Created: Oct 14, 2022
// Modfied: na
//
// Purpose:
//
// **********************************************
public class SnakesAndLaddersController {

	public static void main(String[] args) {

		Board b1 = new Board();
		
		//Snakes and ladders game
		while(!b1.gameOver()){
			b1.playTurn();
		}
		
	}

	

}
