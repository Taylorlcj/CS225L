
public class Ladder extends Place{
	
	//create the constructor for ladder
    public Ladder(int placeNumber, int jumpTo) {

        super(placeNumber,jumpTo);

    }

	//override the landedOn method
    @Override
    public void landedOn(Player player) {
        super.landedOn(player);
        System.out.println("Player landed on a Ladder and was moved to position " + super.getJumpTo());
    }




}
