package bibliotheque;

import java.util.ArrayList;

public class MainLivre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// créer une arrylist y mettr e nos livres
		Livre livre1 = new Livre ("rs548", "Les Misérables", "Victor Hugo");
		Livre livre2 = new Livre("nb548", "L'Iliade et l'Odyssée", "Homère");
		Livre livre3 = new Livre( "ut862", "1984", "George Orwell");

		ArrayList<Livre> livres = new ArrayList<>();
		livres.add(livre1);
		livres.add(livre2);
		livres.add(livre3);
		
		for (Livre unLivre : livres) {
			unLivre.displayTitle();
		}
	}

}
