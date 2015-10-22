
public class GoalTile extends Tile {
	boolean [] openings;
	
	public GoalTile() {
		super();
		openings = new boolean [4];
		// TODO Auto-generated constructor stub
	}

	public GoalTile(int x, int y,boolean [] openings) {
		super(x, y, true);
		this.openings = openings;
		// TODO Auto-generated constructor stub
	}
	
	

}
