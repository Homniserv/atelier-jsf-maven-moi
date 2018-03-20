package presentation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import entite.Atelier;
import service.AtelierService;
import service.AtelierServiceImpl;

@ManagedBean
@RequestScoped
public class FormulaireAtelier {

	private String nom;
	private Integer nbMax;
	private Integer ageMax;
	
	private AtelierService service;
	
	public FormulaireAtelier() {
		service = AtelierServiceImpl.getInstance();
	}
	
	public String creerAtelier(){
		service.ajouterAtelier(new Atelier(nom, nbMax, ageMax));
		return "atelier";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getNbMax() {
		return nbMax;
	}

	public void setNbMax(Integer nbMax) {
		this.nbMax = nbMax;
	}

	public Integer getAgeMax() {
		return ageMax;
	}

	public void setAgeMax(Integer ageMax) {
		this.ageMax = ageMax;
	}

	public AtelierService getService() {
		return service;
	}

	public void setService(AtelierService service) {
		this.service = service;
	}

}
