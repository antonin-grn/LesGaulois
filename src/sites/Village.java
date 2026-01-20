package sites;

import personnages.Gaulois;

public class Village {
	public static void main(String[] args) {
		Gaulois chef = new Gaulois("Vercingétorix" , 5);
		System.out.println(chef.getNom());
	}
}
