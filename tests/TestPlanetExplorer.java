import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void testThePlanet() {
		PlanetExplorer planet = new PlanetExplorer(100,100,"");
		
		assertEquals(100*100, planet.getSize());	
	}
	
	@Test
	public void testLanding() {
		PlanetExplorer planet = new PlanetExplorer(100,100,"");
		

		assertEquals("00N",planet.executeCommand(""));
	}
	
	@Test
	public void testTurningEast() {
		PlanetExplorer planet = new PlanetExplorer(100,100,"");
		
		planet.landExplorer();
		planet.changeDirection("l");
		
		assertEquals("(0,0,E)",planet.executeCommand("l"));
	}
	
	@Test
	public void testTurningWest() {
		PlanetExplorer planet = new PlanetExplorer(100,100,"");
		
		planet.landExplorer();
		planet.changeDirection("j");
		
		assertEquals("00W",planet.executeCommand("j"));
	}
	
	@Test
	public void testMoveExplorerUp() {
		PlanetExplorer planet = new PlanetExplorer(100,100,"");
		
		planet.landExplorer();
		planet.moveExplorer("w");
		
		assertEquals("10N",planet.executeCommand("w"));
	}
	
	@Test
	public void testMoveExplorerLeft() {
		PlanetExplorer planet = new PlanetExplorer(100,100,"");
		

		
		assertEquals("(0,-1,N)",planet.executeCommand("a"));

	}
	
	@Test
	public void testMoveExplorerLeftWest() {
		PlanetExplorer planet = new PlanetExplorer(100,100,"");
		
		assertEquals("(0,-1,W)",planet.executeCommand("aj"));

	}
	
}
