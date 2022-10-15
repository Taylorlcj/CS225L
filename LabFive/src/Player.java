import java.lang.Math;
public class Player {
	
	private int location;
	
	public Player() {		
		this.location = 0;
	}

	public void rollDice(){
		int roll = (int) Math.floor(6 * Math.random()) + 1;
		location += roll;
		System.out.println(roll);
	}
	
	public int getLocation() {
		return location;
	}

	public void setLocation(int location) {
		this.location = location;
	}
	
}
