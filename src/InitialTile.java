
public class InitialTile extends Tile{
	boolean [] openings ;
	
	public InitialTile() {
		super();
		openings = new boolean [4];
		// TODO Auto-generated constructor stub
	}

	public InitialTile(int x, int y,boolean [] openings) {
		super(x, y, true);
		this.openings = openings;
		// TODO Auto-generated constructor stub
	}
	
	

}
