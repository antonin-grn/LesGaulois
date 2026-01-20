package sites;

import personnages.Soldat;

public class Camp {
	
	public Camp(Soldat commandant) {
		super(commandant);
	}
	
	public static void main(String[] args) {
		Soldat commandant = new Soldat(nom, force);
		System.out.println(commandant.getNom());
	}
}
