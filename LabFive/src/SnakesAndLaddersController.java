
public class SnakesAndLaddersController {

	public static void main(String[] args) {

		Board b1 = new Board();
		
		//Snakes and ladders game
		while(!b1.gameOver()){
			b1.playTurn();
		}
		
	}

	

}
