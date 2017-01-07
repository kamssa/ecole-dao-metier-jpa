package ci.kossovo.ecole.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ci.kossovo.ecole.dao.PersonneRepository;
import ci.kossovo.ecole.entites.Administrateur;
import ci.kossovo.ecole.entites.Enseignant;
import ci.kossovo.ecole.entites.Etudiant;
import ci.kossovo.ecole.entites.Personne;
import ci.kossovo.ecole.entites.User;
import ci.kossovo.ecole.exceptions.InvalidPersonneException;

@Service
public class PersonneMetierImpl implements IPersonneMetier {
	@Autowired
	private PersonneRepository personneRepository;

	@Override
	public Personne creer(Personne entity) throws InvalidPersonneException {
		if ((entity.getNom() == null||entity.getNom()=="") || (entity.getPrenom() == null||entity.getPrenom()=="") || (entity.getCni() == null||entity.getCni()==""))
			throw new InvalidPersonneException("Le nom, le prenom ou cni ne peut etre null");

		Personne pers = personneRepository.findByCni(entity.getCni());
		if (pers != null)
			throw new InvalidPersonneException("cette personne existe deja");
		return personneRepository.save(entity);
	}

	@Override
	public Personne modifier(Personne entity) throws InvalidPersonneException {
		Personne p = personneRepository.findByCni(entity.getCni());;

		if (p.getId() != entity.getId()) 
			throw new InvalidPersonneException("ce identifiant est deja utilise");

		

		return personneRepository.save(entity);

	}

	@Override
	public List<Personne> findAll() {
		// TODO Auto-generated method stub
		return personneRepository.findAll();
	
	}
	@Override
	public Personne chercherParId(Long id) {
		return personneRepository.findOne(id);
	}

	@Override
	public List<Enseignant> chercherParStatut(String statut) {
		// TODO Auto-generated method stub
		return personneRepository.getStautIgnoreCase(statut);
	}

	@Override
	public List<Administrateur> chercherParFonction(String fonction) {
		// TODO Auto-generated method stub
		return personneRepository.getFonctionIgnoreCase(fonction);
	}
	
	

	@Override
	public List<Etudiant> chercherEtudiantParMc(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Enseignant> chercherEnseignantParMc(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> listeUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Enseignant> listeEnserignant() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Etudiant> chercherParMartricule(String matricule) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> chercherUserParMc(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Etudiant> listeEtudiants() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimer(Long id) {
		// TODO Auto-generated method stub
		personneRepository.delete(id);
	}

	
}
