
public class Grid {
	Tile [][] tiles;
	int width;
	int height;

	public Grid(Tile[][] tiles, int width , int height) {
		this.tiles = new Tile [width][height];
		this.width = width;
		this.height = height;
	}
	
	public Grid (){
		this.width = 4;
		this.height = 4;
		this.tiles = new Tile [width][height];
	}
	
	
	
	public void GenGrid(){
		Grid g = new Grid ();
		g.tiles[0][0]= new InitialTile(0,0, new boolean[] {false,true,false,false});
		g.tiles[3][3] = new GoalTile(3, 3, new boolean[] {false,false,false,true});
		g.tiles[1][0] = new PathTile(1, 0, false, new boolean[]{true,true,false,false});
		g.tiles[2][0] = new PathTile(2, 0, false, new boolean[]{true,true,false,false});
		g.tiles[3][0] = new PathTile(3, 0, false, new boolean[]{true,false,true,false});
		g.tiles[2][1] = new PathTile(2, 1, false, new boolean[]{false,false,true,true});
		g.tiles[3][2] = new PathTile(3, 2, true, new boolean[]{false,false,true,true});
		g.tiles[3][1] = new BlankTile(3, 1);
		g.tiles[0][1] = new BlockTile(0, 1);
		g.tiles[0][2] = new BlockTile(0, 2);
		g.tiles[0][3] = new BlockTile(0, 3);
		g.tiles[1][1] = new BlockTile(1, 1);
		g.tiles[1][2] = new BlockTile(1, 2);
		g.tiles[1][3] = new BlockTile(1, 3);
		g.tiles[2][2] = new BlockTile(2, 2);
		g.tiles[2][3] = new BlockTile(2, 3);
		
	}
	
	
}
