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
	public void testTurning() {
		PlanetExplorer planet = new PlanetExplorer(100,100,"");
		
		planet.landExplorer();
		planet.changeDirection("r");
	}
}
