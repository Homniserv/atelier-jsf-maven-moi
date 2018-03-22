package service;

import java.util.ArrayList;
import java.util.List;

import entite.Atelier;
import entite.Eleve;
import exception.AtelierException;

public class AtelierServiceImpl implements AtelierService {
	private static AtelierService instance = null;

	protected AtelierServiceImpl() {
		// Exists only to defeat instantiation.
	}

	/** https://www.javaworld.com/article/2073352/core-java/simply-singleton.html */
	public static AtelierService getInstance() {
		if (instance == null)
			instance = new AtelierServiceImpl();
		return instance;
	}

	public void inscrireEleve(Eleve eleve, Atelier atelier) throws AtelierException {
		if (null == atelier) {
			// throw new AtelierException("cause");
			throw new AtelierException();
		}
	}

	// Eleve[] eleveCollection = {};
	List<Eleve> eleveCollection = new ArrayList<Eleve>();

	List<Atelier> atelierCollection = new ArrayList<Atelier>();

	public void ajouterEleve(Eleve eleve) {
		// this.eleveCollection[this.eleveCollection.length] = eleve;
		this.eleveCollection.add(eleve);
	}

	public void ajouterAtelier(Atelier atelier) {
		this.atelierCollection.add(atelier);
	}

	// TODO Iterable
	// public Eleve[] getLstEleves() {
	public List<Eleve> getLstEleves() {
		return this.eleveCollection;
	}

	public List<Atelier> getLstAteliers() {
		return this.atelierCollection;
	}
}
