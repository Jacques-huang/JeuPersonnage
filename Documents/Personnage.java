package Personnage;
public class Personnage {
	public Personnage (String name, int life){
	this.nom=name;
	this.vie=life;
	}

	public String LeNom(){
		return this.nom;
	}

	public int soin (int soin){
		this.vie = this.vie + soin;
		return this.vie;
	}
   	 public boolean degats(int degats){
		 this.vie = this.vie - degats;
		 return vie>0;
    	}
	public int degat(int degat){
		this.vie = this.vie - degat;
		return this.vie;
	}

	private String nom;
	private int vie;
}