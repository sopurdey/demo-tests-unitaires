import static org.junit.Assert.*;

import org.junit.Test;

public class SaisonTest {

	@Test
	public void testGetByLabel() {
		String hiver = "Hiver";
		Saison saison = Saison.getByLabel(hiver);
		String resultat = saison.getLibelle();
		assertEquals(hiver, resultat);
	}
	
	@Test
	public void testGetByLabelNonCorrespondant() {
		String hiver = "Hivereee";
		Saison saison = Saison.getByLabel(hiver);
		String resultat = saison.getLibelle();
		assertNull(resultat);
	}
	
	@Test
	public void testGetByLabelNull() {
		String hiver = null;
		Saison saison = Saison.getByLabel(hiver);
		String resultat = saison.getLibelle();
		assertNull(resultat);
	}

}
