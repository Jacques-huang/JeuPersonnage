import Personnage.*;
public class JeuPersonnage{
	public static void main (String []args){
		Personnage UneFemme = new Personnage(" UneFemme ",10);
		System.out.println("info sur le personnage " + UneFemme.LeNom());
		Personnage UnHomme = new Personnage(" UnHomme ",100);
		System.out.println("info sur le personnage " + UnHomme.LeNom());
		System.out.println(UneFemme.LeNom()+"marche dans la rue");
		System.out.println(UneFemme.LeNom()+"croise"+ UnHomme.LeNom());
		System.out.println(UneFemme.LeNom()+"se sente aggresser par"+ UnHomme.LeNom());
		System.out.println(UneFemme.LeNom()+"attaque avec passif aggressif"+ UnHomme.LeNom()+"recoit "+UnHomme.degat(10));
		System.out.println(UnHomme.LeNom()+"attaque en retour avec mysoginie"+ UneFemme.LeNom()+"recoit "+UneFemme.degat(5));
		System.out.println(UneFemme.LeNom()+"est blesse, se soigne de "+ UneFemme.soin(5));
		System.out.println(UnHomme.LeNom()+"utilise de l'eau benite les points de vies est de "+ UneFemme.degat(10) +", elle est morte" );

	}
}