
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
	public void moveUp(int planetLenght) {
		if (this.x==planetLenghtX--)
			this.x = 0;
		else
			this.x++;
	}
	public void moveDown(int planetLenghtX) {
		if (this.x==0)
			this.x = planetLenghtX--;
		else
			this.x--;
	}
	public void moveLeft(int planetLenghtY) {
		if (this.y==0)
			this.y = planetLenghtY--;
		else
		 this.y--;
	}
	public void moveRight(int planetLenghtY) {
		if (this.y==planetLenghtY--)
			this.y = 0;
		else
			this.y++;
	}
}
