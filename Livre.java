package bibliotheque;

public class Livre {
	private int reference ;
	private String titre ;
	private String auteur ;
	
	public Livre(int reference, String titre, String auteur) {
		setReference (reference);
		setTitre (titre);
		setAuteur (auteur);
	}

	public int getReference() {
		return reference;
	}

	public void setReference(int reference) {
		this.reference = reference;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	
}
