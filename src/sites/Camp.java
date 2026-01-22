package sites;

import personnages.Grade;
import personnages.Soldat;

public class Camp {

	private Soldat commandant;
	private Soldat[] soldats = new Soldat[3];
	private int nbSoldat = 0;

	public Camp(Soldat commandant) {
		this.commandant = commandant;
		commandant.parler("Je suis en charge de créer un nouveau camp romain.");
	}

	public Soldat getCommandant() {
		return commandant;
	}

	public void ajouterSoldat(Soldat soldat) {

		if (nbSoldat < soldats.length) {
			soldats[nbSoldat] = soldat;
			nbSoldat++;
			soldat.parler("Je mets mon épée au service de Rome dans le camp dirigé par " + commandant.getNom() + ".");
		} else {
			commandant.parler("Désolée " + soldat.getNom() + " notre camps est complet !");
		}
	}

	public void afficherCamp() {

		System.out.println("Le camp dirigé par " + commandant.getNom() + " contient les soldats :");

		for (int i = 0; i < nbSoldat; i++) {
			System.out.println("-" + soldats[i].getNom());
		}
	}

	public void changerCommandant(Soldat soldat) {
		if (soldat.getGrade() == Grade.CENTURION) {
			commandant = soldat;
			soldat.parler("Moi " + soldat.getNom() + " je prends la direction du camp romain.");
		} else {
			soldat.parler("Je ne suis pas suffisamment gradé pour prendre la direction du camp romain.");
		}
	}
}
