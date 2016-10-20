
public class Explorer {

	private int x;
	private int y;
	private String direction;
	
	public Explorer(int x, int y, String direction) {
		super();
		this.x = x;
		this.y = y;
		this.direction = direction;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public String getDirection() {
		return direction;
	}
	public void redirect(String string) {
		// TODO Auto-generated method stub
		this.direction = string;

	}
	public void moveUp() {
		if (this.x==99)
			this.x = 0;
		else
			this.x++;
	}
	public void moveDown() {
		if (this.x==0)
			this.x = 99;
		else
			this.x--;
	}
	public void moveLeft() {
		if (this.y==0)
			this.x = 99;
		else
		 this.y--;
	}
	public void moveRight() {
		if (this.x==99)
			this.x = 0;
		else
			this.y++;
	}
}
