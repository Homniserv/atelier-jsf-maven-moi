package presentation;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import entite.Eleve;
//import presentation.FormulaireAffectation; 
/** serialisable https://www.mkyong.com/jsf2/injecting-managed-beans-in-jsf-2-0/*/
@FacesConverter(value = "eleveConverter", forClass = Eleve.class)
public class EleveConverter implements Converter {
	/** https://www.tutorialspoint.com/jsf/jsf_customconvertor_tag.htm */
	public EleveConverter() {
	}

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if (value == null) {
			return null;
		}

		FormulaireAffectation data = context.getApplication().evaluateExpressionGet(context, "#{formulaireAffectation}",
				FormulaireAffectation.class);
		for (Eleve c : data.getService().getLstEleves()) {
			if (c.getNom().equals(value)) {
				return c;
			}
		}
		throw new ConverterException(new FacesMessage(String.format("Cannot convert %s to Eleve", value)));
	}

	/** tri bi condition */
	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		return (value instanceof Eleve) ? ((Eleve) value).getNom() : null;
	}

	// TODO SessionFactory
	// https://stackoverflow.com/questions/15069879/primefaces-picklist-labels-are-empty-after-update
}
