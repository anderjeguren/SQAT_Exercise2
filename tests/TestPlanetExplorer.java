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

		assertEquals("(0,0,N)",planet.executeCommand(""));
	}
	
	@Test
	public void testTurningEast() {
		PlanetExplorer planet = new PlanetExplorer(100,100,"");
		
		assertEquals("(0,0,E)",planet.executeCommand("l"));
	}
	
	@Test
	public void testTurningWest() {
		PlanetExplorer planet = new PlanetExplorer(100,100,"");
		
		assertEquals("(0,0,W)",planet.executeCommand("j"));
	}
	
	@Test
	public void testMoveExplorerUp() {
		PlanetExplorer planet = new PlanetExplorer(100,100,"");
		
		assertEquals("(1,0,N)",planet.executeCommand("w"));
	}
	
	@Test
	public void testMoveExplorerLeft() {
		PlanetExplorer planet = new PlanetExplorer(100,100,"");	
		
		assertEquals("(0,99,N)",planet.executeCommand("a"));

	}
	
	@Test
	public void testMoveExplorerLeftWest() {
		PlanetExplorer planet = new PlanetExplorer(100,100,"");
		
		assertEquals("(0,99,W)",planet.executeCommand("aj"));

	}
	
	@Test
	public void testWrapping() {
		PlanetExplorer planet = new PlanetExplorer(100,100,"");
		
		assertEquals("(99,99,W)",planet.executeCommand("ajs"));

	}
	
	@Test
	public void testPlaceObstacle() {
		PlanetExplorer planet = new PlanetExplorer(100,100,"");
		
		planet.placeObstacle(1,1);
		planet.placeObstacle(4,5);
		
		assertEquals("(1,1)(4,5)",planet.findObstacle(0));

	}
	
}
