
public class SnakesAndLaddersController {

	public static void main(String[] args) {
		
		Board b1 = new Board();
		
		while(!b1.gameOver()) {
			b1.playTurn();
		}
		System.out.println(b1.reportWinner());
		
	}

	

}
