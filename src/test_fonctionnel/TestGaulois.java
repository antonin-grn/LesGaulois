package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		System.out.println(asterix.getNom());
		
		asterix.parler("SIX SEVEEEENNNN");
		
		Romain minus = new Romain("Minus", 6);
		
		minus.parler("Top 7, FavEEEEEEEEE");
		
		/*for(int i = 0; i < 2; i++) {
			minus.recevoirCoup(3);
		}*/
		
		for(int i = 0; i < 3; i++) {
			asterix.frapper(minus);
		}
		
	}
	
}
