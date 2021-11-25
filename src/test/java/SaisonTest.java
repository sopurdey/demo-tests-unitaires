import static org.junit.Assert.*;

import org.junit.Test;

public class SaisonTest {

	@Test
	public void testGetByLabel() {
		Saison saison = Saison.getByLabel("Hiver");
		assertEquals(Saison.HIVER, saison);
	}
	
	@Test
	public void testGetByLabelNonCorrespondant() {
		Saison saison = Saison.getByLabel("Hivereee");
		assertNull(saison);
	}
	
	@Test
	public void testGetByLabelNull() {
		Saison saison = Saison.getByLabel(null);
		assertNull(saison);
	}

}
