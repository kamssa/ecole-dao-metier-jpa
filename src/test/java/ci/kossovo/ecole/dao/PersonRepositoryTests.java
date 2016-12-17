package ci.kossovo.ecole.dao;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import ci.kossovo.ecole.dao.PersonneRepository;
import ci.kossovo.ecole.entites.Administrateur;
import ci.kossovo.ecole.entites.Enseignant;
import ci.kossovo.ecole.entites.Etudiant;
import ci.kossovo.ecole.entites.Personne;

@RunWith(SpringRunner.class)
@DataJpaTest
public class PersonRepositoryTests {
 @Autowired
	private TestEntityManager entityManager;
 @Autowired
 private PersonneRepository personneRepository;
 
 @Test 
 public void findAllEtudiants(){
	this.entityManager.persist(new Personne("Diarra", "Drissa"));
	this.entityManager.persist(new Enseignant("Youssoufi", "mohamed", "Permanent"));
	this.entityManager.persist(new Administrateur("Diarra", "Drissa", "superviseur"));
	this.entityManager.persist(new Etudiant("Diarra", "Drissa", "A0101"));
	List<Etudiant> etudiants = personneRepository.findAllEtudiants();
	assertThat(etudiants.size()).isEqualTo(1);
	
	
  }
 @Test 
 public void findAllEnseignants(){
	 this.entityManager.persist(new Personne("Diarra", "Drissa"));
	 this.entityManager.persist(new Enseignant("Youssoufi", "mohamed", "Permanent"));
	 this.entityManager.persist(new Administrateur("Diarra", "Drissa", "superviseur"));
	 this.entityManager.persist(new Etudiant("Diarra", "Drissa", "A0101"));
	 List<Enseignant> ens = personneRepository.findAllEnseignants();
	 assertThat(ens.size()).isEqualTo(1);
	 
	 
 }
 @Test 
 public void findAllAdministrateurs(){
	 this.entityManager.persist(new Personne("Diarra", "Drissa"));
	 this.entityManager.persist(new Enseignant("Youssoufi", "mohamed", "Permanent"));
	 this.entityManager.persist(new Administrateur("Diarra", "Drissa", "superviseur"));
	 this.entityManager.persist(new Etudiant("Diarra", "Drissa", "A0101"));
	 List<Administrateur> admins = personneRepository.findAllAdministrateurs();
	 assertThat(admins.size()).isEqualTo(1);
	 
	 
 }
 @Test 
 public void trouverPersonneParMc(){
	
	 this.entityManager.persist(new Personne("Diarra", "Drissa"));
	 this.entityManager.persist(new Enseignant("Youssoufi", "mohamed", "Permanent"));
	 this.entityManager.persist(new Administrateur("Diarra", "Drissa", "superviseur"));
	 this.entityManager.persist(new Etudiant("Diarra", "Drissa", "A0101"));
	 List<Personne> pers = personneRepository.findByNomCompletContainingIgnoreCase("D");
	 assertThat(pers.size()).isEqualTo(4);
	 
	 
 }
  
 @Test 
 public void findAllEtudiantByMatricule(){
	this.entityManager.persist(new Etudiant("Diarra", "Drissa", "A0101"));
	Etudiant etudiant = personneRepository.getMatriculeIgnoreCase("A0101");
	assertThat(etudiant.getNom()).isEqualTo("Diarra");
	assertThat(etudiant.getPrenom()).isEqualTo("Drissa");
	
  }
 
 @Test 
 public void retrouverEnseignantParStatut(){
	 this.entityManager.persist(new Enseignant("mohammed", "youssoufi", "permanent"));
	 List<Enseignant> ens = personneRepository.getStautIgnoreCase("PERMANENT");
	 assertThat(ens.size()).isEqualTo(1);
	
	 
 }
 
 @Test 
 public void retrouverAdminParFonction(){
	 this.entityManager.persist(new Administrateur("mohammed", "youssoufi", "superviseur"));
	 List<Administrateur> admins = personneRepository.getFonctionIgnoreCase("superviseur");
	 assertThat(admins.size()).isEqualTo(1);
	 
	 
 }
 @Test 
 public void retrouverParType(){
	 this.entityManager.persist(new Administrateur("mohammed", "youssoufi", "superviseur"));
	 this.entityManager.persist(new Enseignant("Diarra", "Drissa", "permanent"));
	 this.entityManager.persist(new Etudiant("Diarra", "Drissa", "A0101"));
	 this.entityManager.persist(new Personne("Traore", "Abdoulaye" ));
	 List<Personne> etu = personneRepository.findByType("ET");
	 assertThat(etu.size()).isEqualTo(1);
	 List<Personne> ens = personneRepository.findByType("EN");
	 assertThat(ens.size()).isEqualTo(1);
	 List<Personne> admins = personneRepository.findByType("AD");
	 assertThat(admins.size()).isEqualTo(1);
	 List<Personne> pers = personneRepository.findByType("PE");
	 assertThat(pers.size()).isEqualTo(1);
	 List<Personne> pers1 = personneRepository.findByType("PP");
	 assertThat(pers1.size()).isEqualTo(0);
	 
	 
 }
 @Test
  public void testCrudJpaRepository(){
	 this.entityManager.persist(new Administrateur("mohammed", "youssoufi", "superviseur"));
	 this.entityManager.persist(new Enseignant("Diarra", "Drissa", "permanent"));
	 this.entityManager.persist(new Etudiant("sanogo", "Mamadou", "A0101"));
	 this.entityManager.persist(new Personne("Traore", "Abdoulaye" ));
	 List<Personne> pers = personneRepository.findAll();
	 assertThat(pers.size()).isEqualTo(4);
	 Long id = pers.get(0).getId();
	 Personne pe = personneRepository.findOne(id);
	 assertNotNull(pe);
	 pe.setNom("kone");
	 pe=personneRepository.save(pe);
	 assertThat(pe.getNom()).isEqualTo("kone");
	 personneRepository.delete(id);
	 assertThat(personneRepository.findAll().size()).isEqualTo(3);
 }
 
 
}
