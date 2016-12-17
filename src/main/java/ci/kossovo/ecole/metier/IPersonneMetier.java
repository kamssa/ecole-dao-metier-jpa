package ci.kossovo.ecole.metier;

import java.util.List;

import ci.kossovo.ecole.entites.Administrateur;
import ci.kossovo.ecole.entites.Enseignant;
import ci.kossovo.ecole.entites.Etudiant;
import ci.kossovo.ecole.entites.Personne;
import ci.kossovo.ecole.entites.User;

public interface IPersonneMetier extends Imetier<Personne, Long> {
 List<Etudiant>chercherParMartricule(String matricule);
 List<Enseignant>chercherParStatut(String statut);
 List<Administrateur>chercherParFonction(String fonction);
 List<Etudiant>chercherEtudiantParMc(String mc);
 List<Enseignant>chercherEnseignantParMc(String mc);
 List<User>chercherUserParMc(String mc);
 List<Etudiant> listeEtudiants();
 List<User>listeUsers();
 List<Enseignant>listeEnserignant();
 
}
