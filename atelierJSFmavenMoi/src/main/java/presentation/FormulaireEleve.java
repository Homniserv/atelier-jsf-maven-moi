package presentation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import entite.Eleve;
import service.AtelierService;
import service.AtelierServiceImpl;

@ManagedBean
@RequestScoped
public class FormulaireEleve {

	private String nom;
	private String  prenom;
	private Integer age;
	
	private AtelierService service;
	
	public FormulaireEleve() {
		service = AtelierServiceImpl.getInstance();
	}

	public String creerEleve(){
		service.ajouterEleve(new Eleve(nom, prenom, age));
		return "eleve";
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nomEleve) {
		this.nom = nomEleve;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenomEleve) {
		this.prenom = prenomEleve;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer ageEleve) {
		this.age = ageEleve;
	}

	public AtelierService getService() {
		return service;
	}

	public void setService(AtelierService service) {
		this.service = service;
	}

//	public List<Eleve> getLstEleves() {
//		return lstEleves;
//	}
//
//	public void setLstEleves(List<Eleve> lstEleves) {
//		this.lstEleves = lstEleves;
//	}

}
