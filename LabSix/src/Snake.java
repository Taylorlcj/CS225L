
public class Snake extends Place {
	
	public Snake(int placeNumber, int jumpTo) {
		
		super(placeNumber,jumpTo);
		
	}
	
	@Override
	public void landedOn(Player player) {
		super.landedOn(player);
		System.out.println("Player landed on a snake and was moved to position " + super.getJumpTo());
	}

}
