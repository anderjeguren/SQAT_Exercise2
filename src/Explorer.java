
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
	public void redirectLeft() {
		// TODO Auto-generated method stub
		switch(direction){
		case "N":
			this.direction = "W";
			break;
		case "W":
			this.direction = "S";
			break;
		case "S":
			this.direction = "E";
			break;
		case "E":
			this.direction = "N";
			break;
		}
		
	}
	public void redirectRight() {
		// TODO Auto-generated method stub
		switch(direction){
		case "N":
			this.direction = "E";
			break;
		case "E":
			this.direction = "S";
			break;
		case "S":
			this.direction = "W";
			break;
		case "W":
			this.direction = "N";
			break;
		}
		
	}
	public void moveUp(int planetLenghtX) {
		if (this.x==planetLenghtX-1)
			this.x = 0;
		else
			this.x++;
	}
	public void moveDown(int planetLenghtX) {
		if (this.x==0)
			this.x = planetLenghtX-1;
		else
			this.x--;
	}
	public void moveLeft(int planetLenghtY) {
		if (this.y==0)
			this.y = planetLenghtY-1;
		else
		 this.y--;
	}
	public void moveRight(int planetLenghtY) {
		if (this.y==planetLenghtY-1)
			this.y = 0;
		else
			this.y++;
	}
}
