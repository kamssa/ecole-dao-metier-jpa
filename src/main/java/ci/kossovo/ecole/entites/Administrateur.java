package ci.kossovo.ecole.entites;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "T_ADMINISTEUR")
@DiscriminatorValue("AD")
public class Administrateur extends Personne {

	private static final long serialVersionUID = 1L;
	private String fonction;

	public Administrateur() {
		super();

	}

	public Administrateur(String nom, String prenom, String fonction) {
		super(nom, prenom);
		this.fonction = fonction;
	}

	public Administrateur(String titre, String cni, String nom, String prenom, String fonction) {
		super(titre, cni, nom, prenom);
		this.fonction = fonction;
	}

	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	@Override
	public String toString() {
		return String.format("Administrateur[%s]", super.toString());
	}

}
