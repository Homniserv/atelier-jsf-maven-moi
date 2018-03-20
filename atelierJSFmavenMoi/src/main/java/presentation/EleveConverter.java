package presentation;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import entite.Eleve;

@FacesConverter(value = "eleveConverter", forClass = Eleve.class)
public class EleveConverter implements Converter {

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

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		return (value instanceof Eleve) ? ((Eleve) value).getNom() : null;
	}

}
