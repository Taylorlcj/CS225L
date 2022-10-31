
public class Place {
	
	private int placeNumber;
	private int jumpTo;
	
	
	public Place(int placeNumber, int jumpTo) {
		
		this.placeNumber = placeNumber;
		this.jumpTo = jumpTo;
		
	}
	
	//Add landedOn method
	public void landedOn(Player player) {
		
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

}
