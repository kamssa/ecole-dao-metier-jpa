package ci.kossovo.ecole.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ci.kossovo.ecole.entites.Administrateur;
import ci.kossovo.ecole.entites.Enseignant;
import ci.kossovo.ecole.entites.Etudiant;
import ci.kossovo.ecole.entites.Personne;
import java.lang.String;

public interface PersonneRepository extends JpaRepository<Personne, Long> {

	@Query("select etu from Etudiant etu ")
	List<Etudiant> findAllEtudiants();

	@Query("select en from Enseignant en ")
	List<Enseignant> findAllEnseignants();

	@Query("select ad from Administrateur ad ")
	List<Administrateur> findAllAdministrateurs();

	List<Personne> findByNomCompletContainingIgnoreCase(String nomcomplet);

	@Query("select e from Etudiant e where e.matricule=?1")
	Etudiant getMatriculeIgnoreCase(String matricule);

	@Query("select en from Enseignant en where UPPER(en.statut)=UPPER(?1) ")
	List<Enseignant> getStautIgnoreCase(String statut);

	@Query("select ad from Administrateur ad where ad.fonction=?1")
	List<Administrateur> getFonctionIgnoreCase(String fonction);

	List<Personne> findByType(String type);

	Personne findByCni(String cni);

}
