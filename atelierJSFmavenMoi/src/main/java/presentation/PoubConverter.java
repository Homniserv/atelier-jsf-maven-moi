package presentation;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import entite.Atelier;

@FacesConverter(value = "atelierConverter")
public class PoubConverter implements Converter {

	public PoubConverter() {
	}

	public Object etAsObject(FacesContext context, UIComponent component, String value) {

		// throw new ConverterException(new FacesMessage(String.format("Cannot
		// convert %s to Eleve", value)));
		return null;
	}

	/** 2 ways if */
	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		return null;
	}

	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		// TODO Auto-generated method stub
		return null;
	}

}
