package personnages;

public class Druide extends Gaulois{
	
	private Chaudron chaudron;
	
	public Druide (String nom, int force) {
		super(nom,force);
	}
	
	public Chaudron getChaudron() {
		return chaudron;
	}
	
	public void fabriquerPotion(int nbDose) {
		chaudron = new Chaudron(nbDose);
		parler("J'ai conconcté " + nbDose + " dose de potion. Elle a une force de " + chaudron.getPuissance() + ".");
	}

}
