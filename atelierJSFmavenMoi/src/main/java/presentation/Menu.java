package presentation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Menu {

	public Menu() {
	}

	public String eleve(){
		return "eleve";
	}
	
	public String atelier(){
		return "eleve";
	}
	
	public String affecter(){
		return "eleve";
	}
	
}
