package presentation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import entite.Atelier;
import entite.Eleve;
import exception.AtelierException;
import service.AtelierService;
import service.AtelierServiceImpl;

@ManagedBean
@RequestScoped
public class FormulaireAffectation {

	private Eleve eleve;
	private Atelier atelier;

	private AtelierService service;

	public FormulaireAffectation() {
		service = AtelierServiceImpl.getInstance();
	}

	public String affecterEleve() {
		try {
			service.inscrireEleve(eleve, atelier);
		} catch (AtelierException e) {
			e.printStackTrace();
		}
		return "affecter";
	}

	public Eleve getEleve() {
		return eleve;
	}

	public void setEleve(Eleve eleve) {
		this.eleve = eleve;
	}

	public Atelier getAtelier() {
		return atelier;
	}

	public void setAtelier(Atelier atelier) {
		this.atelier = atelier;
	}

	public AtelierService getService() {
		return service;
	}

	public void setService(AtelierService service) {
		this.service = service;
	}

}
