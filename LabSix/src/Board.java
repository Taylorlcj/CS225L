import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Board {
	
	private File boardFile;
	private Place[] board;

	//Add player Objects
	private Player player1;
	private Player player2;
	
	
	public Board() {
		this.boardFile = new File("SnakesAndLaddersBoard.csv");
		this.board = new Place[100];
		readBoardFromFile();
		
		//initialize player objects 
		this.player1 = new Player();
		this.player2 = new Player();
	}
	
	//Add playTurn method
	public void playTurn() {
		
		//shifting to account for Place values that start at 1 instead of 0
		player1.rollDice();
		board[player1.getLocation() - 1].landedOn(player1);
		player2.rollDice();
		board[player2.getLocation() - 1].landedOn(player2);
		
	}
	
	//add gameOver method
	public boolean gameOver() {
		return player1.getLocation() >= 100 || player2.getLocation() >= 100;
	}
	
	public String reportWinner() {
		
		if(player1.getLocation() > player2.getLocation()) {
			return "Player 1 won!";
		}else {
			return "Player 2 won!";			
		}
		
	}
	
	
	public void readBoardFromFile() {
		//read the file and create Place objects based on the values in board
		//Example of how to create a place object
		//!! IMPORTANT the order the variables written in SnakesAndLadders.csv are the same as the input for the Place object
		//									place #, jumpTo, isSnake, isLadder
		//Place examplePlaceObject = new Place(1,30,false,true);
		//Then if you wanted to add that place object to the first spot in the array you could
		
		//board[0] = examplePlaceObject;
		
		try {
			FileReader fr = new FileReader(boardFile);
			BufferedReader br = new BufferedReader(fr);
			// make a String called line
			String line;

			int i = 0;
			// while line is equal to the next line of the bufferedreader is not equal to null
			// this means read the next line in the file until there are not more line to read
			while (  ( line = br.readLine() ) != null     ) {
				
				int jumpTo = 0;
				// make an array to hold the columns 
				String[] lineColumns;
				// break the line up to columns. break on the comma and delete the comma
				lineColumns = line.split(",");
				//this can also be done using an if statement
				int placeNumber = (int) Double.parseDouble(lineColumns[0]);
				try {
					 jumpTo = (int) Double.parseDouble(lineColumns[1]);
				}catch(NumberFormatException x) {
					jumpTo = (int) Double.parseDouble(lineColumns[0]);
				}
				
				boolean isSnake = lineColumns[2].toLowerCase().equals("true");
				boolean isLadder = lineColumns[3].toLowerCase().equals("true");
				
				if(isSnake) {
					board[i] = new Snake(placeNumber, jumpTo);
				} else if(isLadder) {
					board[i] = new Ladder(placeNumber, jumpTo);
				}else {
					board[i] = new Place(placeNumber, jumpTo);
				}
				
				
				
				i++;
				// print every line
				//System.out.println(line);
				
				//LineColumns is now an array of strings that holds the values in the .csv file

			}
			
			// when completely done with reading close the Reader
			br.close();

		} catch (Exception e) {

			e.printStackTrace();
		}
		
	}

}
