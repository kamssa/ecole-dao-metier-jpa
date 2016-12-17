package ci.kossovo.ecole.entites;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="T_TYPEEVALUATION")
public class TypeEvaluation extends AbstractEntity {

	private static final long serialVersionUID = 1L;
	private String description;
    private String libelle;

    public TypeEvaluation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TypeEvaluation(String description, String libelle) {
		super();
		this.description = description;
		this.libelle = libelle;
	}
	public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getLibelle() {
	return libelle;
}
public void setLibelle(String libelle) {
	this.libelle = libelle;
}


@Override
public String toString() {
	return String.format("Type_description[%s,%s]" ,libelle,description );
}



}
