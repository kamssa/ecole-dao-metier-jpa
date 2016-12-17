package ci.kossovo.ecole.entites;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_ETUDIANT")
@DiscriminatorValue("ET")
public class Etudiant extends Personne {

	private static final long serialVersionUID = 1L;

	private String matricule;
	private String statut;
	private String photo;
	@Temporal(TemporalType.DATE)
	private Date dateNaissnce;

	public Etudiant() {

	}

	public Etudiant(String nom, String prenom, String matricule) {
		super(nom, prenom);
		this.matricule = matricule;
	}


	public Etudiant(String nom, String prenom, String matricule, String statut, String photo) {
		super(nom, prenom);
		this.matricule = matricule;
		this.statut = statut;
		this.photo = photo;
	}

	public Etudiant(String titre, String cni, String nom, String prenom, String matricule, String statut) {
		super(titre, cni, nom, prenom);
		this.matricule = matricule;
		this.statut = statut;
	}

	public Date getDateNaissnce() {
		return dateNaissnce;
	}

	public void setDateNaissnce(Date dateNaissnce) {
		this.dateNaissnce = dateNaissnce;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	@Override
	public String toString() {
		return String.format("Etudiant[%s]", super.toString());
	}
}
