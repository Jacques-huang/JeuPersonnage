package Personnage;
public class Personnage {
	public Personnage (String name, int life){
	this.nom=name;
	this.vie=life;
	}

	public String LeNom(){
		return this.nom;
	}

	public void PlusDeVie(int soin){
		this.vie = this.vie + soin;
	}
   	 public boolean degats(int degats){
		 this.vie = this.vie - degats;
		 return vie>0;
    }

	private String nom;
	private int vie;
}				

	
	
