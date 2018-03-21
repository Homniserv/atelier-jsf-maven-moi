package presentation;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import entite.Atelier;

@FacesConverter(value = "atelierConverter", forClass = Atelier.class)
public class AtelierConverter implements Converter {

	public AtelierConverter() {
	}

	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if (value == null) {
			return null;
		}

		FormulaireAffectation data = context.getApplication().evaluateExpressionGet(context, "#{formulaireAffectation}",
				FormulaireAffectation.class);
		for (Atelier c : data.getService().getLstAteliers()) {
			if (c.getNom().equals(value)) {
				return c;
			}
		}
		throw new ConverterException(new FacesMessage(String.format("Cannot convert %s to Eleve", value)));
	}

	/**2 ways if*/
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		return (value instanceof Atelier) ? ((Atelier) value).getNom() : null;
	}

}
