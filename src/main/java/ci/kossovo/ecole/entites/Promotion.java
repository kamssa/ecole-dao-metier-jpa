package ci.kossovo.ecole.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "T_PROMOTION")
public class Promotion extends AbstractEntity {

	private static final long serialVersionUID = 1L;
	private String libelle;
	private String description;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name= "id_filiere")
	private Filiere filiere;
	
	@Column(name="id_filiere",insertable= false,updatable=false)
	private long idfiliere;

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

	public Filiere getFiliere() {
		return filiere;
	}

	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}

	@Override
	public String toString() {
		return String.format("Promotion[%s,%s]" , libelle,description);
	}

	
}
