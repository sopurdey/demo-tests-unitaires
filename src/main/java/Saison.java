

public enum Saison {

	PRINTEMPS("Printemps", 1), ETE("Eté", 2), AUTOMNE("Automne", 3), HIVER("Hiver", 4);

	private String libelle;
	private int ordre;

	private Saison(String libelle, int ordre) {
		this.libelle = libelle;
		this.ordre = ordre;
	}

	// Développez une méthode qui retourne une instance de Saison en fonction du
	// libellé.
	public static Saison getByLabel(String libelle) {
		Saison saisons[] = Saison.values();
		
		for (Saison saison: saisons) {
			if (saison.getLibelle().equals(libelle)) {
				return saison;
			}
		}
		return null;
	}

	public String toString() {
		return libelle + " " + ordre;
	}

	public String getLibelle() {
		return libelle;
	}

	public int getOrdre() {
		return ordre;
	}

}
