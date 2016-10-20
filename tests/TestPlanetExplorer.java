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
		
		planet.landExplorer();
		assertEquals("00N",planet.getExplorerStatus());
	}
	
	@Test
	public void testTurningEast() {
		PlanetExplorer planet = new PlanetExplorer(100,100,"");
		
		planet.landExplorer();
		planet.changeDirection("l");
		
		assertEquals("(0,0,E)",planet.getExplorerStatus());
	}
	
	@Test
	public void testTurningWest() {
		PlanetExplorer planet = new PlanetExplorer(100,100,"");
		
		planet.landExplorer();
		planet.changeDirection("j");
		
		assertEquals("00W",planet.getExplorerStatus());
	}
	
	@Test
	public void testMoveExplorerUp() {
		PlanetExplorer planet = new PlanetExplorer(100,100,"");
		
		planet.landExplorer();
		planet.moveExplorer("w");
		
		assertEquals("10N",planet.getExplorerStatus());
	}
	
	@Test
	public void testMoveExplorerLeft() {
		PlanetExplorer planet = new PlanetExplorer(100,100,"");
		
		planet.landExplorer();
		planet.moveExplorer("a");
		
		assertEquals("0-1N",planet.getExplorerStatus());

	}
	
	@Test
	public void testMoveExplorerLeftWest() {
		PlanetExplorer planet = new PlanetExplorer(100,100,"");
		
		planet.landExplorer();
		planet.moveExplorer("a");
		planet.changeDirection("j");
		
		assertEquals("0-1W",planet.getExplorerStatus());

	}
	
	@Test
	public void testMoveExplorerLeftWest() {
		PlanetExplorer planet = new PlanetExplorer(100,100,"");
		
		planet.landExplorer();
		planet.moveExplorer("a");
		planet.changeDirection("j");
		
		assertEquals("0-1W",planet.getExplorerStatus());

	}
}
