import Personnage.*;
public class JeuPersonnage{
	public static void main (String []args){
		Personnage UnSocier = new Personnage("UnSocier",100);
		System.out.println("info sur le personnage " + UnSocier.LeNom());
		Personnage UnHomme = new Personnage("UnHomme",100);
		System.out.println("info sur le personnage " + UnHomme.LeNom());

	}
}

