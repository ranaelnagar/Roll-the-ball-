
public class Tile {
	int x ;
	int y ;
	boolean fixed;
	
	public Tile(){
		this.x = 0;
		this.y = 0;
		this.fixed = false;
	}
	
	public Tile(int x, int y, boolean fixed){
		this.x = x;
		this.y = y;
		this.fixed = fixed;
	}
}
