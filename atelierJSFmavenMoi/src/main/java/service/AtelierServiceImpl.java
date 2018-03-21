package service;

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

	public void ajouterEleve(Eleve eleve) {
		// TODO Auto-generated method stub

	}

	public void ajouterAtelier(Atelier atelier) {
		// TODO Auto-generated method stub

	}

	// TODO Iterable
	public Object getLstEleves() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getLstAteliers() {
		// TODO Auto-generated method stub
		return null;
	}
}
