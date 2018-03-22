package presentation;

/**https://docs.oracle.com/javaee/6/tutorial/doc/bnaus.html*/
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * https://www.tutorialspoint.com/jsf/jsf_managed_beans.htm
 * https://developer.jboss.org/thread/163620
 */
@ManagedBean
@RequestScoped
public class Menu {

	public Menu() {
	}

	public String eleve() {
		return "eleve";
	}

	// TODO
	public String atelier() {
		return "eleve";
	}

	// TODO
	public String affecter() {
		return "eleve";
	}

}
