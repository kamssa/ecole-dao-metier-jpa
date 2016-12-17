package ci.kossovo.ecole.entites;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "T_ENSEIGNANT")
@DiscriminatorValue("EN")
public class Enseignant extends Personne {

	private static final long serialVersionUID = 1L;
	private String statut;

	public Enseignant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Enseignant(String nom, String prenom, String statut) {
		super(nom, prenom);
		this.statut = statut;
	}

	public Enseignant(String titre, String cni, String nom, String prenom, String statut) {
		super(titre, cni, nom, prenom);
		this.statut = statut;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	@Override
	public String toString() {
		return String.format("Enseignant[%s]", super.toString());
	}
}
