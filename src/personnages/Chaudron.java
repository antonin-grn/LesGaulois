package personnages;

import java.security.SecureRandom;
import java.util.Random;

public class Chaudron {

	private int nbLouche = 0;
	private int puissance = 0;
	private Random random;
	
	public Chaudron(int nbLouche) {
		this.nbLouche = nbLouche;
		try {
			random = SecureRandom.getInstanceStrong();
		} catch (Exception e) {
			e.printStackTrace();
		}
		puissance = random.nextInt(2, 7);
		
	}
	
	public void donnerLouche() {
		nbLouche --;
	}
	
	public int getNbLouche() {
		return nbLouche;
	}
	
	public int getPuissance() {
		return puissance;
	}
}
