package service;

import entite.Atelier;
import entite.Eleve;

public interface AtelierService {

	public void inscrireEleve(Eleve eleve, Atelier atelier);

	public void ajouterEleve(Eleve eleve);

	public void ajouterAtelier(Atelier atelier);

	public Object getLstEleves();

	public Object getLstAteliers();

}
