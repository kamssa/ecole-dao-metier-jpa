package ci.kossovo.ecole.metier;

import java.util.List;

import ci.kossovo.ecole.exceptions.InvalidPersonneException;

public interface Imetier <T,U>{
	public T creer(T entity) throws InvalidPersonneException;
	public T modifier(T entity) throws InvalidPersonneException;
	public List<T> findAll();
	public T chercherParId(U id);
	public void supprimer(U id);

}
