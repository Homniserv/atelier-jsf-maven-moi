package entite;

public class Atelier {
	String nom;

	public Atelier(String nom2, Integer nbMax, Integer ageMax) {
		this.nom=nom2;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}
