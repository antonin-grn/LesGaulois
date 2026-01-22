package test_fonctionnel;

import personnages.Gaulois;
import personnages.Grade;
import personnages.Romain;
import personnages.Soldat;
import sites.Camp;
import sites.Village;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		/*System.out.println(asterix.getNom());
		
		asterix.parler("Bonjour à tous !");
		
		Romain minus = new Romain("Minus", 6);
		
		minus.parler("UN GAU, UN GAUGAU...");*/
		
		/*for(int i = 0; i < 2; i++) {
			minus.recevoirCoup(3);
		}*/
		
		/*
		for(int i = 0; i < 3; i++) {
			asterix.frapper(minus);
			minus.frapper(asterix);
		}*/
		
		Gaulois chef = new Gaulois("Vercingétorix" , 5);
		
		Village village = new Village(chef);
		
		Soldat commandant = new Soldat("Minus", 6, Grade.CENTURION);
	
		Camp camp = new Camp(commandant);
		
		
		Gaulois agecanonix = new Gaulois("Agecanonix", 5);
		Gaulois assurancetourix = new Gaulois("Assurancetourix", 5);
		Gaulois obelix = new Gaulois("Obelix", 5);
		Gaulois prolix = new Gaulois("Prolix", 5);
		
		village.ajouterVillageois(agecanonix);
		village.ajouterVillageois(assurancetourix);
		village.ajouterVillageois(asterix);
		village.ajouterVillageois(obelix);
		village.ajouterVillageois(prolix);
		
		Soldat brutus = new Soldat("Brutus", 2, Grade.SOLDAT);
		Soldat milexcus = new Soldat("Milexcus", 2, Grade.SOLDAT);
		Soldat tulliusOctopus = new Soldat("Tullius Octopus", 2, Grade.SOLDAT);
		Soldat ballondebaudrus = new Soldat("ballondebaudrus", 2, Grade.SOLDAT);
		
		camp.ajouterSoldat(brutus);
		camp.ajouterSoldat(milexcus);
		camp.ajouterSoldat(tulliusOctopus);
		camp.ajouterSoldat(ballondebaudrus);
		
		village.afficherVillage();
		
		camp.afficherCamp();
		
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 5);
		village.changerChef(abraracourcix);
		
		Soldat briseradius = new Soldat("Briseradius", 4, Grade.CENTURION);
		camp.changerCommandant(milexcus);
		camp.changerCommandant(briseradius);
		
	}
	
}
