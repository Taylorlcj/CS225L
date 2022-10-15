
public class Place {
	
	private int placeNumber;
	private int jumpTo;
	private boolean isSnake;
	private boolean isLadder;
	
	
	public Place(int placeNumber, int jumpTo, boolean isSnake, boolean isLadder) {
		
		this.placeNumber = placeNumber;
		this.jumpTo = jumpTo;
		this.isSnake = isSnake;
		this.isLadder = isLadder;
		
	}

	public void isLandedOn(Player player) {
		
		player.setLocation(jumpTo);
		
	}	
	
	public int getPlaceNumber() {
		return placeNumber;
	}


	public void setPlaceNumber(int placeNumber) {
		this.placeNumber = placeNumber;
	}


	public int getJumpTo() {
		return jumpTo;
	}


	public void setJumpTo(int jumpTo) {
		this.jumpTo = jumpTo;
	}


	public boolean isSnake() {
		return isSnake;
	}


	public void setSnake(boolean isSnake) {
		this.isSnake = isSnake;
	}


	public boolean isLadder() {
		return isLadder;
	}


	public void setLadder(boolean isLadder) {
		this.isLadder = isLadder;
	}

}
