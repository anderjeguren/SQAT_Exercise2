
// Before submitting write your ID and finish time here. Your ID is written on project description sheets.
// ID:
// Finish time:

public class PlanetExplorer {
	
	private int planetLenghtX;
	private int planetLenghtY;

	private Explorer exp;
	
	private void landExplorer() {
		// TODO Auto-generated method stub
		exp = new Explorer(0,0,"N");
	}
	
	public PlanetExplorer(int x, int y, String obstacles){
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
	 *  
	 
		Example use: For a 100x100 grid with two obstacles at coordinates (5,5) and (7,8)
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  
		 
	 */
		this.planetLenghtX = x;
		this.planetLenghtY = y;

	}
	
	public String executeCommand(String command){
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		landExplorer();//Start the exploring
		String[] str = command.split("");
		
		for(int i=0; i<str.length; i++){
			switch(str[i]){
			//Change Direction
			case "i":
				exp.redirect("N");
				break;
			case "k":
				exp.redirect("S");
				break;
			case "j":
				exp.redirect("W");
				break;
			case "l":
				exp.redirect("E");
				break;
			//Move the explorer
			case "w":
				exp.moveUp(planetLenghtX);
				break;
			case "s":
				exp.moveDown(planetLenghtX);
				break;
			case "a":
				exp.moveLeft(planetLenghtY);
				break;
			case "d":
				exp.moveRight(planetLenghtY);
				break;
			}
		}
		StringBuilder sb = new StringBuilder();
		sb.append("(");
		sb.append(exp.getX());
		sb.append(",");
		sb.append(exp.getY());
		sb.append(",");
		sb.append(exp.getDirection());
		sb.append(")");
		
		String status = sb.toString();
		return status;
	}

	public int getSize() {
		// TODO Auto-generated method stub
		return planetLenghtX * planetLenghtY;
	}
}
