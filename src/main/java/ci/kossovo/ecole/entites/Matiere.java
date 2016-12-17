package ci.kossovo.ecole.entites;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "T_MATIERE")
public class Matiere extends AbstractEntity {

	private static final long serialVersionUID = 1L;
	private String libelle;
	private String description;

	public Matiere() {
		
	}

	public Matiere(String libelle, String description) {
		super();
		this.libelle = libelle;
		this.description = description;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return String.format("Matiere[%s,%s]" , libelle,description);
	}

	
}
