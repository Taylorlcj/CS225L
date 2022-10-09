import java.io.*;

public class SnakesAndLaddersController {
	
	private Place[] board;
	private File boardFile;
	private File newBoardFile;
	
	public static void main(String[] args) {
		SnakesAndLaddersController slc = new SnakesAndLaddersController();
		

		//Running the Program
		slc.readBoardFromFile();
		slc.printBoard();
		slc.changeBoardValues();
		slc.printBoard();
		slc.saveBoard();
		
	}
	
	public SnakesAndLaddersController() {
		
		boardFile = new File("SnakesAndLaddersBoard.csv");
		newBoardFile = new File("UpdatedSnakesAndLaddersBoard.csv");
		board = new Place[100];
		
	}
	
	public void readBoardFromFile() {
		//read the file and create Place objects based on the values in board
		//Example of how to create a place object
		//!! IMPORTANT the order the variables written in SnakesAndLadders.csv are the same as the input for the Place object
		//									place #, jumpTo, isSnake, isLadder
		Place examplePlaceObject = new Place(1,30,false,true);
		//Then if you wanted to add that place object to the first spot in the array you could
		
		board[0] = examplePlaceObject;

		try {
			FileReader fr = new FileReader(boardFile);
			BufferedReader br = new BufferedReader(fr);
			// make a String called line
			String line;

			// while line is equal to the next line of the bufferedreader is not equal to null
			// this means read the next line in the file until there are not more line to read
			int i = 0;
			while (  ( line = br.readLine() ) != null     ) {

				// make an array to hold the columns 
				String[] lineColumns;
				// break the line-up to columns. break on the comma and delete the comma
				lineColumns = line.split(",");
 
				// print every line
				System.out.println(line);


				//Change these values to the values found in the file
				int placeNumber = 0;
				int jumpTo = 0;
				boolean isSnake = false;
				boolean isLadder = false; 

				board[i] = new Place(placeNumber, jumpTo, isSnake, isLadder);
				i++;
				
				//LineColumns is now an array of strings that holds the values in the .csv file



			}
			
			// when completely done with reading close the Reader
			br.close();

		} catch (Exception e) {

			e.printStackTrace();
		}
		
	}
	
	public void printBoard() {
		
		for(int i = 0; i < board.length; i++) {
			System.out.println("Place Number: " + board[i].getPlaceNumber() + " Jump to: " + board[i].getJumpTo() + " Is Snake: " + board[i].isSnake() + " Is Ladder " + board[i].isLadder());
		}
		
	}
	
	public void changeBoardValues() {
		for(int i = 0; i < 100; i++)
		{
			if(i % 2 == 0)
			{
				board[i].setLadder(true);
			}
			else
			{
				board[i].setLadder(false);
			}

			board[i].setJumpTo((int) (Math.random() * 20));
		}
		board[30].setLadder(true);
		board[30].setJumpTo(90);
	}
	
	public void saveBoard() {
		try
		{
			File file = new File("UpdatedSnakesAndLaddersBoard.csv");
			FileOutputStream output = new FileOutputStream(file);
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
			for(int i = 0; i < 100; i++)
			{
				String value = "Place Number: " + board[i].getPlaceNumber() + " Jump to: " + board[i].getJumpTo() + " Is Snake: " + board[i].isSnake() + " Is Ladder " + board[i].isLadder();
				writer.write(value+"\n");
			}
			writer.close();
		}
		catch (IOException e)
		{
			throw new RuntimeException(e);
		}
	}
	

}
