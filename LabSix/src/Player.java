
public class Player {
	
	private int location;
	
	public Player() {
		
		this.location = 1;
		
		
	}
	
	//Add rollDice method
	public void rollDice() {
		
		location += (int) ((Math.random() * 6) + 1);
		bringDownTo100();
	}
	
	private void bringDownTo100() {
		if(location > 100) {
			location = 100;
		}
	}

	
	public int getLocation() {
		return location;
	}

	public void setLocation(int location) {
		this.location = location;
	}
	
}
