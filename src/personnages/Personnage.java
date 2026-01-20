package personnages;

public abstract class Personnage {
	private String nom;
	private int force;
	
	public Personnage(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println("Le " + donnerAuteur() + nom + " : " + texte);
	}
	
	public void frapper(Personnage adversaire) {
		if (force > 0) {
			System.out.println("Le " + donnerAuteur() + nom + " envoie un grand coup au " + adversaire.donnerAuteur() + adversaire.getNom());
			adversaire.recevoirCoup(force/3);
		}
	}
	
	public void recevoirCoup(int forceCoup) {
		force = force - forceCoup;
		
		if (force < 1) {
			force = 0;
			parler("J'abandonne !");
		} else {
			parler("Aïe !");
		}
	}
	
	protected abstract String donnerAuteur();
}
