import java.io.*;

import com.sun.org.apache.xml.internal.serialize.LineSeparator;

public class FileIO {

	private File labFile;

	public FileIO() {
		//  constructor 
		labFile = new File("Lab_Answers.csv");
	}

	public void parseFile() {
		// this will be to for the requirements
		int validFavNum = 0;
		int invalidFavNum = 0;
		int catCount = 0;
		int dogCount = 0;
		int nonBlank = 0;
		int blanks = 0;
		int colorCount = 0;

		try {
			FileReader fr = new FileReader(labFile);
			BufferedReader br = new BufferedReader(fr);
			// make a String called line
			String line;

			// while line is equal to the next line of the buffered-reader is not equal to null
			// this means read the next line in the file until there are not more line to read
			while (  ( line = br.readLine() ) != null     ) {

				// make an array to hold the columns 
				String[] lineColumns;
				// break the line up to columns. break on the comma and delete the comma
				lineColumns = line.split(",");
 
				// print every line
				System.out.println(line);
				for(int i = 0; i < lineColumns.length; i++){
					System.out.print(lineColumns[i] + "|");
				}
				System.out.println();

//				System.out.println(lineColumns[0]);

				if (lineColumns[0].isBlank()){
					invalidFavNum++;
				}
				else{
					validFavNum++;
				}

				if(lineColumns.length <3){
					//do nothing
				}
				else if(lineColumns[2].toLowerCase().contains("dog")){
					dogCount++;
				}
				else if (lineColumns[2].toLowerCase().contains("cat")){
					catCount++;
				}
				else if(lineColumns[2].toLowerCase().contains("both")){
					dogCount++;
					catCount++;
				}

				nonBlank = 0;
				for(int i = 0; i < lineColumns.length; i++){

					if(!lineColumns[i].isBlank()){
						nonBlank++;
					}
				}
				blanks += 9 - nonBlank;

				if(lineColumns.length <5){
					//do nothing
				}
				else if(lineColumns[4].toLowerCase().contains("red")){
					colorCount++;
				}
				else if (lineColumns[4].toLowerCase().contains("blue")){
					colorCount++;
				}
				else if(lineColumns[4].toLowerCase().contains("yellow")){
					colorCount++;
				}

			}
			// when completely done with reading close the Reader
			br.close();

		} catch (Exception e) {

			e.printStackTrace();
		}

		System.out.println(invalidFavNum);
		System.out.println(validFavNum);
		System.out.println(dogCount);
		System.out.println(catCount);
		System.out.println(blanks);
		System.out.println(colorCount);

		File outputFile = new File("labOutput.txt");
		try{
			FileWriter fileWriter = new FileWriter(outputFile);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

			bufferedWriter.write("Valid Favorites: " + validFavNum);
			bufferedWriter.newLine();
			bufferedWriter.write("Invalid Favorites: " + invalidFavNum);
			bufferedWriter.newLine();
			if(dogCount > catCount){
				bufferedWriter.write("Dog Count " + dogCount + " won by " + (dogCount-catCount));
				bufferedWriter.newLine();
			}
			else if (catCount > dogCount){
				bufferedWriter.write("Cat Count " + catCount + " won by " + (catCount-dogCount));
				bufferedWriter.newLine();
			}
			else {
				bufferedWriter.write("Dog Count and Cat Count are the same " + dogCount);
				bufferedWriter.newLine();
			}

			bufferedWriter.write("The total number of Blanks is " + blanks);
			bufferedWriter.newLine();
			bufferedWriter.write("The combined amount of Red, Blue, and Yellow entries is " + colorCount);
			bufferedWriter.newLine();
			bufferedWriter.close();
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		FileIO lab9 = new FileIO();
		lab9.parseFile();

	}

}
