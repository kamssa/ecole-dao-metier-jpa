package ci.kossovo.ecole.entites;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="T_SALE")
public class Sale extends AbstractEntity{

	private static final long serialVersionUID = 1L;

	private String libelle;
	private String description;
	public Sale() {
		
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
	
}
