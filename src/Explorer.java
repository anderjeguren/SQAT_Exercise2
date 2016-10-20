
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
	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String getDirection() {
		return direction;
	}
	public void redirect(String string) {
		// TODO Auto-generated method stub
		this.direction = string;

	}
	public void moveUp() {
		setPosition(this.x++, this.y);
	}
	public void moveDown() {
		setPosition(this.x--, this.y);
	}
	public void moveLeft() {
		setPosition(this.x, this.y--);
	}
	public void moveRight() {
		setPosition(this.x, this.y++);
	}
}
