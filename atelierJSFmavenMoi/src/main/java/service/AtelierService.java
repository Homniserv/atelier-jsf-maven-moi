package service;

import java.util.List;

import entite.Atelier;
import entite.Eleve;
import exception.AtelierException;

public interface AtelierService {

	public void inscrireEleve(Eleve eleve, Atelier atelier) throws AtelierException;

	public void ajouterEleve(Eleve eleve);

	public void ajouterAtelier(Atelier atelier);

	public Eleve[]  getLstEleves();

	public List<Atelier> getLstAteliers();

}
