
public class PathTile extends Tile{
	boolean [] openings;  //  [N,S,E,W]
	
	public PathTile(){
		super();
		openings = new boolean [4];
	}

	public PathTile(int x, int y, boolean fixed, boolean [] openings) {
		super(x, y, fixed);
		this.openings = openings;
		// TODO Auto-generated constructor stub
	}
	
	
}
